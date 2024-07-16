package operadores;

public class IncrementoYDecremento {
    public static void main(String[] args) {
        int x = 5;

        // Ejemplo de incremento sufijo (x++)
        // Se usa el valor actual de x, y luego se incrementa en 1
        System.out.println("Valor de x antes de x++: " + x); // Imprime 5
        int y = x++; // y toma el valor actual de x (5) y luego x se incrementa en 1
        System.out.println("Valor de y después de x++: " + y); // Imprime 5
        System.out.println("Valor de x después de x++: " + x); // Imprime 6
        System.out.println("---------------------------------");

        // Reiniciar x para el siguiente ejemplo
        x = 5;

        // Ejemplo de incremento prefijo (++x)
        // Primero se incrementa el valor de x, y luego se usa el nuevo valor de x
        System.out.println("Valor de x antes de ++x: " + x); // Imprime 5
        int z = ++x; // x se incrementa en 1 y luego z toma el nuevo valor de x (6)
        System.out.println("Valor de z después de ++x: " + z); // Imprime 6
        System.out.println("Valor de x después de ++x: " + x); // Imprime 6
        System.out.println("---------------------------------");

        // Reiniciar x para los ejemplos de decremento
        x = 5;

        // Ejemplo de decremento sufijo (x--)
        // Se usa el valor actual de x, y luego se decrementa en 1
        System.out.println("Valor de x antes de x--: " + x); // Imprime 5
        int a = x--; // a toma el valor actual de x (5) y luego x se decrementa en 1
        System.out.println("Valor de a después de x--: " + a); // Imprime 5
        System.out.println("Valor de x después de x--: " + x); // Imprime 4
        System.out.println("---------------------------------");

        // Reiniciar x para el siguiente ejemplo
        x = 5;

        // Ejemplo de decremento prefijo (--x)
        // Primero se decrementa el valor de x, y luego se usa el nuevo valor de x
        System.out.println("Valor de x antes de --x: " + x); // Imprime 5
        int b = --x; // x se decrementa en 1 y luego b toma el nuevo valor de x (4)
        System.out.println("Valor de b después de --x: " + b); // Imprime 4
        System.out.println("Valor de x después de --x: " + x); // Imprime 4
    }
}
