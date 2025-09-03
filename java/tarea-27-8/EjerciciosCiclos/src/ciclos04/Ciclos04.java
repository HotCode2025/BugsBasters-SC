
package Ciclos04;

import javax.swing.JOptionPane;

public class Ciclos04 {
    public static void main(String[] args) {
        int contador = 0;
        int numero;

        do {
            String input = JOptionPane.showInputDialog("Ingresa un número (negativo para terminar):");
            
            if (input == null) { // Si el usuario cancela
                JOptionPane.showMessageDialog(null, "Juego cancelado.");
                return;
            }

            try {
                numero = Integer.parseInt(input);
                if (numero >= 0) {
                    contador++;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
                numero = 0; // seguir pidiendo
            }

        } while (numero >= 0);

        JOptionPane.showMessageDialog(null, "Has introducido " + contador + " números.");
    }
}
