/*Pedir números hasta que se introduzca uno negativo y calcular la media*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num, elementos = 0, suma = 0;
        float media;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (num >= 0){
            suma += num;
            elementos++;

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }

        if (elementos == 0){
            JOptionPane.showMessageDialog(null, "Error la división entre sero no existe");
        }else {
            media = (float) suma/elementos;
            JOptionPane.showMessageDialog(null, "La media es: "+media);
        }
    }
}
