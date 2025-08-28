/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos03;

import javax.swing.JOptionPane;

/**
 *
 * @author Luly
 */
public class Ciclos03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int numero;

        do {
            String entrada = JOptionPane.showInputDialog("Ingrese un número (0 para salir):");
            numero = Integer.parseInt(entrada);

            if (numero != 0) {
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, numero + " es par.");
                } else {
                    JOptionPane.showMessageDialog(null, numero + " es impar.");
                }
            }
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Fin del programa.");
    }
}