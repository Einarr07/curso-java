package matrices;

import javax.swing.*;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        // Forma manual
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < 3; i++){ // Número de filas
            for(int j = 0; j < 3; j++){ // Número de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        // Forma con la que interactua el usuario
        int matriz2[][], nFilas, nColumnas;
        Scanner entrada = new Scanner(System.in);
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas"));
        matriz2 = new int[nFilas][nColumnas];

        System.out.println("Ingrese la matriz: ");
        for (int i = 0; i < nFilas; i++){
            for(int j = 0; j < nColumnas; j++){
                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        // Impresión
        System.out.println("La matriz es: ");
        for(int i = 0; i < nFilas; i++){ // Número de filas
            for(int j = 0; j < nColumnas; j++){ // Número de columnas
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
