package operadores;

import java.util.Scanner;

public class Aritméticos {
    public static void main(String[] args) {
        // Crear una instancia de la clase Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Declarar variables para almacenar los números y resultados de las operaciones
        float num1, num2, suma, resta, mult, div, resto;

        // Solicitar al usuario que ingrese dos números
        System.out.println("Introduce 2 números");
        System.out.print("Ingresa el primer número: ");
        num1 = entrada.nextFloat(); // Leer el primer número como un float
        System.out.print("Ingresa el segundo número: ");
        num2 = entrada.nextFloat(); // Leer el segundo número como un float

        // Realizar la suma de los dos números y mostrar el resultado
        System.out.println("La suma de los dos números es: ");
        suma = num1 + num2; // Sumar los dos números
        System.out.println(suma); // Mostrar el resultado de la suma

        // Realizar la resta de los dos números y mostrar el resultado
        System.out.println("La resta de los dos números es: ");
        resta = num1 - num2; // Restar el segundo número al primero
        System.out.println(resta); // Mostrar el resultado de la resta

        // Realizar la multiplicación de los dos números y mostrar el resultado
        System.out.println("La multiplicación de los dos números es: ");
        mult = num1 * num2; // Multiplicar los dos números
        System.out.println(mult); // Mostrar el resultado de la multiplicación

        // Realizar la división de los dos números y mostrar el resultado
        System.out.println("La división de los dos números es: ");
        div = num1 / num2; // Dividir el primer número por el segundo
        System.out.println(div); // Mostrar el resultado de la división

        // Calcular el resto de la división de los dos números y mostrar el resultado
        System.out.println("El resto de los dos números es: ");
        resto = num1 % num2; // Calcular el resto de la división de los dos números
        System.out.println(resto); // Mostrar el resultado del resto

        // Cerrar el scanner para liberar recursos
        entrada.close();
    }
}
