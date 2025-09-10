import java.util.Scanner;

public class Ciclos09Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese el año: ");
        int año = entrada.nextInt();

        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es válida.");
        } else {
            System.out.println("La fecha ingresada es inválida.");
        }

        entrada.close();
    }
}