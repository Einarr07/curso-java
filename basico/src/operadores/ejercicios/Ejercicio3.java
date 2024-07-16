/* Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen
Luis y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
*/
package operadores.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float dolaresGuillermo, dolaresLuis, dolaresJuan, total;

        System.out.print("Ingrese la catidad de dinero que tiene Guillermo: ");
        dolaresGuillermo = entrada.nextFloat();

        // Luis tiene la mitad de lo que tiene guillermo
        dolaresLuis = dolaresGuillermo/2;
        // Juan tiene la mitad de lo que poseen Luis y Guillermo juntos
        dolaresJuan = (dolaresGuillermo+dolaresLuis)/2;

        total = dolaresGuillermo + dolaresLuis + dolaresJuan;

        System.out.printf("La cantidad de dinero que poseen los tres es de: %.2f%n", total);

        entrada.close();
    }
}
