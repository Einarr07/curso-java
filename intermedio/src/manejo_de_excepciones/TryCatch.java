package manejo_de_excepciones;

import javax.swing.*;
import java.io.*;

public class TryCatch {

    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("C:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }

    public void leerArchivo2() {
        try {
            leerArchivo();
        }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado"+ " " +
                    "por favor, verifique la ruta.");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una exepción verificada");
        }

        System.out.print("Programa terminado");
    }
    public static void main(String[] args) {
        TryCatch prueba = new TryCatch();

        prueba.leerArchivo2();
    }
}
