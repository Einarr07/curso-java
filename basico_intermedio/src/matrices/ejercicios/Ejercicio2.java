/*Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.*/
package matrices.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int suma[][] = new int[3][3];

        // Matriz 1
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Matriz 1 ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("La primera matriz es: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        // Matriz 2
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("Matriz 2 ["+i+"]["+j+"]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        System.out.println("La segunda matriz es: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println();
        }

        // Sumar las matrices
        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3; j++){
                suma[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }

        // Impresión suma de la matriz
        System.out.println("La suma de las matrices es: ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print("[" + suma[i][j] + "]");
            }
            System.out.println();
        }
    }
}
