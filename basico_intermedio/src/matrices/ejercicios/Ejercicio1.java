/*Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.*/
package matrices.ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        boolean simetrica = true;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Columnas "));

        matriz = new int[nFilas][nColumnas];

        System.out.println("Ingrese una matriz: ");
        for(int i = 0; i < nFilas; i++){
            for (int j = 0; j < nColumnas; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        if (nFilas == nColumnas){
            int i, j;
            i = 0;
            while ((i < nFilas) && (simetrica == true)){
                j = 0;
                while ((j < i) && (simetrica == true)){
                    if (matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if(simetrica == true){
                JOptionPane.showMessageDialog(null,"La matriz es simetrica");
            }else {
                JOptionPane.showMessageDialog(null, "La matriz no es siemtrica");
            }
        }else {
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
    }
}
