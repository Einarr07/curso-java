package Operadores;

public class ClaseMath {
    public static void main(String[] args) {
        // Método para sacar la raíz cuadrada
        double raiz = Math.sqrt(36.67); // Calcula la raíz cuadrada de 36.67
        System.out.println("Raíz cuadrada de 36.67: " + raiz);
        System.out.println("---------------------");

        // Método para elevar a una potencia
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente); // Eleva 5 a la potencia de 2 (5^2)
        System.out.println("5 elevado a la potencia de 2: " + resultado);
        System.out.println("---------------------");

        // Método para redondear un número
        double numero = 4.56;
        long resultadoLong = Math.round(numero); // Redondea 4.56 al entero más cercano
        System.out.println("4.56 redondeado a long: " + resultadoLong);

        float numero2 = 5.78f;
        int resultadoInt = Math.round(numero2); // Redondea 5.78 al entero más cercano
        System.out.println("5.78 redondeado a int: " + resultadoInt);
        System.out.println("---------------------");

        // Método para generar un número aleatorio
        double numeroRandom = Math.random(); // Genera un número aleatorio entre 0.0 y 1.0
        System.out.println("Número aleatorio: " + numeroRandom);
        System.out.println("---------------------");

        // Método para obtener el valor absoluto
        double valorNegativo = -123.45;
        double valorAbsoluto = Math.abs(valorNegativo); // Obtiene el valor absoluto de -123.45
        System.out.println("Valor absoluto de -123.45: " + valorAbsoluto);
        System.out.println("---------------------");

        // Método para obtener el máximo de dos números
        int max1 = 8, max2 = 15;
        int maximo = Math.max(max1, max2); // Obtiene el mayor entre 8 y 15
        System.out.println("El mayor entre 8 y 15: " + maximo);
        System.out.println("---------------------");

        // Método para obtener el mínimo de dos números
        int min1 = 8, min2 = 15;
        int minimo = Math.min(min1, min2); // Obtiene el menor entre 8 y 15
        System.out.println("El menor entre 8 y 15: " + minimo);
        System.out.println("---------------------");

        // Método para redondear hacia abajo
        double numeroRedondearAbajo = 9.99;
        double redondeadoAbajo = Math.floor(numeroRedondearAbajo); // Redondea hacia abajo 9.99
        System.out.println("9.99 redondeado hacia abajo: " + redondeadoAbajo);
        System.out.println("---------------------");

        // Método para redondear hacia arriba
        double numeroRedondearArriba = 9.01;
        double redondeadoArriba = Math.ceil(numeroRedondearArriba); // Redondea hacia arriba 9.01
        System.out.println("9.01 redondeado hacia arriba: " + redondeadoArriba);
    }
}
