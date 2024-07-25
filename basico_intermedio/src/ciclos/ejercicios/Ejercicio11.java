/*Diseñar un programa que muestre el producto de los 10 primeros impares*/
package ciclos.ejercicios;

public class Ejercicio11 {
    public static void main(String[] args) {
        int contador = 0;
        long total = 1;

        for (int i = 1; contador <= 10; i += 2) {
            total *= i;
            contador++;
        }

        System.out.println("El producto de los 10 primeros impares es: " + total);
    }
}
