import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try {
            // Especifica la ruta del archivo que deseas leer
            String rutaArchivo = "TEST.txt";

            // Crea un objeto File para el archivo CSV
            File archivo = new File(rutaArchivo);

            // Crea un Scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);
            String cantAreas = scanner.nextLine();

            int i = Integer.parseInt(cantAreas);
            String[][] areasYCarreras = new String[i][]; //Matriz de carreras por area

            //Guardamos en un arreglo las areas junto a sus carreras, siendo el valor 0 el Area y el resto las carreras
            for (int j = 0; j<i ; j++ ) {
                if (scanner.hasNextLine()){
                    String lin = scanner.nextLine();
                    String[] carreras = lin.split(";");
                    areasYCarreras[j] = carreras;
                } else {
                    break;
                }
            }
            
            int cantPreguntas = cantidadPreguntas(rutaArchivo);
            int[] controladorResultados = new int[cantPreguntas];


            // Lee cada línea del archivo
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();

                if (linea.isEmpty()) {
                    continue;

                } else {
                    // Divide la línea en elementos separados por comas
                    String[] elementos = linea.split(",");
                    
                    

                    // Imprime cada elemento
                    for (String elemento : elementos) {
                        System.out.print(elemento + " ");
                    }
                    System.out.println(); // Imprime una nueva línea después de cada línea del archivo
                }
            }

            // Cierra el Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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


