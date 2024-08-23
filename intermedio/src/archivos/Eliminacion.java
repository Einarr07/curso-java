package archivos;

// Importa las clases necesarias para crear cuadros de diálogo y manejar archivos
import javax.swing.*;
import java.io.File;

public class Eliminacion {
    public static void main(String[] args) {
        // Crea un objeto File que representa un archivo llamado "archivo.txt"
        File archivo = new File("archivo.txt");

        // Intenta eliminar el archivo
        if (archivo.delete()) {
            // Si el archivo se eliminó correctamente, muestra un mensaje de éxito
            JOptionPane.showMessageDialog(null, "El archivo se eliminó correctamente");
        } else {
            // Si el archivo no se pudo eliminar, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "El archivo no se pudo eliminar");
        }
    }
}
