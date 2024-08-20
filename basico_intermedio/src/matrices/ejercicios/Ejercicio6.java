/*Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda*/
package matrices.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz1[][] = new int[5][9]; // Matriz de tamaño 5x9
        int matriz2[][] = new int[9][5]; // Matriz de tamaño 9x5 (transpuesta)

        // Cargar la primera matriz (5x9) con valores proporcionados por el usuario
        System.out.println("Ingrese los valores para la matriz de 5x9:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        // Transponer la primera matriz en la segunda
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }

        // Imprimir la primera matriz (5x9)
        System.out.println("\nMatriz original (5x9):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("[" + matriz1[i][j] + "] ");
            }
            System.out.println();
        }

        // Imprimir la matriz transpuesta (9x5)
        System.out.println("\nMatriz transpuesta (9x5):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matriz2[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
