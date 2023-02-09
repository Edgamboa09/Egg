/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncuentaCondicionales;

import java.util.Scanner;



/**
 *
 * @author user
 */
public class Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.print(" Clasica la peli de 1 a 5 estrellas ");
        opinion = leer.nextInt();
        
        if (opinion >= 1 &&  opinion <= 5) {
            switch (opinion) {
            case 1:
            case 2:
            System.out.print(" Nos sentimos apenados que no hayas disfrutado la peli..");
            break;
            case 3:
            System.out.print(" Has caliicado la peli como buena :)");
            break;
            case 4:
            System.out.print(" Has caliicado la peli como buena  ");
            break;
            case 5:
                System.out.print(" Fantastico que hayas disfrutado la pelicula ");
                break;
                // El equivalente al caso del * Otro Modo* es el defaul*
                //defaul
                //<acciones>
            }
        }else if (opinion < 0 ) {
            System.out.print(" ¿ Una opinión negativa? , ¿ Tan mala fue la peli? ");
        }else if (opinion == 0 ) {
            System.out.print(" El valor " + opinion + " no es valido y no se tomara en cuenta. :(");
        }else {
            System.out.print(" ¡WOW Se te fue de las manos con la calificación! :D");
        }
            
            
        }
           
            
        }
        
    
    

