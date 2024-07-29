/*Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio22 {
    public static void main(String[] args) {
        int contadorSuspendidos = 0;
        float calificacion;

        for (int i = 1; i <= 5; i++){
            do{
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingresa 5 calificaciones entre 0 y 10" +
                        "\n Nosotros verificaremos cuantos alumnos suspendidos existen \n Calificación Nº"+i));
            }while (calificacion < 0 || calificacion > 10);

            if (calificacion >= 0 && calificacion <= 6){
                contadorSuspendidos++;
            }

        }
        if(contadorSuspendidos > 1){
            JOptionPane.showMessageDialog(null,"Alumnos suspendidos: "+contadorSuspendidos);
        }else {
            JOptionPane.showMessageDialog(null,"Ningun alumno esta suspendido");
        }

    }
}
