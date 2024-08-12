/* Es una manera muy natural de ordenar para ser un humano, y puede usarse fácilmente para ordenar un mazo de cartas
* numeradas en fomra arbitraria. Requiere O(n^2) operaciones para ordenar una lista de elementos*/
package ordenamientos;

import javax.swing.*;
import java.util.Scanner;

public class PorInsercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo; // Declaración del arreglo que almacenará los elementos a ordenar
        int elementos; // Número de elementos que tendrá el arreglo
        int posicion, auxiliar; // Variables auxiliares para el ordenamiento

        // Se solicita al usuario el número de elementos que desea en el arreglo
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo"));

        arreglo = new int[elementos]; // Inicialización del arreglo con el tamaño dado por el usuario

        // Se solicita al usuario que ingrese cada uno de los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < elementos; i++) {
            System.out.print((i+1) + ".- Ingrese un número: ");
            arreglo[i] = entrada.nextInt(); // Se almacenan los elementos ingresados en el arreglo
        }

        // Algoritmo de Ordenamiento por Inserción
        for (int i = 0; i < elementos; i++) {
            posicion = i; // Se inicia la posición actual en el índice i
            auxiliar = arreglo[i]; // Se guarda el valor actual del arreglo en una variable auxiliar

            // Se mueve hacia la izquierda hasta encontrar la posición correcta para el elemento actual
            while (posicion > 0 && arreglo[posicion - 1] > auxiliar) {
                arreglo[posicion] = arreglo[posicion - 1]; // Se desplaza el elemento hacia la derecha
                posicion--; // Se decrementa la posición
            }

            arreglo[posicion] = auxiliar; // Se coloca el elemento en su posición correcta
        }

        // Salida del arreglo ordenado en orden ascendente
        System.out.print("\nArreglo ordenado en orden ascendente: ");
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        // Salida del arreglo ordenado en orden descendente
        System.out.print("\nArreglo ordenado en orden descendente: ");
        for (int i = (elementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

        // Añadimos una nueva línea al final para mejorar la legibilidad de la salida
        System.out.println();
    }
}
