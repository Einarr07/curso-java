/*Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la fomra: el 1º de A, el 1º de B
* el 2º de A, el 2º de B. etc, etc.*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];

        //Pedimos el arreglo A
        System.out.println("---------------------------");
        System.out.println("|Ingrese el primer arreglo|");
        System.out.println("---------------------------");

        for (int i= 0; i < 10; i++){
            System.out.print((i+1)+".- Ingrese un número: ");
            a[i] = entrada.nextInt();
        }

        //Pedimos el arreglo B
        System.out.println("----------------------------");
        System.out.println("|Ingrese el segundo arreglo|");
        System.out.println("----------------------------");

        for (int i= 0; i < 10; i++){
            System.out.print((i+1)+".- Ingrese un número: ");
            b[i] = entrada.nextInt();
        }



        // Mesclamos los 2 arreglos en el arreglo C
        // Utilizaremos el iterador (i) para los arreglos a y b, para el iterador se utilizaremos j

        int j = 0;
        for (int i = 0; i < 10; i++){
            c[j] = a[i]; // A
            j++;
            c[j] = b[i]; // B
            j++;
        }

        // Resultado
        System.out.println("---------------------------------");
        System.out.println("|El resultado en el arreglo C es|");
        System.out.println("---------------------------------");

        for (int i= 0; i < 20; i++){
            System.out.print(c[i]+ " ");
        }

    }
}
