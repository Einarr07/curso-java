package ciclos;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.print("Ingrese la cantidad de terminos que quiere: ");
        contador = entrada.nextInt();;

        do{
            System.out.println(i);
            i++;
        }while (i<=contador);
    }
}
