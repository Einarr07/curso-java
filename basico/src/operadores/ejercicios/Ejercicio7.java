/* Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas. */
package operadores.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTotales, semanas, dias, horas;

        // Solicitar al usuario el número total de horas
        System.out.print("Ingrese el número de horas: ");
        horasTotales = entrada.nextInt();

        // Calcular el número de semanas
        semanas = horasTotales / 168;
        // Calcular el número de días restantes después de contabilizar las semanas
        dias = (horasTotales % 168) / 24;
        // Calcular el número de horas restantes después de contabilizar los días
        horas = horasTotales % 24;

        // Mostrar el resultado
        System.out.println("El equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
    }
}
