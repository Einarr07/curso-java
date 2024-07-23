/*Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones
* posibles*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        float kg, g, t, lb, oz, mg;
        int op = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO AL CONVERTIDOR DE KILOGRAMOS(KG)\n" +
                "1.- Kilogramos a gramos\n" +
                "2.- Kilogramos a toneladas\n" +
                "3.- Kilogramos a libras\n" +
                "4.- Kilogramos a onzas\n" +
                "5.- Kilogramos a miligramos\n" +
                "6.- Salir"));

        switch (op){
            case 1:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilogramos"));
                g = kg * 1000;
                JOptionPane.showMessageDialog(null,kg+"kg son " +g+"g");
                break;
            case 2:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilogramos"));
                t = kg * 0.001f;
                JOptionPane.showMessageDialog(null,kg+"kg son "+t+"t");
                break;
            case 3:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilogramos"));
                lb = kg * 2.20462f;
                JOptionPane.showMessageDialog(null,kg+"kg son "+lb+"lb");
                break;
            case 4:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilogramos"));
                oz = kg * 35.274f;
                JOptionPane.showMessageDialog(null,kg+"kg son "+oz+"oz");
                break;
            case 5:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese los kilogramos"));
                mg = kg * 1000000f;
                JOptionPane.showMessageDialog(null,kg+"kg son "+mg+"mg");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Graicas por venir");
            default:
                JOptionPane.showMessageDialog(null, "La opción esta fuera del rango");
        }
    }
}
