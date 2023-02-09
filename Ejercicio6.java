/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese porfavor un numero");
        
       int num1 = leer.nextInt();
       
        if (num1 % 2 == 0) {
            System.out.println("Es un numero par");
            
            
            
        }
        else {
            System.out.println("es un numero impar");
        }
        
        
        
    }
    
}
