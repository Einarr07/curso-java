package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        int dia, mes, año;
        boolean fechaCorrecta = false;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        if (año > 0) {
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia >= 1 && dia <= 31) {
                        fechaCorrecta = true;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    if (dia >= 1 && dia <= 30) {
                        fechaCorrecta = true;
                    }
                    break;
                case 2:
                    if (dia >= 1 && dia <= 28) {
                        fechaCorrecta = true;
                    }
                    break;
            }
        }

        if (fechaCorrecta) {
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
    }
}
