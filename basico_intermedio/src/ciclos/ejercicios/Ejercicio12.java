/*Pedir un número y calcular su factorial*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        int num, total = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial"));

        for (int i = 1; i <= num; i++) {
            total *= i;
        }

        System.out.println("El factorial es: " + total);
    }
}
