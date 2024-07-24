/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num, contador = 0;;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (num >= 0){

            if(num == 0){
                JOptionPane.showMessageDialog(null, "0 no es positivo ni negativo");
            }else{
                JOptionPane.showMessageDialog(null, "Muy bien ingresa otro número");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Ingresaste un número negativo\n" +
                "El total de números que ingresaste es de: "+contador);
    }
}
