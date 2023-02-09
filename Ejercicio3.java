
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
        /*String Mayus = frase.toUpperCase();
        String min = frase.toLowerCase();*/
                
       /* System.out.println(Mayus);
        System.out.println(min);*/
       
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
