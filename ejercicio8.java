
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gian Franco
 */
public class NuevoCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
        System.out.println("Ingrese una palabra de 8 dígitos: ");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
        //int longitud = palabra.length();
        if (palabra.length()== 8){
         System.out.println("Su palabra tiene 8 digitos");
        } else {
            System.out.println("Su número no tiene 8 dígitos");
        }
        
        
        
    }
    
}
