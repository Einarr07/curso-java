/*Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayuscula*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Ingresa una letra: ").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
        }else {
            JOptionPane.showMessageDialog(null, "Es una letra minúscula");
        }
    }
}
