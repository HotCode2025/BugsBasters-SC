package operaciones.pkg5.pkg5;




public class Operaciones5_5 {

    public static void main(String[] args) {
        // Crear objeto de la clase Aritmetica
        Aritmetica aritmetica1 = new Aritmetica();

        // Asignar valores
        aritmetica1.a = 3;
        aritmetica1.b = 7;

        // Llamar método sin retorno
        aritmetica1.sumarNumeros();

        // Llamar método con retorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado con retorno = " + resultado);

        // Llamar método con argumentos
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);
    }
}
