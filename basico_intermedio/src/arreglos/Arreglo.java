/*¿Qué es un arreglo?
* Un array (arreglo) en Java es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo.
* El tamaño de los arrays se declara en un primer momento y no se puede cambiar luego durante la ejecución del
* programa.*/
package arreglos;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        // Forma número 1
        int[] numeros = new int[3];

        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;

        for(int i = 0; i < 3; i++){
            System.out.println(numeros[i]);
        }

        // Forma número 2
        int[] numeros2 = {5,7,9,10};

        System.out.println("-------------------");
        System.out.println("|Impresión números2|");
        System.out.println("-------------------");

        for(int j = 0; j < 4; j++){
            System.out.println(numeros2[j]);
        }

        // Llenar un arreglo
        System.out.println("-------------------");
        System.out.println("|Llenar un arreglo|");
        System.out.println("-------------------");
        Scanner entrada = new Scanner(System.in);
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de" +
                "elementos que estaran dentro del arreglo"));

        char[] letras = new char[nElementos];

        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i <nElementos; i++){
            System.out.print((i+1)+". Ingrese un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }

        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i = 0; i < nElementos; i++){
            System.out.println(letras[i]+ " ");
        }
    }
}
