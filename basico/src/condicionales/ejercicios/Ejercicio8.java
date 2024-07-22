/*Pedir un número entre 0 y 99.999 y decir cuantas cifras tiene*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 y 99.999 para saber cuantas " +
                "cifras tiene"));

        if ((num >= 0) && (num <= 9)){
            JOptionPane.showMessageDialog(null, "El "+num+" tiene 1 cifra");
        } else if ((num >= 10) && (num <= 99)) {
            JOptionPane.showMessageDialog(null, "El "+num+" tiene 2 cifras");
        } else if ((num >= 100) && (num <= 999)) {
            JOptionPane.showMessageDialog(null, "El "+num+" tiene 3 cifras");
        } else if ((num >= 1000) && (num <= 9999)) {
            JOptionPane.showMessageDialog(null, "El "+num+" tiene 4 cifras");
        } else if ((num >= 10000) && (num <= 99999)) {
            JOptionPane.showMessageDialog(null, "El "+num+" tiene 5 cifras");
        }else {
            JOptionPane.showMessageDialog(null, "El número que ingresaste esta fuera del rango");
        }
    }
}
