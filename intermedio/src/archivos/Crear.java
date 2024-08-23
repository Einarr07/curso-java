package archivos;

// Importa las clases necesarias para crear cuadros de diálogo y manejar operaciones de archivos
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Crear {
    public static void main(String[] args) {
        // Crea un objeto File que representa una carpeta llamada "carpeta archivos"
        File carpeta = new File("carpeta archivos");

        // Crea un objeto File que representa un archivo llamado "Mi primer archivo.txt" dentro de la carpeta anterior
        File archivo = new File("carpeta archivos\\Mi primer archivo.txt");

        try {
            // Intenta crear la carpeta "carpeta archivos"
            boolean creacionCarpeta = carpeta.mkdir();

            // Intenta crear el archivo "Mi primer archivo.txt" dentro de la carpeta "carpeta archivos"
            boolean creacionArchivo = archivo.createNewFile();

            // Verifica si ambos, la carpeta y el archivo, fueron creados exitosamente
            if (creacionCarpeta && creacionArchivo) {
                // Muestra un mensaje indicando que el archivo se creó correctamente
                JOptionPane.showMessageDialog(null, "El archivo se creó correctamente");
            } else {
                // Si la carpeta o el archivo ya existían, muestra un mensaje indicando que el archivo ya existe
                JOptionPane.showMessageDialog(null, "El archivo ya existe");
            }
        } catch (IOException e) {
            // Si ocurre una excepción al intentar crear el archivo, muestra un mensaje con detalles de la excepción
            JOptionPane.showMessageDialog(null, "Excepción al crear el archivo:\n" + e);
        }
    }
}
