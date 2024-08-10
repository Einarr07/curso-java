/*
 * Leer 10 enteros en un arreglo. Guardar en otro arreglo los elementos pares
 * de la primera, y a continuación, los elementos impares.
 */

package arreglos.ejercicios;

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        int[] arreglo = new int[10]; // Creamos el arreglo para 10 elementos enteros
        int conteoPares = 0, conteoImpares = 0;

        // Llenamos el arreglo y contamos pares e impares
        for (int i = 0; i < 10; i++) {
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del elemento " + (i + 1)));

            if (arreglo[i] % 2 == 0) { // Si el número es par
                conteoPares++;
            } else { // Si el número es impar
                conteoImpares++;
            }
        }

        int[] par = new int[conteoPares]; // Arreglo para almacenar los números pares
        int[] impar = new int[conteoImpares]; // Arreglo para almacenar los números impares

        conteoPares = 0;
        conteoImpares = 0;

        // Distribuimos los números en los arreglos correspondientes
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                par[conteoPares++] = arreglo[i];
            } else {
                impar[conteoImpares++] = arreglo[i];
            }
        }

        // Construimos el mensaje de salida
        StringBuilder arregloMensaje = new StringBuilder();
        arregloMensaje.append("El arreglo completo y sin modificar es:\n");
        for (int i = 0; i < 10; i++) {
            arregloMensaje.append("[ ").append(arreglo[i]).append(" ] ");
        }
        arregloMensaje.append("\n------------------------------------------------------------");

        arregloMensaje.append("\n\nEl arreglo de solo números pares es:\n");
        for (int i = 0; i < conteoPares; i++) {
            arregloMensaje.append("[ ").append(par[i]).append(" ] ");
        }
        arregloMensaje.append("\n---------------------------------------------------\n");
        arregloMensaje.append("| Con un total de: ").append(conteoPares).append(" números pares |\n");
        arregloMensaje.append("-----------------------------------------------------");

        arregloMensaje.append("\n\nEl arreglo de solo números impares es:\n");
        for (int i = 0; i < conteoImpares; i++) {
            arregloMensaje.append("[ ").append(impar[i]).append(" ] ");
        }
        arregloMensaje.append("\n---------------------------------------------------\n");
        arregloMensaje.append("| Con un total de: ").append(conteoImpares).append(" números impares |\n");
        arregloMensaje.append("-----------------------------------------------------");

        // Mostramos el mensaje en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, arregloMensaje.toString());
    }
}
