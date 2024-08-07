/*Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números. Después
* se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];

        // Leer los primeros 8 números
        for(int i = 0; i < 8; i++){
            System.out.print((i+1)+".- Ingrese un número: ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar los números ingresados
        System.out.println("--------------------");
        System.out.println("|Números ingresados|");
        System.out.println("--------------------");
        for (int i = 0; i < 8; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.print("Ingrese un número para insertar: ");
        int numero = entrada.nextInt();

        int posicion;
        do{
            System.out.print("Ingrese la posición entre 1 y 10 donde desea insertar el número: ");
            posicion = entrada.nextInt();
        }while (posicion < 1 || posicion > 10);

        // Ajustar la posición para el índice del arreglo (0-9)
        posicion--;

        // Desplazar los elementos desde la posición indicada hacia la derecha
        for (int i = 9; i > posicion; i--){
            numeros[i] = numeros[i - 1];
        }

        // Insertar el nuevo número en la posición indicada
        numeros[posicion] = numero;

        // Mostrar el arrelgo después de la inserción
        System.out.println("--------------------------------");
        System.out.println("|Arreglo después de la inseción|");
        System.out.println("--------------------------------");
        for (int i = 0; i < 10; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
