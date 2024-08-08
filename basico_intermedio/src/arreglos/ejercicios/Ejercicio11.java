/*Leer 5 elementos númericos que se introducirán ordenados de forma creciente. Estos los guardaremos en una tabla
* de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitioNumero = 0, j = 0;

        System.out.println("Llenar el arreglo");
        do {
            // Llenar el arreglo
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ".- Ingrese un número: ");
                arreglo[i] = entrada.nextInt();
            }

            // Comprobar si el arreglo está ordenado en forma creciente
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] > arreglo[i + 1]) { // Decreciente
                    creciente = false;
                    break;
                } else {
                    creciente = true;
                }
            }

            if (!creciente) {
                System.out.println("El arreglo no está ordenado de forma creciente, ingrese un nuevo arreglo\n");
            }
        } while (!creciente);

        System.out.print("\nIngrese un nuevo elemento para el arreglo: ");
        numero = entrada.nextInt();

        // Verificamos en qué posición va el número
        while (j < 5 && arreglo[j] < numero) {
            sitioNumero++;
            j++;
        }

        // Trasladamos una posición en el arreglo a los elementos que van detrás del número
        for (int i = 4; i >= sitioNumero; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        // Colocamos el número que inserto el usuario
        arreglo[sitioNumero] = numero;

        System.out.print("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println();
    }
}

