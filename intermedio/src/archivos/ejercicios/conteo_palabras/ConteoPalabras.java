package archivos.ejercicios.conteo_palabras;

// Importa las clases necesarias para crear cuadros de diálogo, manejar archivos y escribir en archivos
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConteoPalabras {

    // Método para leer el contenido de un archivo y devolverlo como un array de palabras
    public String[] leerArchivo(File file) {
        String lineas = "";  // Almacena todo el contenido del archivo en una sola cadena

        try {
            // Abre el archivo para lectura utilizando Scanner
            Scanner entrada = new Scanner(file);

            // Lee cada línea del archivo y las concatena en la cadena 'lineas'
            while (entrada.hasNextLine()) {
                lineas += entrada.nextLine();
            }
        } catch (FileNotFoundException e) {
            // Muestra un mensaje de error si el archivo no se encuentra
            JOptionPane.showMessageDialog(null, "ERROR:\n" + e);
        }

        // Divide la cadena en palabras utilizando un espacio como separador y devuelve el resultado como un array
        return lineas.split(" ");
    }

    // Método para escribir el resultado en un archivo y devolver si la operación fue exitosa
    public boolean observarResultado(int palabras, String[] lineas) {
        boolean resultado = false;  // Bandera para indicar si la operación fue exitosa
        File archivo = new File("resultado.txt");  // Crea un archivo llamado "resultado.txt"

        try {
            // Crea un FileWriter para escribir en el archivo "resultado.txt"
            FileWriter fw = new FileWriter(archivo);

            String aux = " ";  // Variable auxiliar para almacenar las palabras leídas

            // Concatenar todas las palabras en una cadena
            for (String linea : lineas) {
                aux += linea;
                aux += " ";
            }

            // Escribe el número de palabras y el contenido del archivo en "resultado.txt"
            fw.write("El archivo tiene: " + palabras + " palabras" + "\n" + aux);
            fw.close();  // Cierra el FileWriter para asegurar que los datos se guarden correctamente

            resultado = true;  // Indica que la operación fue exitosa
        } catch (IOException e) {
            // Muestra un mensaje de error si ocurre una excepción durante la escritura del archivo
            JOptionPane.showMessageDialog(null, "ERROR:\n" + e);
        }

        return resultado;  // Devuelve si la operación fue exitosa o no
    }
}
