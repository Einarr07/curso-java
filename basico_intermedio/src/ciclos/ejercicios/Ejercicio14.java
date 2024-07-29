/*Pedir 10 sueldos. Mostrar su suma y cuantos sueldos son mayores a 1000*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        float total = 0;
        int contadorMayorMil = 0;

        for (int i = 1; i <= 10; i++) {
            float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo Nº " + i));
            total += sueldo;
            if (sueldo > 1000) {
                contadorMayorMil++;
            }
        }

        JOptionPane.showMessageDialog(null, "La suma de los 10 sueldos es: $" + total + " dólares\n" +
                "Y " + contadorMayorMil + " son mayores a $1000 (mil dólares)");
    }
}
