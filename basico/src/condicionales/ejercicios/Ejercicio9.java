/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los mesos son de
* 30 días*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if ((dia >= 1) && (dia <= 30)){ // Si el día es correcto
            if ((mes >= 1) && (mes <= 12)){ // Si el mes es correcto
                if(año != 0){ // Si el año es correcto
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }
            }else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }else {
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta, día incorrecto");
        }
    }
}
