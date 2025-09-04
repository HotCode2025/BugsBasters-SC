import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Introduce números. Teclea 0 para terminar.");

        do {
            System.out.print("Número: ");
            numero = entrada.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
    }
}