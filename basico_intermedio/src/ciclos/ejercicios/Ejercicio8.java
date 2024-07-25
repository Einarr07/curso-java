/*Pedir un número N, y mostrar todos los números del 1 al N*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        for(int i = 1; i <= num; i++ ){
            System.out.println("Impresión: "+i);
        }
    }
}
