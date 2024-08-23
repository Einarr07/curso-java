package archivos;

// Importa las clases necesarias para crear cuadros de diálogo, manejar archivos y leer su contenido
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leer {
    public static void main(String[] args) {
        // Crea un objeto File que representa un archivo llamado "archivo.txt"
        File archivo = new File("archivo.txt");

        try {
            // Crea un objeto Scanner para leer el contenido del archivo
            Scanner leer = new Scanner(archivo);

            // Mientras el archivo tenga más líneas que leer
            while (leer.hasNextLine()) {
                // Lee la siguiente línea del archivo
                String lectura = leer.nextLine();
                // Imprime la línea leída en la consola
                System.out.println(lectura);
            }
        } catch (FileNotFoundException e) {
            // Si ocurre una excepción al intentar abrir el archivo, muestra un cuadro de diálogo con el error
            JOptionPane.showMessageDialog(null, "Existió un fallo:\n" + e);
        }
    }
}
