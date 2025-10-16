/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones.pkg5.pkg5;

/**
 *
 * @author brian
 */


public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    // Método para sumar e imprimir el resultado
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("Resultado de la suma: " + resultado);
    }

    // Método con retorno
    public int sumarConRetorno() {
        return a + b;
    }

    // Método con argumentos
    public int sumarConArgumentos(int x, int y) {
        return x + y;
    }
}
