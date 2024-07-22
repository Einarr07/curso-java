/*En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300. ¿Cúal será la cantidad que pagará
* una persona por su compra?*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        float compra, descuento, totalAPagar;

        compra = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de su compra: "));

        if (compra > 300){
            descuento = compra * 0.20f;
            totalAPagar = compra - descuento;
            JOptionPane.showMessageDialog(null, "El valor final de su compra aplicado el 20% " +
                    "de descuento es: $" + totalAPagar);
        }else {
            JOptionPane.showMessageDialog(null, "El total a pagar es de: $" + compra);
        }
    }
}
