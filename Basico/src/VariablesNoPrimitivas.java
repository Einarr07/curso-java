public class VariablesNoPrimitivas {
    public static void main(String[] args) {
        // Definición de variables no primitivas

        /*
         Los tipos de datos no primitivos son aquellos que son objetos,
         lo que significa que se basan en clases y proporcionan métodos útiles.
         A diferencia de los tipos de datos primitivos, los no primitivos pueden ser nulos
         y tienen una referencia en lugar de un valor directo.
        */

        // Integer es un tipo de dato no primitivo que envuelve el tipo primitivo int.
        // Permite usar null como valor y proporciona métodos adicionales.
        Integer numero = null;
        System.out.println("El número es: " + numero);

        // String es un tipo de dato no primitivo que representa una cadena de caracteres.
        // A diferencia de los tipos de datos primitivos, String es una clase y proporciona
        // muchos métodos útiles para trabajar con cadenas de texto.
        String cadena = "Soy una cadena de texto, hola";
        System.out.println(cadena);
    }
}
