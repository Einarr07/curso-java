/*Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones
* aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar
* la operación con el primer cáracter del primer parámetro de la línea de comandos: S o s para la suma, R o r para
* la resta, P, p, M o m para el producto y D o d para la división.*/
package condicionales.ejercicios;

import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        int num1, num2, suma, resta, mult, div;
        char operacion;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));

        operacion = JOptionPane.showInputDialog("Ingresa la operación a realizar").charAt(0);

        switch (operacion){
            case 's':
            case 'S':
                suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                break;
            case 'r':
            case 'R':
                resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "La resta es: "+resta);;
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                mult = num1 * num2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: "+mult);
                break;
            case 'd':
            case 'D':
                div = num1 / num2;
                JOptionPane.showMessageDialog(null, "La división es: "+div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, se equivoco de operación");
        }
    }
}
