/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar*/
package ciclos.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número: ");
        num = entrada.nextInt();

        while (num != 0){
            if(num % 2 == 0){
                System.out.println("El número ingresado es par");
            }else {
                System.out.println("El número ingresado es impar");
            }
            System.out.print("Ingrese un número: ");
            num = entrada.nextInt();
        }
        System.out.println("Gracias por venir");
    }
}
