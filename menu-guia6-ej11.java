
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Beatriz
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Escriba un número.");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();

        System.out.println("Escriba otro número.");
        int num2 = leer.nextInt();
        
        int opcion = 0;
        //String salir = "";
        boolean validar = false;

        do {  
            System.out.println("Menú\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción:\n");
        
        opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("La división es: "+(num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salir = leer.next();
                    if(salir.equalsIgnoreCase("S")){
                        validar = true;
                        break;
                    } 
//                    else {
//                        continue;
//                    }
                   
                default:
                    System.out.println("El número ingresado no es válido.");
                    break;
                    
            }
            
        } while(validar == false);
//while (!salir.equalsIgnoreCase("S"));

        

    }

}
