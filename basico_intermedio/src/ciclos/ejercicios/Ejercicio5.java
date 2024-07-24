/* Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo
 * números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N. El proceso termina cuando
 * el usuario acierta y mostrar el número de intentos */
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num, aleatorio, contador = 0;

        // Genera un número aleatorio entre 0 y 100 y lo asigna a la variable aleatorio.
        aleatorio = (int) (Math.random() * 100);

        // Inicia un ciclo do-while que continuará ejecutándose hasta que el usuario adivine el número.
        do {
            // Solicita al usuario que ingrese un número utilizando un cuadro de diálogo.
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

            // Compara el número ingresado con el número aleatorio.
            if (aleatorio > num) { // Si el número aleatorio es mayor que el número ingresado.
                JOptionPane.showMessageDialog(null, "Ingresa un número mayor"); // Muestra un mensaje indicando que el número a adivinar es mayor.
            } else if (aleatorio < num) { // Si el número aleatorio es menor que el número ingresado.
                JOptionPane.showMessageDialog(null, "Ingresa un número menor"); // Muestra un mensaje indicando que el número a adivinar es menor.
            }
            contador++; // Incrementa el contador de intentos.
        } while (num != aleatorio); // El ciclo continúa hasta que el número ingresado sea igual al número aleatorio.

        // Muestra un mensaje indicando que el usuario ha adivinado el número y el número de intentos realizados.
        JOptionPane.showMessageDialog(null, "Adivinaste el número en " + contador + " intentos");
    }
}
