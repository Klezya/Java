package testvocacional;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lector {

    public static String[][] areasYCarreras = null;
    public static int[][] controladorResultados = null;
    public static String[] preguntas = null;
    public static int numPregunta = 0;

    public Lector() {
        iniciarLector();
    }

    public static void iniciarLector() {
        try {
            //Abrir el archivo con las preguntas
            String rutaArchivo = "src\\resource\\config.txt";
            File archivo = new File(rutaArchivo);

            //Crear un scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);
            String cantAreas = scanner.nextLine();
            int i = Integer.parseInt(cantAreas);

            areasYCarreras = new String[i][]; //Matriz de carreras por area

            //Guardamos en un arreglo las areas junto a sus carreras, siendo el valor 0 el Area y el resto las carreras
            for (int j = 0; j<i ; j++ ) {
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
            controladorResultados = new int[2][cantPreguntas]; //Arreglo de los resultados controladorResultados[0=Respuestas(1 o 0),1=AreaCorrespondiente(1 - 5)] [NumPregunta -1]
            preguntas = new String[cantPreguntas];
            int count = 0;

            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] elementos = linea.split(";");
                if (linea.isEmpty()) {
                    continue;
                } else {
                    elementos[2] = elementos[2].replaceAll("\\s",""); //Eliminar espacios vacios para transformar a INT
                    controladorResultados[1][count] = Integer.parseInt(elementos[2]);
                    preguntas[count] = elementos[1];
                    count++;
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
}
