/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Beatriz
 */
public class guia65raiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingresa un número.");
        Scanner leer = new Scanner(System.in);
        double num = leer.nextDouble();
        
        System.out.println("El doble del número ingresado es: "+num*2);
        System.out.println("El triple del número ingresado es: "+num*3);
        System.out.println("La raíz cuadrada del número ingresado es: "+Math.sqrt(num));
        
    }
    
}
