
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Ejecicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un código de cinco caracteres y en el caso de salir coloque &&&&& ");
        Scanner leer = new Scanner(System.in);
        String codigo = leer.nextLine();
        boolean validar = false;
        int correcto = 0, incorrecto = 0;
        
        
        do {
            if (codigo.length()== 5){
                validar = true;
                
            }
            
        } while (validar == false );
      if (( codigo.substring(0,1).equalsIgnoreCase("x")) && (codigo.substring(4,5).equalsIgnoreCase("o"))){
          System.out.println(" Correcto "); 
          correcto ++; 
      }
          
        
        
        
//        if (codigo.length()== 5){
        
        
        
    }
    
}
