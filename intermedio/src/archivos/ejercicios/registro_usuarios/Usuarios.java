package archivos.ejercicios.registro_usuarios;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Usuarios {
    public static void main(String[] args) {
        int opcionMenu;
        String nombreArchivo = "usuarios.txt"; // Nombre del archivo para almacenar registros de usuarios
        File usuarios = new File(nombreArchivo); // Archivo para el registro de usuarios

        do {
            // Mostrar un menú para que el usuario seleccione una opción
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción deseada:\n" +
                    "1.- Registrar un nuevo usuario\n" +
                    "2.- Ver el registro de usuarios\n" +
                    "3.- Eliminar usuario por el correo\n" +
                    "0.- Salir"));

            switch (opcionMenu){
                case 1:
                    // Opción para registrar un nuevo usuario
                    String nombre, correo;
                    int edad;
                    StringBuilder entradaUsuario = new StringBuilder();
                    FileWriter registrarUsuario = null;
                    try {
                        // Crear el archivo si no existe
                        if (usuarios.createNewFile()){
                            JOptionPane.showMessageDialog(null, "El archivo "+ nombreArchivo +
                                    " se ha creado correctamente");
                        }

                        // Obtener datos del usuario
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario que desea registrar");
                        entradaUsuario.append(nombre).append(System.lineSeparator());
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del usuario"));
                        entradaUsuario.append(edad).append(System.lineSeparator());
                        correo = JOptionPane.showInputDialog("Ingrese el correo del usuario");
                        entradaUsuario.append(correo).append(System.lineSeparator());

                        // Escribir los datos en el archivo
                        if (entradaUsuario.length() > 0){
                            registrarUsuario = new FileWriter(usuarios, true);
                            registrarUsuario.write(entradaUsuario.toString());
                            JOptionPane.showMessageDialog(null, "Se registró al usuario completamente");
                        }else {
                            JOptionPane.showMessageDialog(null,"No se ha registrado el usuario");
                        }
                    }catch (IOException e){
                        JOptionPane.showMessageDialog(null, "Error:\n"+ e.getMessage());
                    }finally {
                        // Asegura que el FileWriter se cierre correctamente
                        if (registrarUsuario != null){
                            try{
                                registrarUsuario.close();
                            }catch (IOException e){
                                JOptionPane.showMessageDialog(null, "El archivo no pudo " +
                                        "cerrarse de forma correcta\n"+ e.getMessage());
                            }
                        }
                    }
                    break;
                case 2:
                    // Opción para ver el registro de usuarios
                    Scanner leer = null;
                    try {
                        StringBuilder datosUsuario = new StringBuilder();
                        leer = new Scanner(usuarios);
                        // Verifica si el archivo existe y tiene contenido
                        if ((usuarios.exists()) && (usuarios.length() > 0)) {
                            while (leer.hasNextLine()) {
                                // Lee y formatea los datos de cada usuario
                                datosUsuario.append("Nombre: ").append(leer.nextLine()).append(System.lineSeparator());
                                datosUsuario.append("Edad: ").append(leer.nextLine()).append(System.lineSeparator());
                                datosUsuario.append("Correo: ").append(leer.nextLine()).append(System.lineSeparator());
                                datosUsuario.append("-----------------------------------\n");
                            }

                            // Crear un JTextArea y agregar un JScrollPane para mostrar el contenido
                            JTextArea textArea = new JTextArea(datosUsuario.toString());
                            textArea.setEditable(false);
                            JScrollPane scrollPane = new JScrollPane(textArea);
                            scrollPane.setPreferredSize(new Dimension(400, 300));

                            // Mostrar el contenido del archivo en un cuadro de diálogo
                            JOptionPane.showMessageDialog(null, scrollPane, "Registro de Usuarios",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "El contenido está vacío o no existe");
                        }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error:\n" + e.getMessage());
                    } finally {
                        // Asegura que el Scanner se cierre correctamente
                        if (leer != null) {
                            try {
                                leer.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error al cerrar el archivo\n"
                                        + e.getMessage());
                            }
                        }
                    }
                    break;
                case 3:
                    // Opción para eliminar el archivo de usuarios
                    if (usuarios.delete()){
                        JOptionPane.showMessageDialog(null,"Se ha eliminado el registro de " +
                                "usuarios exitosamente");
                    }else {
                        JOptionPane.showMessageDialog(null, "No se ha podido eliminar el archivo");
                    }
                    break;
                case 0:
                    // Opción para salir del programa
                    JOptionPane.showMessageDialog(null,"Gracias, vuelva pronto");
                    break;

                default:
                    // Manejo de una opción no válida
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                    break;
            }
        }while (opcionMenu != 0); // El menú se repetirá hasta que el usuario elija salir
    }
}
