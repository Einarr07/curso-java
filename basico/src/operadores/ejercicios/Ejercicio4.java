/*Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, más una comisión
de $150 por cada carro vendido, más de 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa
en la computadora los datos pertinentes. Hacer un programa que calcule e imprima el salario mensaul de un vendedor dado */
package operadores.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salarioMensual = 1000, comisionPorCarro = 150;
        float valorVehiculo, cincoPorciento, salarioTotal;
        int carrosVendidos;

        System.out.println("------------------------------------------");
        System.out.println("Calculador de salario mensual (Vendedores)");
        System.out.println("------------------------------------------");

        System.out.print("Ingrese el número de carros vendidos: ");
        carrosVendidos = entrada.nextInt();

        System.out.print("Ingrese el valor promedio de los vehículos vendidos: ");
        valorVehiculo = entrada.nextFloat();

        cincoPorciento = valorVehiculo * 0.05f;
        salarioTotal = salarioMensual + (comisionPorCarro * carrosVendidos) + (cincoPorciento * carrosVendidos);

        System.out.println("Su salario mensual es de: " + salarioTotal);
        entrada.close();
    }
}

