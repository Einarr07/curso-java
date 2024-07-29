/*Pedir 10 números y mostrar al final si se ha introducido alguno negativo.*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio21 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa 10 números y verificaremos si has " +
                    "ingresado un número negativo\n Ingresa el número "+i));
            if (num < 0){
                JOptionPane.showMessageDialog(null,"Has ingresado un número negativo");
            }
        }
    }
}
