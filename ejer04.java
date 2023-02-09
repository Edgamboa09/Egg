
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilo
 */
public class ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese los grados centígrados");
        Scanner leer = new Scanner(System.in);
        double c = leer.nextDouble();
        //double f = 32 + (9 * c / 5);
        //System.out.println("la conversión a Fahrenheit es: "+f);
        System.out.println("la conversión a Fahrenheit es: "+(32 + (9 * c / 5)));
    }
    
}
