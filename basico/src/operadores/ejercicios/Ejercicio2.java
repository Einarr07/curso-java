package operadores.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales
        trabajadas y de su salario por hora
        */
        Scanner entrada = new Scanner(System.in);
        int horasSemanales;
        float salarioPorHora, resultado;

        System.out.println("---------------------------------");
        System.out.println("| Calculador de horario semanal |");
        System.out.println("---------------------------------");

        System.out.println("Para calcular su salario semanal necesitamos saber los siguientes datos");
        System.out.print("Ingrese sus horas semanales trabajadas: ");
        horasSemanales = entrada.nextInt();
        System.out.print("Ingrese su salario por hora: ");
        salarioPorHora = entrada.nextFloat();

        resultado = horasSemanales * salarioPorHora;

        System.out.printf("Su salario a la semana es de: %.2f%n", resultado);

        entrada.close();
    }
}
