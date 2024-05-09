/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testvocacional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author sweet
 */
public class TestVocacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileReader archivo;
        BufferedReader lector;

        try{
            archivo = new FileReader("src\\resource\\a.txt");
            if(archivo.ready()){
                lector = new BufferedReader(archivo);
                String cadena;
                while((cadena = lector.readLine()) != null){
                    System.out.println(cadena);
                }
            }
            else{
                System.out.println("El archivo está vacío");
            }
        }
        catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }    
}
