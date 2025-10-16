package ciclos03;

import java.util.Scanner;

public class Ciclos03Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un número (0 para salir): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println(numero + " es PAR");
            } else {
                System.out.println(numero + " es IMPAR");
            }
            System.out.println("Ingrese otro número (0 para salir): ");
            numero = sc.nextInt();
        }
        System.out.println("Programa finalizado.");
    }
}
