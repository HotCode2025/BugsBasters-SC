package Ciclo04;

import javax.swing.JOptionPane;

public class Ciclos04JOptionPane {
    public static void main(String[] args) {
        int numero, contador = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (negativo para salir):"));

        while (numero >= 0) {
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número (negativo para salir):"));
        }

        JOptionPane.showMessageDialog(null, "Se introdujeron " + contador + " números.");
    }
}
