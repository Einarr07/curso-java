package operadores;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Sirve para tomar decisiones simples en una sola linea de código
public class OperadorTernario {
    public static void main(String[] args) {
        double promedio;
        String condicionFinal;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el promedio general de un alumno: ");
        promedio = entrada.nextDouble();

        condicionFinal = promedio >= 7 ? "Aprobado" : "Desaprobado";

        System.out.println("La condición final del alumno es: " + condicionFinal);
    }
}
