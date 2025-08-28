package Ciclos05;

import javax.swing.JOptionPane;

public class Ciclos05 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 101); // número entre 0 y 100
        int intentos = 0;
        int numeroUsuario = -1;

        JOptionPane.showMessageDialog(null, "¡Adivina el número entre 0 y 100!");

        while (numeroUsuario != numeroAleatorio) {
            String input = JOptionPane.showInputDialog("Ingresa un número:");
            
            if (input == null) { // Si el usuario cancela
                JOptionPane.showMessageDialog(null, "Juego cancelado.");
                return;
            }

            try {
                numeroUsuario = Integer.parseInt(input);
                intentos++;

                if (numeroUsuario < numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "El número es MAYOR.");
                } else if (numeroUsuario > numeroAleatorio) {
                    JOptionPane.showMessageDialog(null, "El número es MENOR.");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Correcto! Adivinaste en " + intentos + " intentos.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un número válido.");
            }
        }
    }
}

