/*Pedir 10 números y escribir la suma total*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int contador = 10;
        float num, total = 0;

        for(int i = 1; i <= contador; i++){
            num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número " +i));
            total += num;
        }

        JOptionPane.showMessageDialog(null, "La suma de todos los números ingresados es: "+total);
    }
}
