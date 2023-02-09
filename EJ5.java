/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro.java;

import java.util.Scanner;

/**
 *
 * @author Eduardo Carrizo
 * 
 * 5. Escribir un programa que lea un número entero por teclado 
   y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
   Nota: investigar la función Math.sqrt().
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // float num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        float num = leer.nextFloat();
        
        System.out.println("El doble del valor ingresado es: "+(int)(num*2));
        System.out.println("El triple del valor ingresado es: "+(double)(num*3));
        System.out.println("El triple del valor ingresado es: "+(float)(num*3));
        System.out.println("La raiz cuadrada es: "+Math.sqrt(num));
    }
    
}
