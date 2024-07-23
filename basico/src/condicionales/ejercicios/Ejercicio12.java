/*pedir una nota de 0 a 10 y mostrarla de la forma Insuficiente, suficiente, Bien, Notable y Sobresaliente.*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        float nota;
        
        nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su nota del 0 al 10"));
        
        if((nota >= 0) && (nota <= 5)){
            JOptionPane.showMessageDialog(null,"Su nota es INSUFICIENTE");
        } else if (nota == 6) {
            JOptionPane.showMessageDialog(null, "Su calificación suficiente");
        } else if (nota == 7) {
            JOptionPane.showMessageDialog(null, "Su calificación esta bien");
        } else if ((nota >= 8) && (nota <=9)) {
            JOptionPane.showMessageDialog(null, "Su calificación es notable");
        } else if (nota == 10){
            JOptionPane.showMessageDialog(null, "Su calificación SOBRESALIENTE");
        }else {
            JOptionPane.showMessageDialog(null, "La calificación esta fuera del rango");
        }
    }
}
