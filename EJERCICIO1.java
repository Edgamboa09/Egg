
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  Scanner leer = new Scanner(System.in);     
  
        System.out.println("Ingrese porfavor el primer numero");
  int num1 = leer.nextInt();
        System.out.println("Ingrese porfavor el segundo numero");
  int num2 = leer.nextInt();
  int suma = num1+num2;
        System.out.println("la suma de los numeros es "+suma);
    }
    
}
