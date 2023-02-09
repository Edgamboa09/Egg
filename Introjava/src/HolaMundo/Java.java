/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolaMundo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una variable Scanner que se utiliza para leer datos del usuario 
        Scanner leer = new Scanner(System.in);
        // se crea una variable cadena (String) que se utiliza para leer dtos del usuario
        String nombre;
        // muestra un mensaje por pantalla
        System.out.print("Ingresa tu nombre: ");
        // leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        // mostramos por consola un saludo personalizado
        System.out.print("Hola mundo! soy " + nombre + " y estoy programando en Java!");
        
    }
    
}
