/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("escriba un numero maximo");
        
        int numeromax = leer.nextInt();
        int suma = 0;
        while (numeromax > suma) {            
            
            System.out.println("escriba los numero hasta llegar al maximo");
            
            int numero = leer.nextInt();
            
            suma = suma + numero;
            
        }
       
        System.out.println("llegaste al maximo" + suma);
        
      
    }
    
}
