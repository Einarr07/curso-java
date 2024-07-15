import java.util.Scanner;

public class EntradaYSalida {
    public static void main(String[] args) {
        // Inicializamos una nueva instancia de la clase Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Registro de números
        float numero;
        System.out.print("Ingresa un numero: ");
        numero = entrada.nextFloat(); // Leer un número flotante desde la entrada del usuario
        System.out.println("El numero que ingresaste es: " + numero);

        // Registro de una cadena de texto hasta que encuentre un espacio o salto de línea
        String cadena;
        System.out.print("Digite una cadena: ");
        cadena = entrada.next(); // Leer una palabra (cadena de texto) hasta el primer espacio o salto de línea
        System.out.println("La cadena es: " + cadena);

        // Registro de una línea completa incluyendo los espacios
        entrada.nextLine(); // Consumir el resto de la línea anterior para evitar conflictos con nextLine()
        String cadena2;
        System.out.print("Digite una cadena: ");
        cadena2 = entrada.nextLine(); // Leer una línea completa incluyendo espacios
        System.out.println("La cadena es: " + cadena2);

        // Registro de un carácter
        char letra;
        System.out.print("Ingrese el carácter: ");
        letra = entrada.next().charAt(0); // Leer un carácter desde la entrada del usuario
        System.out.println("La letra es: " + letra);
    }
}
