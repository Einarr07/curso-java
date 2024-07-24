/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num, cuadrado;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (num >= 0){
            cuadrado = (int)Math.pow(num, 2);

            JOptionPane.showMessageDialog(null, "El número "+num+" elevado al cuadrado es: "+cuadrado);

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }

        JOptionPane.showMessageDialog(null,"Gracias por venir");
    }
}
