package busquedas;

import javax.swing.*;

public class Secuencial {
    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean bandera = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea buscar: "));

        // Busqueda secuencial
        int i = 0;
        while((i < 5) && (bandera == false)){
            if(arreglo[i] == dato){
                bandera = true;
            }
            i++;
        }

        if(bandera == false){
            JOptionPane.showMessageDialog(null, "El número ingresado no se ha encontrado");
        }else {
            JOptionPane.showMessageDialog(null,"El número que a sido encontrado en la posicion "
            +(i-1));
        }
    }
}
