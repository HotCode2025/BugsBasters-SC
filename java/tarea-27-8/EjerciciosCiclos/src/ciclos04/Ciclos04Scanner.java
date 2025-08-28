package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Ingresa números (termina con un número negativo):");

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                contador++;
            }
        } while (numero >= 0);

        System.out.println("Has introducido " + contador + " números.");
        sc.close();
    }
}

