/* Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (Fusionar) las dos tablas en una tarcera,
* de forma que sigan ordenados*/
package arreglos.ejercicios;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        int arreglo3[] = new int[20];
        boolean creciente = true;

        // Llenar y verificar el primer arreglo
        JOptionPane.showMessageDialog(null, "A continuación llene el primer arreglo");
        do {
            for (int i = 0; i < 10; i++) {
                arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".- Ingrese un número: "));
            }

            // Comprobar si el arreglo está ordenado en forma creciente
            creciente = true; // Resetea la variable
            for (int i = 0; i < 9; i++) { // Revisar hasta el penúltimo
                if (arreglo1[i] > arreglo1[i + 1]) { // Decreciente
                    creciente = false;
                    break;
                }
            }

            if (!creciente) {
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenado de forma " +
                        "creciente, ingrese un nuevo arreglo\n");
            }
        } while (!creciente);

        // Llenar y verificar el segundo arreglo
        JOptionPane.showMessageDialog(null, "A continuación llene el segundo arreglo");
        do {
            for (int i = 0; i < 10; i++) {
                arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".- Ingrese un número: "));
            }

            // Comprobar si el arreglo está ordenado en forma creciente
            creciente = true; // Resetea la variable
            for (int i = 0; i < 9; i++) { // Revisar hasta el penúltimo
                if (arreglo2[i] > arreglo2[i + 1]) { // Decreciente
                    creciente = false;
                    break;
                }
            }

            if (!creciente) {
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenado de forma " +
                        "creciente, ingrese un nuevo arreglo\n");
            }
        } while (!creciente);

        // Fusionar los dos arreglos en uno solo
        int i = 0, j = 0, k = 0;
        while (i < 10 && j < 10) {
            if (arreglo1[i] < arreglo2[j]) {
                arreglo3[k++] = arreglo1[i++];
            } else {
                arreglo3[k++] = arreglo2[j++];
            }
        }

        // Si quedan elementos en el primer arreglo
        while (i < 10) {
            arreglo3[k++] = arreglo1[i++];
        }

        // Si quedan elementos en el segundo arreglo
        while (j < 10) {
            arreglo3[k++] = arreglo2[j++];
        }

        // Mostrar el arreglo fusionado
        StringBuilder resultado = new StringBuilder("El arreglo fusionado y ordenado es:\n");
        for (i = 0; i < 20; i++) {
            resultado.append("[ ").append(arreglo3[i]).append(" ] ");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
