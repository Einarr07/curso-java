/*Crear una matriz 7x7 y rellenarla de fomra que los elementos de la diagonal principal sean 1 y el resto 0*/
package matrices.ejercicios;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Crear una matriz de enteros de 7x7
        int[][] matriz = new int[7][7];

        // Rellenar la matriz
        for (int i = 0; i < matriz.length; i++) { // Recorremos cada fila
            for (int j = 0; j < matriz[i].length; j++) { // Recorremos cada columna en la fila actual
                if (i == j) {
                    // Si estamos en la diagonal principal (i == j), asignamos 1
                    matriz[i][j] = 1;
                } else {
                    // Si no estamos en la diagonal principal, asignamos 0
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < matriz.length; i++) { // Recorremos cada fila para imprimirla
            for (int j = 0; j < matriz[i].length; j++) { // Recorremos cada columna en la fila actual para imprimir el valor
                System.out.print("["+matriz[i][j]+"]"); // Imprimimos cada valor seguido de un espacio
            }
            System.out.println(); // Salto de línea después de imprimir cada fila
        }
    }
}
