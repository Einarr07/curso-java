/* Es un sencillo algoritmo de ordenamiento. Funciona revisando cada elemento de la lista que se va a ser ordendada
* con el siguiente intercambiándolos de posición si están en el orden equivocado. Es necesario revisar varias veces
* toda la lista hasta que no se necesiten más intercambios, lo cual significa que la lista está ordenada.*/
package ordenamientos;

import javax.swing.*;

public class MetodoBurbuja {
    public static void main(String[] args) {
        int arreglo[], elementos, aux;

        elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo: "));

        arreglo = new int[elementos];

        for (int i = 0; i < elementos; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento " +(i+1)));
        }

        // Metodo burbuja
        for (int i = 0; i < (elementos-1); i++){
            for(int j = 0; j < (elementos-1); j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

        // Mostrando el arreglo ordenado de forma creciente
        StringBuilder resultado = new StringBuilder("Arreglo ordenado de forma creciente");
        for(int i = 0; i < elementos; i++){
            resultado.append(" [").append(arreglo[i]).append("] ");
        }

        JOptionPane.showMessageDialog(null,resultado.toString());

        StringBuilder formaDecreciente = new StringBuilder("Arrelgo ordenado de forma decreciente");
        for(int i = (elementos-1); i >= 0; i--){
            formaDecreciente.append(" [").append(arreglo[i]).append("] ");
        }

        JOptionPane.showMessageDialog(null, formaDecreciente.toString());
    }
}
