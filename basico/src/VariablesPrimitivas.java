public class VariablesPrimitivas {
    public static void main(String[] args) {
        // Definición de variables primitivas

        /*
        las variables primitivas en programación se refieren a tipos de datos fundamentales que
        representan valores simples y básicos. En Java y otros lenguajes de programación, las variables primitivas son
        diferentes de los objetos porque no tienen métodos ni capacidades adicionales asociadas a ellos.
         */
        System.out.println("-------------------");
        System.out.println("| Números enteros |");
        System.out.println("-------------------");

        // byte: Almacena números enteros en el rango de -128 a 127
        byte entero = 127;
        System.out.println("Número byte: " + entero);

        // short: Almacena números enteros en el rango de -32.768 a 32.767
        short numeroShort = 12456;
        System.out.println("Número short: " + numeroShort);

        // int: Almacena números enteros en el rango de -2.147.483.648 a 2.147.483.647
        int numeroInt = 2147483647;
        System.out.println("Número int: " + numeroInt);

        // long: Almacena números enteros largos en un rango mayor
        // Se debe añadir una 'L' al final del número para indicar que es del tipo long
        long numeroLong = 9223372036854775807L;
        System.out.println("Número long: " + numeroLong);

        // Números reales o con decimales
        System.out.println("---------------------");
        System.out.println("| Números decimales |");
        System.out.println("---------------------");

        // float: Almacena números decimales de precisión simple
        float numeroFloat = 3.45f; // Se debe añadir una 'f' al final del número para indicar que es del tipo float
        System.out.println("Número float: " + numeroFloat);

        // double: Almacena números decimales de doble precisión
        double numeroDouble = 3.4523421;
        System.out.println("Número double: " + numeroDouble);

        // Caracteres
        System.out.println("------------");
        System.out.println("| Caracteres |");
        System.out.println("--------------");

        // char: Almacena un solo carácter Unicode
        char caracter = 'a';
        System.out.println("Caracter: " + caracter);

        // Booleanos
        System.out.println("--------------------");
        System.out.println("| Valores booleanos |");
        System.out.println("---------------------");

        // boolean: Almacena valores de verdadero o falso
        boolean verdadero = true;
        System.out.println("Esto es verdadero: " + verdadero);

        boolean falso = false;
        System.out.println("Esto es falso: " + falso);
    }
}
