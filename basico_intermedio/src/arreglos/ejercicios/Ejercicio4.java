/* Leer 10 números enteros, guardaros en un arreglo. Debemos mostrarlos en el siguiente orden: el primero, el último,
 * el segundo, el penúltimo, el tercero, etc*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];

        // Solicitar al usuario que ingrese 10 números enteros
        System.out.println("----------------------------");
        System.out.println("|Ingrese 10 números enteros|");
        System.out.println("----------------------------");

        // Leer los números y almacenarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Ingrese un número: ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar los números en el orden especificado
        System.out.println("\nMostrando los números en el orden especificado:");

        // Inicializar los índices para el principio y el final del arreglo
        int inicio = 0;
        int fin = numeros.length - 1;

        // Usar un bucle while para alternar entre el principio y el final del arreglo
        while (inicio <= fin) {
            // Imprimir el número en el índice 'inicio'
            System.out.println(numeros[inicio]);
            // Si 'inicio' y 'fin' no son iguales, imprimir el número en el índice 'fin'
            if (inicio != fin) {
                System.out.println(numeros[fin]);
            }
            // Incrementar el índice 'inicio' y decrementar el índice 'fin'
            inicio++;
            fin--;
        }
    }
}
