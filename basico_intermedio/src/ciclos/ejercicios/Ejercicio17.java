package ciclos.ejercicios;

import javax.swing.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro, importeFactura, facturaconTotal = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº" + i + "\nIngrese el código del artículo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo Nº" + i + "\nIngrese la cantidad en litros"));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Artículo Nº" + i + "\nIngrese el precio por litro"));

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
