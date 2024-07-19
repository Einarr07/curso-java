package condicionales;

import javax.swing.*;

public class SentenciaIfElse {
    public static void main(String[] args) {
        int num, dato = 5;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: "));

        /* Operadores de comparación:
         * == : Igualdad. Verifica si dos valores son iguales.
         * <  : Menor que. Verifica si el valor a la izquierda es menor que el valor a la derecha.
         * <= : Menor o igual que. Verifica si el valor a la izquierda es menor o igual que el valor a la derecha.
         * >  : Mayor que. Verifica si el valor a la izquierda es mayor que el valor a la derecha.
         * >= : Mayor o igual que. Verifica si el valor a la izquierda es mayor o igual que el valor a la derecha.
         * != : Diferente de. Verifica si dos valores son diferentes.
         */

        if (num == dato) {
            JOptionPane.showMessageDialog(null, "El número que ingresaste es 5");
        } else{
            JOptionPane.showMessageDialog(null, "El número es diferente de 5");
        }
    }
}
