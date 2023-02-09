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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingresa la contraseña");
        
        String frase = leer.nextLine();
        
        
        
        if (frase.equals("eureka")){

        System.out.println("Es correcto");

    } 
        else {
            System.out.println("es incorrecto");
        }
          
}
}
    



    
   
    


