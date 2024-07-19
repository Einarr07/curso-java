package operadores.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b, c, discriminante, raiz1, raiz2;

        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c = entrada.nextDouble();

        discriminante = Math.pow(b, 2) - 4 * a * c;

        // Caso de discriminante positivo y cero
        raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        // Mostrar el discriminante
        System.out.println("Discriminante: " + discriminante);

        // Mostrar resultados
        // Si el discriminante es positivo
        String resultado = discriminante > 0 ? raiz1 + " y " + raiz2 :
                // Si el discriminante es cero
                discriminante == 0 ? raiz1 + "" :
                        // Si el discriminante es negativo
                        "La ecuación no tiene raíces reales.";

        System.out.println("Las raíces de la ecuación son: ");
        System.out.println(resultado);

        entrada.close();
    }
}
