/*Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos,
* la media de los números negativos y contar el número de ceros*/
package arreglos.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos;
        int conteoPositivos = 0, conteoNegativos = 0, conteoCeros = 0;

        System.out.println("-------------------");
        System.out.println("|Ingrese 5 números|");
        System.out.println("-------------------");

        for ( int i = 0; i < 5; i++){
            System.out.print((i+1) +".- Ingrese un números: ");
            numeros[i] = entrada.nextFloat();

            if(numeros[i] == 0){
                conteoCeros++;
            } else if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                conteoPositivos++;
            }else {
                sumaNegativos += numeros[i];
                conteoNegativos++;
            }
        }

        // Media de los números positivos
        if (conteoPositivos == 0){
            System.out.println("No se puede sacar la media de los números positivos");
        }else {
            mediaPositivos = sumaPositivos / conteoPositivos;
            System.out.println("La media de los números positivos es: "+mediaPositivos);
        }

        // Media de los números negativos
        if (conteoNegativos == 0){
            System.out.println("No se puede sacar la media de los números negativos");
        }else {
            mediaNegativos = sumaNegativos / conteoNegativos;
            System.out.println("La media de los números negativos es: "+mediaNegativos);
        }

        // Cantidad de ceros
        System.out.println("La cantidad de ceros es: "+conteoCeros);
    }
}
