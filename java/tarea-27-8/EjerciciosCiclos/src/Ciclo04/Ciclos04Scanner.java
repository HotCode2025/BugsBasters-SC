package Ciclo04;

import java.util.Scanner;

public class Ciclos04Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0;

        System.out.println("Ingrese un número (negativo para salir): ");
        numero = sc.nextInt();

        while (numero >= 0) {
            contador++;
            System.out.println("Ingrese otro número (negativo para salir): ");
            numero = sc.nextInt();
        }

        System.out.println("Se introdujeron " + contador + " números.");
    }
}
