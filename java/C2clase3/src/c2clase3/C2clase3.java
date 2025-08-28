/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c2clase3;

import java.util.Scanner;

/**
 *
 * @author Luly
 */
public class C2clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " es par.");
                } else {
                    System.out.println(numero + " es impar.");
                }
            }
        } while (numero != 0);

        System.out.println("Fin del programa.");
    }
    
}


