package ciclos;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;

        // for (inicialización ; condición ; aumento o decremento){
        //      Instrucciones;
        // }

        System.out.print("Ingrese la cantidad de terminos: ");
        contador = entrada.nextInt();

        for(int i=1; i<=contador; i++){
            System.out.println(i);
        }

    }
}
