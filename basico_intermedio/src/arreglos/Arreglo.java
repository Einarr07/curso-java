/*
 * ¿Qué es un arreglo?
 * Un array (arreglo) en Java es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo.
 * El tamaño de los arrays se declara en un primer momento y no se puede cambiar luego durante la ejecución del programa.
 */

package arreglos;

import javax.swing.*;
import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        // Sección 1: Inicialización de arreglos y acceso a sus elementos

        // Forma número 1: Inicializar un array y asignar valores individualmente
        int[] numeros = new int[3];
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        System.out.println("Elementos del array numeros:");
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

        // Forma número 2: Inicializar un array con valores directamente
        int[] numeros2 = {5, 7, 9, 10};

        System.out.println("-------------------");
        System.out.println("| Impresión numeros2 |");
        System.out.println("-------------------");
        for (int j = 0; j < 4; j++) {
            System.out.println(numeros2[j]);
        }

        // Sección 2: Llenar un arreglo con datos ingresados por el usuario

        System.out.println("-------------------");
        System.out.println("| Llenar un arreglo |");
        System.out.println("-------------------");

        Scanner entrada = new Scanner(System.in);
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de " +
                "elementos que estarán dentro del arreglo"));

        char[] letras = new char[nElementos];

        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Ingrese un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }

        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(letras[i] + " ");
        }

        // Sección 3: Uso del bucle for-each

        System.out.println("---------------");
        System.out.println("| Bucle for each |");
        System.out.println("---------------");

        String[] nombres = {"Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis", "Roberto", "Flor", "Jessica"};

        // Impresión de los elementos del array usando un bucle for tradicional
        System.out.println("Impresión con bucle for:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // Impresión de los elementos del array usando un bucle for-each
        System.out.println("--------------------------------");
        System.out.println("Impresión con el bucle for-each:");
        for (String nombre : nombres) {
            System.out.print(nombre + " ");
        }
    }
}
