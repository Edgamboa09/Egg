/*
Realizar una multiplicaciónn de un vector por una matriz
Dado un vector 1xN y una matriz NxM el resultado  del producto es 1xM
Ej Vector 1x2 * matriz 2x3 = producto 1x3

v= |3,5| * m =|4,8,6| = 3*4+5*2,3*8+5*1,3*6+5*7| = |22,29,53|
              |2,1,7|    

*/
package Egg;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ProductoVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración  y creación de un vector
        // tipo [ ] nombreVector = new tipo[tamaño];
        
        //declarar un arreglo de una dimensión
        int [] vector;
        // crear en memoria (construir/dimensionar).con el valor por defecto (cero para los enteros)
        vector = new int[2];
        // Los dos pasos en una linea 
        int[] producto = new int[3];
        // Declaración y creación de una matriz
        //tipo [] [] nombreMatriz = new tipo[Filas][Columnas]
        
        //Declaración e inclinación con valores predeterminados
        int[][] matriz = {{4, 8 , 6 }, {2, 1, 7}};
        //Declaración y creación de arreglos genéreicos
        //tipo [][]...[]nombreAreglo = new tipo [cardinalida 1] [cardinalida 2] [cardinalida N]
        System.out.println(" Ingrese los valores de vector de tamaño" + vector.length+ ":" );
        Scanner leer = new Scanner(System.in);
        // int= 0 porque los subíndices de los arreglos Java inican en cero
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]= ");
            //acceder al valor i del vector
            vector [i] = leer.nextInt();
            
            
            
        }
        
    // multiplicar el vector por la matriz 
    int sum;
    //...para cada columna de matriz
        for (int j = 0; j < matriz[0]. length; j++) {
            sum = 0;
            //...recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j];
                
                
            }
            
            producto[j] = sum;
        }
         
        String aux = "";
        //mostrar vector
        System.out.println("*vector: ");
        //bucle for mejorado (enhanced)
        //for (tipo elemento : arreglo)
        for(int elemento: vector){
            aux = aux + "   " + elemento;
        }
        System.out.println(aux);
        //mostrar matriz
        System.out.println("/n*Matriz: ");
        //para cada fila de matriz
        for (int [] fila : matriz) {
            aux = "";
            // para cada elemento de fila
            for(int elemento: fila){
                aux += "  " + elemento;                                       
            }
               System.out.println(aux);                  
                         
        }
        //mostrar resultado
        aux= "";
        System.out.println("/n*Vector x Matriz:");
        for(int elemento: producto){
            aux += "  " + elemento;
            System.out.print(aux);
        }
    }
    
}
