public class VariablesPrimitivas {
    public static void main(String[] args) {
        // Definición de variables primitivas

        System.out.println("-------------------");
        System.out.println("| Números enteros |");
        System.out.println("-------------------");
        // El byte permite colocar números en el siguiente rango: -128 a 127
        byte entero = 127;
        System.out.println("Número byte: " + entero);

        // Rango short: -32.768 a 32.767
        short numeroShort = 12456;
        System.out.println("Número short: " + numeroShort);

        // Rango int: -2.147.483.648 a 2.147.483.647
        int numeroInt = 2147483647;
        System.out.println("Número int: " + numeroInt);

        // Rango long: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long numeroLong = 9223372036854775807L;
        System.out.println("Número long: " + numeroLong);

        // Números reales o con decimales
        System.out.println("---------------------");
        System.out.println("| Números decimales |");
        System.out.println("---------------------");
        float numeroFloat = 3.45f;
        System.out.println("Número float: "+numeroFloat);
        double numeroDouble = 3.4523421;
        System.out.println("Número double: "+ numeroDouble);

        // Caracteres
        System.out.println("------------");
        System.out.println("| Caracteres |");
        System.out.println("--------------");
        char caracter = 'a';
        System.out.println("Caracter: "+caracter);

        // Booleanos
        System.out.println("--------------------");
        System.out.println("| Valores booleanos |");
        System.out.println("---------------------");
        boolean verdadero = true;
        System.out.println("Esto es verdadero: "+verdadero);
        boolean falso = false;
        System.out.println("Esto es falso: "+ falso);
    }
}
