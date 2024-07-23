/*Hacer un programa que simule un cajero automático con un saldo inicial de 1000 Dolares, con el siguiente menú de
* opciones:
* 1.- Ingresar dinero a la cuenta
* 2.- Registrar dinero de la cuenta
* 3.- Salir*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        final int saldoInicial = 1000;
        int op;
        float ingresoCuenta, saldoActual, retiro;

        op = Integer.parseInt(JOptionPane.showInputDialog("Bienbenido a su cajero automatico\n" +
                "1.- Ingresar dinero a la cuenta\n" +
                "2.- Registrar dinero de la cuenta\n" +
                "3.- Salir"));

        switch (op){
            case 1:
                ingresoCuenta = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad que quiere ingresar"));
                saldoActual = saldoInicial + ingresoCuenta;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                break;
            case 2:
                retiro = Float.parseFloat((JOptionPane.showInputDialog("Ingrese cuanto desea retirar: ")));
                if (retiro > saldoInicial){
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente" +
                            "para este retiro");
                }else {
                    saldoActual = saldoInicial - retiro;
                    JOptionPane.showMessageDialog(null, "El dinero en cuenta es: "+saldoActual);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gracias por venir");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Esa opción no existe en el menú");
        }

    }
}
