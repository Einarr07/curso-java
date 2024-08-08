/*Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9 ). Eliminar el elemento
* situado en la posición dada sin dejar huecos*/
package arreglos.ejercicios;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        int arreglo[] = new int[10];

        // Leer los 10 elementos del arreglo
        for (int i = 0; i < 10; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " + (i + 1)));
        }

        // Solicitar la posición a eliminar
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del elemento a eliminar (0-9):"));

        // Validar que la posición esté en el rango correcto
        if (posicion < 0 || posicion > 9) {
            JOptionPane.showMessageDialog(null, "Posición inválida. Debe estar entre 0 y 9.");
            return;
        }

        // Eliminar el elemento desplazando los elementos hacia la izquierda
        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }
        arreglo[9] = 0;  // Opcional: Colocar 0 en la última posición, ya que se ha eliminado un elemento

        // Construir el mensaje para mostrar el arreglo final
        StringBuilder arregloFinal = new StringBuilder("El nuevo arreglo es:\n");
        for (int i = 0; i < 9; i++) { // Solo mostramos los primeros 9 elementos, ya que uno fue eliminado
            arregloFinal.append(arreglo[i]).append(" ");
        }

        // Mostrar el arreglo final en una sola pantalla
        JOptionPane.showMessageDialog(null, arregloFinal.toString());
    }
}

