/*Hacer un programa que lea un número entero y muestre si el número es multiplo de 10*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es multiplo de 10");
        }else {
            JOptionPane.showMessageDialog(null, "El número no es multiplo de 10");
        }
    }
}
