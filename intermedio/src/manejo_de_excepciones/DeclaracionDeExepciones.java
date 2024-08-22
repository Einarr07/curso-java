package manejo_de_excepciones;

// Importación de clases necesarias para manejar archivos y excepciones de E/S.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeclaracionDeExepciones {

    // Declaración de un método estático llamado "leerArchivo".
    // Este método recibe una cadena de texto (String) que representa la ruta de un archivo.
    // El método declara que puede lanzar dos excepciones: FileNotFoundException e IOException.
    public static void leerArchivo(String ruta) throws FileNotFoundException, IOException {

        // Creación de un objeto File, que representa al archivo ubicado en la ruta especificada.
        File archivo = new File(ruta);

        // Creación de un FileReader, que se usa para leer el contenido del archivo.
        // Si el archivo no se encuentra en la ruta especificada, se lanza una FileNotFoundException.
        FileReader fr = new FileReader(archivo);

        // Lee el contenido del archivo carácter por carácter.
        // fr.read() devuelve el valor ASCII del carácter leído, o -1 si se ha alcanzado el final del archivo.
        int contenido = fr.read();

        // Bucle que continúa leyendo hasta que se alcanza el final del archivo.
        while (contenido != -1) {
            // Convierte el valor ASCII a un carácter y lo imprime en la consola.
            System.out.print((char) contenido);

            // Lee el siguiente carácter del archivo.
            contenido = fr.read();
        }

        // Cierra el FileReader para liberar recursos.
        // Esto es importante para evitar fugas de memoria y liberar el archivo para otros procesos.
        fr.close();
    }

    // Método principal (punto de entrada del programa).
    // Declara que puede lanzar las mismas excepciones que el método leerArchivo.
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Llama al método leerArchivo y le pasa la ruta de un archivo como argumento.
        // Si ocurre alguna de las excepciones declaradas, se propagará al entorno de ejecución.
        leerArchivo("C:\\prueba\\texto.txt");
    }
}
