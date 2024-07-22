/*Pedir dos número y decir cual es mayor o si son iguales*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        float num1, num2;

        JOptionPane.showMessageDialog(null,
                "Por favor ingrese 2 números para determinar cual es mayor o verificar si son iguales");

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        if (num1 > num2){
            JOptionPane.showMessageDialog(null, "El número "+num1+" es mayor que "+num2);
        } else if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los números son iguales");
        }else {
            JOptionPane.showMessageDialog(null, "El número "+num2+" es mayor que "+num1);
        }
    }
}
