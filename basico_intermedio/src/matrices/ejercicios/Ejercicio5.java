/*Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y cada columna.*/
package matrices.ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        int sumaFilas[], sumaColumnas[];

        // Solicitar tamaño de la matriz
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas de la matriz"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas de la matriz"));
        matriz = new int[nFilas][nColumnas];

        // Crear arrays para almacenar la suma de filas y columnas
        sumaFilas = new int[nFilas];
        sumaColumnas = new int[nColumnas];

        // Llenar la matriz con valores ingresados por el usuario
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Imprimir la matriz
        System.out.println("La matriz ingresada es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        // Sumar las filas y columnas
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                sumaFilas[i] += matriz[i][j]; // Sumar valores de cada fila
                sumaColumnas[j] += matriz[i][j]; // Sumar valores de cada columna
            }
        }

        // Mostrar la suma de cada fila
        System.out.println("\nSuma de las filas:");
        for (int i = 0; i < nFilas; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        // Mostrar la suma de cada columna
        System.out.println("\nSuma de las columnas:");
        for (int j = 0; j < nColumnas; j++) {
            System.out.println("Columna " + (j + 1) + ": " + sumaColumnas[j]);
        }
    }
}
