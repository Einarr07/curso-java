/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introdusca un 0*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número y el programa determinara si es positivo" +
                "o negativo"));

        while (num != 0){

            if(num > 0){
                JOptionPane.showMessageDialog(null, "El número "+num+" es positivo");
            }else {
                JOptionPane.showMessageDialog(null, "El número "+num+" es negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número y el programa determinara si es positivo" +
                    "o negativo"));
        }
        JOptionPane.showMessageDialog(null, "Gracias por venir");
    }
}
