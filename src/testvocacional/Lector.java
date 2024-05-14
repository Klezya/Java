package testvocacional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lector {

    public static String rutaArchivo = "src\\resource\\config.txt";
    public static String[][] areasYCarreras = null;
    public static int[][] controladorResultados = null;
    public static String[] preguntas = null;
    public static int numPregunta = 0;
    public static int[] ordenCarreras = null;
    public static int cantAreas = 0;

    public Lector() {
        iniciarLector();
    }

    public static void iniciarLector() {
        try {
            //Abrir el archivo con las preguntas
            File archivo = new File(rutaArchivo);

            //Crear un scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);
            String aux = scanner.nextLine(); //Leemos cuantas areas existes
            cantAreas = Integer.parseInt(aux); //Definimos las areas en una variable

            ordenCarreras = new int[cantAreas]; //Matriz que tendra los resultados de las carreras ordenados de mayor a menos (para entregar resultados)
            areasYCarreras = new String[cantAreas][]; //Matriz de carreras por area

            //Guardamos en un arreglo las areas junto a sus carreras, siendo el valor 0 el Area y el resto las carreras
            for (int j = 0; j<cantAreas ; j++ ) {
                if (scanner.hasNextLine()){
                    String lin = scanner.nextLine();

                    if (lin.isEmpty()) { //Si existe alguna linea vacia no generara errores
                        j--;
                        continue;
                    } else {
                        String[] carreras = lin.split(";");
                        areasYCarreras[j] = carreras;
                    }

                } else {
                    break;
                }
            }
            
            //Manejamos el arreglo de las respuestas 
            int cantPreguntas = cantidadPreguntas(rutaArchivo);
            controladorResultados = new int[cantPreguntas][2]; //Arreglo de los resultados controladorResultados[NumPregunta -1] [0=Respuestas(1 o 0),1=AreaCorrespondiente(1 - 5)]
            preguntas = new String[cantPreguntas];
            int count = 0;

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] elementos = linea.split(";");
                if (linea.isEmpty()) {
                    continue;
                } else {
                    elementos[2] = elementos[2].replaceAll("\\s",""); //Eliminar espacios vacios para transformar a INT el valor del area
                    controladorResultados[count][1] = Integer.parseInt(elementos[2]); //Definimos que areas estan relacionadas a que resultados
                    preguntas[count] = elementos[1]; //Guardamos la pregunta ("String") en el arreglo preguntas
                    count++; //Seguimos
                }
            }

            //Cerrar el scanner IMPORTANTE
            scanner.close();

            //Bucle para revisar arreglos
            /*int k = 1;
            for (String pregunta : areasYCarreras[1]) {
                System.out.println( k + ": " + pregunta);
                k++;
            }*/

        } catch (FileNotFoundException e) { //Manejar error
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int cantidadPreguntas(String rutaArchivo){
        try {
            File archivo = new File(rutaArchivo);
            Scanner scanner = new Scanner(archivo);
            String linea = scanner.nextLine();
            while (scanner.hasNextLine()) {
                linea = scanner.nextLine();
            }
            String[] elementos = linea.split(";");
    
            scanner.close();
            return Integer.parseInt(elementos[0]);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public static void calcularResultados() {
        for (int[] respuesta : controladorResultados) {
            if (respuesta[0] == 1) {
                int numArea = respuesta[1]; //Obtenemos a que area corresponde la respuesta
                ordenCarreras[numArea-1] += 1; //Se le resta 1 porque los indices son del 0 al 4, y las areas del 1 al 5 
            }
        }

        //Este codigo ordena el arreglo aux de menor a mayor (de mayor a menor nose como se hace)
        Arrays.sort(ordenCarreras); 
        System.out.println(Arrays.toString(ordenCarreras));
    }

    
}
