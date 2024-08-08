/* Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo (N es
* digitado por el usuario)*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int desplazamiento;

        System.out.println("-------------------");
        System.out.println("|Llenar el arreglo|");
        System.out.println("-------------------");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ".- Ingrese un número: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Ingrese cuantos espacios quiere desplazar: ");
        desplazamiento = entrada.nextInt();

        // Aseguramos que el desplazamiento esté dentro de los límites válidos
        desplazamiento = desplazamiento % 10;

        if (desplazamiento > 0) {
            // Crear un arreglo temporal para almacenar los elementos desplazados
            int[] temp = new int[desplazamiento];

            // Guardar los últimos 'desplazamiento' elementos en el arreglo temporal
            for (int i = 0; i < desplazamiento; i++) {
                temp[i] = arreglo[arreglo.length - desplazamiento + i];
            }

            // Desplazar los elementos restantes hacia la derecha
            for (int i = arreglo.length - 1 - desplazamiento; i >= 0; i--) {
                arreglo[i + desplazamiento] = arreglo[i];
            }

            // Colocar los elementos del arreglo temporal en las primeras posiciones
            for (int i = 0; i < desplazamiento; i++) {
                arreglo[i] = temp[i];
            }
        }

        System.out.println("---------------------");
        System.out.println("|El nuevo arreglo es|");
        System.out.println("---------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " Número: " + arreglo[i]);
        }
    }
}
