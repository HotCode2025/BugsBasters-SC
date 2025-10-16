package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 101); // número entre 0 y 100
        int intentos = 0;
        int numeroUsuario;

        System.out.println("¡Adivina el número entre 0 y 100!");

        do {
            System.out.print("Ingresa un número: ");
            numeroUsuario = sc.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es MAYOR.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es MENOR.");
            } else {
                System.out.println("¡Correcto! Adivinaste en " + intentos + " intentos.");
            }
        } while (numeroUsuario != numeroAleatorio);

        sc.close();
    }
}

