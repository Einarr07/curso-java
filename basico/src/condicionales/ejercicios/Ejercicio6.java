/*Hacer un programa que tome dos números y diga si ambos son pares o impares*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));

        if((num1 % 2 == 0 && num2 % 2 == 0)){
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
        } else if (num1 % 2 != 0 && num2 %2 != 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son impares");
        }else {
            JOptionPane.showMessageDialog(null, "Un número es par y el otro es impar");
        }
    }
}
