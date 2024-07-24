/* Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos. */
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num, total = 0;

        // Primer número ingresado por el usuario.
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (0 para terminar):"));

        // Ciclo que continúa hasta que el usuario ingresa un 0.
        while (num != 0) {
            // Acumula la suma de los números ingresados.
            total += num;

            // Solicita otro número al usuario.
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (0 para terminar):"));
        }

        // Muestra el resultado de la suma de todos los números ingresados.
        JOptionPane.showMessageDialog(null, "Gracias por venir\nLa suma de todos los números ingresados es: " + total);
    }
}
