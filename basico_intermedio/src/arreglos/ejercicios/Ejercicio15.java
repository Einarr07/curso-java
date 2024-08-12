/* Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que se
* encuentra. Si no está, indicarlo con un mensaje.*/
package arreglos.ejercicios;

import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        int arreglo[], numero;
        arreglo = new int[10]; // Creamos el arreglo con 10 posiciones
        boolean creciente;

        JOptionPane.showMessageDialog(null, "A continuación ingrese los números del arreglo" +
                "de forma ordenada");
        do {
            creciente = true; // Inicialmente, asumimos que está ordenado en forma creciente

            // Pedimos el arreglo
            for (int i = 0; i < 10; i++) {
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ".- Ingrese un número"));
            }

            // Verificamos si el arreglo está ordenado de forma creciente
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] > arreglo[i + 1]) { // Decreciente
                    creciente = false;
                    break;
                }
            }

            if (!creciente) {
                JOptionPane.showMessageDialog(null, "El arreglo está desordenado, " +
                        "ingrese de nuevo los elementos del arreglo");
            }
        } while (!creciente);

        // Pedimos el número a buscar
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar en el arreglo: "));

        // Buscamos el número en el arreglo
        int i = 0;
        while (i < 10 && arreglo[i] < numero) {
            i++;
        }

        if (i == 10 || arreglo[i] != numero) { // Hemos recorrido todo el arreglo y no encontramos el número
            JOptionPane.showMessageDialog(null, "Número no encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición " + i);
        }
    }
}
