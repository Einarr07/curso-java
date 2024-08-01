/*Leer 5 números guardados en un arreglo y mostrarlos en el orden inverso al introducido*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("-------------------");
        System.out.println("|Ingrese 5 números|");
        System.out.println("-------------------");

        for (int i = 0; i < 5; i++){
            System.out.print((i+1)+".- Ingrese el número: ");
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("\nImprime los elementos del arreglo de forma inversa a su introducción");
        for (int i = numeros.length - 1; i >= 0; i-- ){
            System.out.println(numeros[i]);
        }
    }
}
