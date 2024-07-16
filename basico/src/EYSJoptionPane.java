import javax.swing.*;

public class EYSJoptionPane {
    public static void main(String[] args) {
        // Declaración de variables para almacenar los datos ingresados por el usuario
        String cadena;
        int entero;
        char letra;
        double decimal;

        // Solicitar al usuario que ingrese una cadena de texto
        cadena = JOptionPane.showInputDialog("Ingresa una cadena: ");
        // Mostrar la cadena ingresada en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);

        // Solicitar al usuario que ingrese un número entero y convertirlo de cadena a entero
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un entero: "));
        // Mostrar el número entero ingresado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El número entero es: " + entero);

        // Solicitar al usuario que ingrese una letra y obtener el primer carácter de la cadena ingresada
        letra = JOptionPane.showInputDialog("Ingresa una letra: ").charAt(0);
        // Mostrar la letra ingresada en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);

        // Solicitar al usuario que ingrese un número decimal y convertirlo de cadena a double
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un decimal: "));
        // Mostrar el número decimal ingresado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El número decimal es: " + decimal);
    }
}
