/*Dadas las edades y alturas de 5 alumnos, mostrar la edad la estatura media, la cantidad de alumnos mayores a 18
* años, y la cantidad de alumnos que miden más de 1.75*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        int edad, sumaEdad = 0, contadorEdad = 0, contadorAltura = 0;
        float altura, sumaAltura = 0;

        for (int i = 1; i <= 5; i++) {
            // Pedir los datos al usuario
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante " + i));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la altura (En metros) del estudiante " + i));

            // Sumar dichos datos
            sumaEdad += edad;
            sumaAltura += altura;

            // Contador de alumnos mayores a 18
            if (edad > 18) {
                contadorEdad++;
            }

            // Contador de alumnos que miden más de 1.75 metros
            if (altura > 1.75) {
                contadorAltura++;
            }
        }

        // Calcular medias
        int mediaEdades = 0;
        if (sumaEdad > 0) {
            mediaEdades = Math.round((float) sumaEdad / 5.0f);
        }

        float mediaAlturas = 0;
        if (sumaAltura > 0) {
            mediaAlturas = sumaAltura / 5.0f;
        }

        // Mostrar resultados con formateo a 2 decimales para la altura media
        JOptionPane.showMessageDialog(null, "Edad media: " + mediaEdades);
        JOptionPane.showMessageDialog(null, String.format("Altura media: %.2f", mediaAlturas));
        JOptionPane.showMessageDialog(null, "Cantidad de alumnos mayores de 18 años: "
                + contadorEdad);
        JOptionPane.showMessageDialog(null, "Cantidad de alumnos que miden más de 1.75 metros: "
                + contadorAltura);
    }
}

