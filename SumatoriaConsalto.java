/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoriaconsalto;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SumatoriaConsalto {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("IncompatibleEquals")
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingresa un número entero positivo");
            num = leer.nextInt();
            if (num > 1000){
                System.out.println("Este programa podría tardar, ¿estás seguro' (s/n)");
                if (confirma.equals("s")) {
                    break;     // break: detiene el bucle y continua con el próximo bloque
                }
            }
        }
        
    } while (num <= 0 || num > 100 );
    /*
    for (<inicialización; <expresión_ternación; <paso/incremento/decremento>) {
    }
    */
    int j, suma;
    for(int i=1 ; 1<num ; i++) {
    
}
