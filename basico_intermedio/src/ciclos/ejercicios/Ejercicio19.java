/*Dadas 6 notas, escribir la cantidad de alumnos aprobados condicionados (=4) y suspensos*/
package ciclos.ejercicios;

import ciclos.For;

import javax.swing.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        float nota;
        int aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++){
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota entre 0 a 10"));
            }while (nota < 0 || nota>10);

            if (nota == 4){
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            }else {
                suspensos++;
            }
        }

        StringBuilder notas = new StringBuilder();
        notas.append("Cantidad de aprovados: ").append(aprobados).append("\n");
        notas.append("Cantidad de condicionados: ").append(condicionados).append("\n");
        notas.append("Cantidad de suspensos: ").append(suspensos).append("\n");

        JOptionPane.showMessageDialog(null, notas.toString());
    }
}
