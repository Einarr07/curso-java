package busquedas;

import javax.swing.*;

public class Binaria {
    public static void main(String[] args) {
        int arreglo[] = {1, 2, 3, 4, 5};
        int dato;
        boolean bandera = false;

        // Solicitar al usuario el número que desea buscar
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea buscar: "));

        // Búsqueda binaria
        int inicio = 0;
        int fin = arreglo.length - 1;
        int medio = 0;

        while(inicio <= fin && bandera == false) {
            medio = (inicio + fin) / 2;

            if(arreglo[medio] == dato) {
                bandera = true;
            } else if(arreglo[medio] < dato) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        // Mostrar el resultado
        if(bandera == false) {
            JOptionPane.showMessageDialog(null, "El número ingresado no se ha encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición " + medio);
        }
    }
}
