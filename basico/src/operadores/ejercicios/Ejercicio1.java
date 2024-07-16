package operadores.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule e imprima la suma de tres calificaciones
        */

        float nota1, nota2, nota3, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        System.out.println("| Este es un programa que calcula la suma de 3 calificaciones |");
        System.out.println("---------------------------------------------------------------");

        System.out.print("Ingrese la primera calificación: ");
        nota1 = entrada.nextFloat();

        System.out.print("Ingrese la segunda calificación: ");
        nota2 = entrada.nextFloat();

        System.out.print("Ingrese la tercera calificación: ");
        nota3 = entrada.nextFloat();

        resultado = nota1 + nota2 + nota3;

        System.out.println("El resultado de la suma de sus calificaciones es: "+ resultado);


    }
}
