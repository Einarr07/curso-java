package archivos.ejercicios.diario;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {
        int opcionMenu;

        // Obtener la fecha actual y formatearla para usarla en el nombre del archivo
        String formatoFecha = "dd-MM-yyyy"; // Formato de fecha (por ejemplo: 25-04-2000)
        SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha);
        String fechaActual = sdf.format(new Date());

        // Nombre del archivo que incluye la fecha actual
        String nombreArchivo = "diario_" + fechaActual + ".txt";
        File diario = new File(nombreArchivo);

        do {
            // Mostrar un menú para que el usuario seleccione una opción
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar:\n" +
                    "1.- Escribir en el diario\n" +
                    "2.- Leer el diario\n" +
                    "3.- Eliminar diario\n" +
                    "0.- Salir"));

            switch (opcionMenu) {
                case 1:
                    // Opción para escribir en el diario
                    FileWriter escribirDiario = null;
                    try {
                        // Si el archivo no existe, lo crea
                        if (diario.createNewFile()) {
                            JOptionPane.showMessageDialog(null, "El archivo '" + nombreArchivo + "' ha sido creado exitosamente.");
                        }

                        StringBuilder entradaUsuario = new StringBuilder();
                        String linea;

                        // Permite al usuario escribir en el diario hasta que deje la entrada vacía
                        do {
                            linea = JOptionPane.showInputDialog("Escriba aquí (deje vacío y presione 'Aceptar' para terminar):");
                            if (linea != null && !linea.isEmpty()) {
                                entradaUsuario.append(linea).append(System.lineSeparator());
                            }
                        } while (linea != null && !linea.isEmpty());

                        // Si el usuario escribió algo, lo guarda en el archivo
                        if (entradaUsuario.length() > 0) {
                            escribirDiario = new FileWriter(diario, true);
                            escribirDiario.write(entradaUsuario.toString());
                            JOptionPane.showMessageDialog(null, "Se registró su día exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se ha escrito nada.");
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "ERROR al escribir:\n" + e.getMessage());
                    } finally {
                        // Asegura que el FileWriter se cierre correctamente
                        if (escribirDiario != null) {
                            try {
                                escribirDiario.close();
                            } catch (IOException e) {
                                JOptionPane.showMessageDialog(null, "ERROR al cerrar el archivo:\n" + e.getMessage());
                            }
                        }
                    }
                    break;

                case 2:
                    // Opción para leer el contenido del diario
                    Scanner leer = null;
                    try {
                        StringBuilder contenidoDiario = new StringBuilder();
                        leer = new Scanner(diario);
                        // Verifica si el archivo existe y tiene contenido
                        if (diario.exists() && diario.length() > 0) {
                            while (leer.hasNextLine()) {
                                contenidoDiario.append(leer.nextLine()).append(System.lineSeparator());
                            }
                            // Muestra el contenido del diario
                            JOptionPane.showMessageDialog(null, contenidoDiario.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "El diario está vacío o no existe.");
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "ERROR al leer:\n" + e.getMessage());
                    } finally {
                        // Asegura que el Scanner se cierre correctamente
                        if (leer != null) {
                            try {
                                leer.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "ERROR al cerrar el archivo:\n" + e.getMessage());
                            }
                        }
                    }
                    break;

                case 3:
                    // Opción para eliminar el archivo del diario
                    if (diario.delete()) {
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el diario correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El archivo no se pudo eliminar. Asegúrese de que no esté en uso.");
                    }
                    break;

                case 0:
                    // Opción para salir del programa
                    JOptionPane.showMessageDialog(null, "Gracias, vuelva pronto.");
                    break;

                default:
                    // Manejo de una opción no válida
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcionMenu != 0); // El menú se repetirá hasta que el usuario elija salir
    }
}
