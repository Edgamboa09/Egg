/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SumatoriaConSalto {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public static void main(String[] args) {
         int num;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println(" Ingrese un número natural positivo ");
            num = leer.nextInt();
            if (num >1000){
                System.out.println("Este programa podría tardar, ¿está seguro? (s/n)");
                String confirma = leer.next();
                if(confirma.equals("s")) {
                    break;
                    
                }
            }
            
        }while (num <= 0 || num > 1000);
        /*
        for (<inicialización>; <expresión_terminación>; <paso/incremento/decremento>) {
        <sentencia>
        }
        */
        int j, suma;
        for(int i=1 ; i<=num ; i++){
        
            if( i%2 != 0 )
            continue;
            
            suma = 0;
            j = 1;

            while(j <=i && suma < 1000 ) {
                suma += j;
                
            }
        System.out.println("La suma de los " + i + "números naturales es: " + suma);
    }
        
    }
    
}

    
    

