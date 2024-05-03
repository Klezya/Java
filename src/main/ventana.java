package src.main;
import javax.swing.*;
import java.awt.Color;

public class ventana extends JFrame{

    //Clase con las configuraciones basicas de nuestra ventana
    //En lugar de crear un FRAME creamos una VENTANA, ya configurada :D
    public ventana(){
        this.setTitle("Tarea 2 Paradigmas de Programacion"); //Seleccionar titulo de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Funcion que realizara la X
        this.setResizable(false); //Permitir el resize de la app
        this.setSize(450,450); //Configurar tamaño de la ventana
        this.setVisible(true); //Aplicar visibilidad a la ventana

        ImageIcon icon = new ImageIcon("src/resources/logo.png"); //Crear un icono con swing
        this.setIconImage(icon.getImage()); //Aplicar el icono
        this.getContentPane().setBackground(Color.LIGHT_GRAY); //aplicar color al fondo
    }

}
