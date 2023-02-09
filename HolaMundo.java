
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una variable Scanner que se utiliza, para leer datos de usuario
        Scanner leer = new Scanner (System.in);
        // Se crea una variabe cadena ( String ) que se utiliza, para leer datos del usuario 
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println( " Ingresa tu nombre: ");
        // Leemos el nombre de la pesona en la variable nombre
        nombre = leer.next();
        // mostramos por la consola un saludo personaizado
        System.out.println( " Hola Mundo! soy " + nombre + " y estoy programado en Java :) ");
    }
    
}
