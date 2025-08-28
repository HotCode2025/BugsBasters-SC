package ciclo05;

import java.util.Scanner;

public class Ciclos05Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 101); // 0-100
        int intento, contador = 0;

        System.out.println("Adivine el número (entre 0 y 100): ");
        intento = sc.nextInt();
        contador++;

        while (intento != numeroSecreto) {
            if (intento > numeroSecreto) {
                System.out.println("Es menor");
            } else {
                System.out.println("Es mayor");
            }
            System.out.println("Intente de nuevo: ");
            intento = sc.nextInt();
            contador++;
        }

        System.out.println("¡Correcto! El número era " + numeroSecreto + ". Intentos: " + contador);
    }
}
