package archivos.ejercicios.conteo_palabras;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia de la clase ConteoPalabras
        ConteoPalabras conteo = new ConteoPalabras();

        // Crea un objeto File que representa el archivo "archivo.txt"
        File archivo = new File("archivo.txt");

        // Llama al método leerArchivo para leer el contenido del archivo y obtener un array de palabras
        String[] lineas = conteo.leerArchivo(archivo);

        // Calcula el número de palabras en el archivo contando los elementos del array
        int palabras = lineas.length;

        // Llama al método observarResultado para escribir el resultado en un archivo y obtener el resultado de la operación
        boolean resultado = conteo.observarResultado(palabras, lineas);

        // Verifica si la operación de escribir el resultado fue exitosa
        if (resultado) {
            // Si todo salió bien, imprime un mensaje de éxito
            System.out.println("Todo salió bien");
        } else {
            // Si hubo un problema, imprime un mensaje de error
            System.out.println("Hubo un problema en la ejecución :c");
        }
    }
}
