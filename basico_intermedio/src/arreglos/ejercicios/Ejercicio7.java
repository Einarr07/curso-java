/*Leer por teclado una sserie de 10 números enteres. La aplicación debe indicarnos si los números están ordenados de forma
* creciente, decreciente, o si están desordenados.*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;

        System.out.println("Lennar el arreglo");;
        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+".- Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
        }

        for(int i = 0; i < 9; i++){
            if(arreglo[i] < arreglo[i+1]){ // Creciente 1-2-3-4-5...
                creciente = true;
            }

            if (arreglo[i] > arreglo[i+1]){ // Decreciente 5-4-3-2-1
                decreciente = true;
            }
        }

        if (creciente == true && decreciente == false){
            System.out.println("\nEl arreglo esta en forma creciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("\nEl arreglos esta de forma decreciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("\nEl arreglo esta desordenado");
        }else {
            System.out.println("\nTodos los números son iguales");
        }
    }
}
