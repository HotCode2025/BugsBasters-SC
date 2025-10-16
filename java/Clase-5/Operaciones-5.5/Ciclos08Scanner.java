import java.util.Scanner;

public class Ciclos08Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int N = entrada.nextInt();

        System.out.println("Números del 1 al " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        entrada.close();
    }
}