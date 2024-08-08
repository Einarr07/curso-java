/*Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posción hacia abajo:
* el primero pasa a ser el segundo, el segundo pasa a hacer el tercero y así sucesivamente. El último pasa a ser el
* primero.*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;

        System.out.println("-------------------");
        System.out.println("|Llenar el arreglo|");
        System.out.println("-------------------");

        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+ ".- Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
        }

        ultimo = arreglo[9]; // Guardamos el ultimo elemento del arreglo

        for (int i = 8; i >= 0;i--){ // Avanzar una posición abajo en el arreglo
            arreglo[i+1] = arreglo[i];
        }

        arreglo[0] = ultimo; // Colocamos el ultimo elemento como primero

        System.out.println("---------------------");
        System.out.println("|El nuevo arreglo es|");
        System.out.println("---------------------");

        for (int i = 0; i < 10; i++){
            System.out.println(i+" Número: " + arreglo[i]);
        }
    }
}
