/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        // Declaración de variables
        int num;  // Variable para almacenar el número ingresado
        int sumaPositivos = 0;  // Suma de números positivos
        int sumaNegativos = 0;  // Suma de números negativos
        int cuentaPositivos = 0;  // Contador de números positivos
        int cuentaNegativos = 0;  // Contador de números negativos
        int cuentaCeros = 0;  // Contador de ceros

        // Bucle para pedir 10 números
        for (int i = 1; i <= 10; i++) {
            // Pedir un número al usuario
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número " + i + ":"));

            // Clasificación del número ingresado
            if (num > 0) {
                // Si el número es positivo
                sumaPositivos += num;  // Sumar al total de positivos
                cuentaPositivos++;  // Incrementar el contador de positivos
            } else if (num < 0) {
                // Si el número es negativo
                sumaNegativos += num;  // Sumar al total de negativos
                cuentaNegativos++;  // Incrementar el contador de negativos
            } else {
                // Si el número es cero
                cuentaCeros++;  // Incrementar el contador de ceros
            }
        }

        // Calcular la media de los números positivos
        float mediaPositivos;
        if (cuentaPositivos > 0) {
            mediaPositivos = (float) sumaPositivos / cuentaPositivos;  // Media de positivos
        } else {
            mediaPositivos = 0;  // Si no hay positivos, la media es 0
        }

        // Calcular la media de los números negativos
        float mediaNegativos;
        if (cuentaNegativos > 0) {
            mediaNegativos = (float) sumaNegativos / cuentaNegativos;  // Media de negativos
        } else {
            mediaNegativos = 0;  // Si no hay negativos, la media es 0
        }

        // Mostrar los resultados al usuario
        JOptionPane.showMessageDialog(null, "La media de los números positivos es: " + mediaPositivos);
        JOptionPane.showMessageDialog(null, "La media de los números negativos es: " + mediaNegativos);
        JOptionPane.showMessageDialog(null, "El total de ceros ingresados es: " + cuentaCeros);
    }
}
