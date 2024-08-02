/*Leer los datos correspondiente a dos tablas de 12 elementos numéricos y mezclarlos en una tercera de forma:
* 3 de la tabla A, 3 de la tabla B, otros 3 de A, otros 3 de B, etc.*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];

        // Pedimos el arreglo A
        System.out.println("---------------------------");
        System.out.println("|Ingrese el primer arreglo|");
        System.out.println("---------------------------");

        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ".- Ingrese el número: ");
            a[i] = entrada.nextInt();
        }

        // Pedimos el arreglo B
        System.out.println("----------------------------");
        System.out.println("|Ingrese el segundo arreglo|");
        System.out.println("----------------------------");

        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + ".- Ingrese el número: ");
            b[i] = entrada.nextInt();
        }

        // Mezclamos los arreglos
        int j = 0;
        for (int i = 0; i < 12; i += 3) {
            // Los 3 primeros del a
            for (int k = 0; k < 3; k++) {
                c[j++] = a[i + k];
            }
            // Los 3 primeros del b
            for (int k = 0; k < 3; k++) {
                c[j++] = b[i + k];
            }
        }

        // Impresión
        System.out.println("-----------");
        System.out.println("|Resultado|");
        System.out.println("-----------");

        for (int i = 0; i < 24; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

