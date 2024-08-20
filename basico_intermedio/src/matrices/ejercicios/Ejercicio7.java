/*Crear una matriz "marco" de tamaño 5x5: Todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1.
* Mostrarla*/
package matrices.ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        // Rellenando la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) { // Bordes
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Mostrando la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
