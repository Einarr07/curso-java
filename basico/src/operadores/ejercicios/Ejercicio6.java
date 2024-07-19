/* Hacer un programa que calcule el cuadrado de una suma */
package operadores.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.print("Ingrese el primer valor: ");
        num1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        num2 = entrada.nextDouble();

        resultado = Math.pow(num1 + num2, 2);

        System.out.println("El cuadrado de la suma es: " + resultado);
    }
}
