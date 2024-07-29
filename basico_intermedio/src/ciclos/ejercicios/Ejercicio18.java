/*Hacer unas modificaciones al ejercicio anterior suponiendo que no se eintroduce el precio por litro. Solo existen
* tres productos con precios:
* 1.- 0.6 $/litro
* 2.- 3 $/litro
* 3.- 1.25 $/litro*/
package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro = 0, importeFactura, facturaconTotal = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº" + i + "\nIngrese el código del artículo (1, 2 o 3)"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº" + i + "\nIngrese la cantidad en litros"));

            // Asignar el precio por litro basado en el código del artículo
            switch (codigo) {
                case 1:
                    precioLitro = 0.6f;
                    break;
                case 2:
                    precioLitro = 3.0f;
                    break;
                case 3:
                    precioLitro = 1.25f;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código de artículo no válido. Debe ser 1, 2 o 3.");
                    i--; // Decrementar el contador para volver a pedir el artículo
                    continue; // Saltar a la siguiente iteración del bucle
            }

            importeFactura = litros * precioLitro; // Importe por factura
            facturaconTotal += importeFactura; // Suma iterativa de las facturas

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }

            if (importeFactura > 600) {
                conteoMas600++;
            }
        }

        // Crear una instancia de StringBuilder para acumular el resumen de ventas
        StringBuilder resumen = new StringBuilder();
        resumen.append("Resumen de Ventas\n");
        resumen.append("Facturación total: ").append(facturaconTotal).append("\n");
        resumen.append("Cantidad en litros vendidos del artículo 1: ").append(litrosArticulo1).append("\n");
        resumen.append("Cantidad de facturas mayores a $600: ").append(conteoMas600).append("\n");

        // Mostrar el resumen en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, resumen.toString());
    }
}
