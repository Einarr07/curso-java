/*Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entre 0 y 10 para mostrar su tabla " +
                "de multiplicar"));
        if (num >= 0 && num <= 10) {
            StringBuilder tabla = new StringBuilder();
            tabla.append("Tabla del ").append(num).append(":\n");
            for (int i = 0; i <= 10; i++) {
                int total = num * i;
                tabla.append(num).append(" * ").append(i).append(" = ").append(total).append("\n");
            }
            JOptionPane.showMessageDialog(null, tabla.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No ingresaste un número entre 0 y 10");
        }
    }
}

