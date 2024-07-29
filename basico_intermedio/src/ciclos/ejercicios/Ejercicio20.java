/* Pedir un número N, introducir N sueldos y mostrar el sueldo máximo */
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Declarar variables
        int numSueldos, i = 0; // numSueldos para la cantidad de sueldos a ingresar, i como contador
        float sueldo, sueldoMax = 0; // sueldo para el sueldo ingresado, sueldoMax para almacenar el sueldo máximo

        // Solicitar al usuario la cantidad de sueldos que desea ingresar
        numSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos que quiere ingresar"));

        // Bucle while para ingresar los sueldos y determinar el sueldo máximo
        while (i < numSueldos) {
            // Solicitar al usuario que ingrese el sueldo correspondiente
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo " + (i + 1)));

            // Verificar si es el primer sueldo o si el sueldo ingresado es mayor que el sueldo máximo actual
            if (i == 0 || sueldo > sueldoMax) {
                sueldoMax = sueldo; // Actualizar el sueldo máximo
            }

            i++; // Incrementar el contador
        }

        // Mostrar el sueldo máximo en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El sueldo máximo es: " + sueldoMax);
    }
}
