package manejo_de_excepciones;

// Importa las clases necesarias para mostrar mensajes en cuadros de diálogo y manejar operaciones de archivos
import javax.swing.*;
import java.io.*;

public class TryCatch {

    // Este método lee un archivo línea por línea y lanza excepciones si no se encuentra el archivo o si ocurre un error de E/S
    public void leerArchivo() throws FileNotFoundException, IOException {
        // Crea un objeto File que apunta a la ruta especificada del archivo
        File archivo = new File("C:\\prueba\\texto.txt");

        // FileReader se usa para leer el contenido del archivo de texto
        FileReader fr = new FileReader(archivo);

        // BufferedReader se usa para leer el texto de manera eficiente línea por línea
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        // Lee el archivo línea por línea hasta que no haya más líneas (retorna null)
        while((linea = bf.readLine()) != null) {
            // Imprime cada línea del archivo en la consola
            System.out.println(linea);
        }
    }

    // Este método maneja las excepciones que podrían ser lanzadas durante la lectura del archivo
    public void leerArchivo2() {
        try {
            // Intenta leer el archivo llamando al método leerArchivo
            leerArchivo();
        } catch (FileNotFoundException ex) {
            // Si el archivo no se encuentra, muestra un cuadro de diálogo con un mensaje de error
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado" +
                    " por favor, verifique la ruta.");
        } catch (IOException e) {
            // Si ocurre cualquier otro error de E/S, muestra un mensaje de error genérico
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción verificada");
        }

        // Imprime un mensaje en la consola indicando que el programa ha terminado
        System.out.print("Programa terminado");
    }

    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        // Crea una instancia de la clase TryCatch
        TryCatch prueba = new TryCatch();

        // Llama al método leerArchivo2 para intentar leer el archivo y manejar las excepciones
        prueba.leerArchivo2();
    }
}
