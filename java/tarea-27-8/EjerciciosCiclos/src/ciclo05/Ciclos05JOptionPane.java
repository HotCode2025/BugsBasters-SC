package ciclo05;

import javax.swing.JOptionPane;

public class Ciclos05JOptionPane {
    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 101); // 0-100
        int intento, contador = 0;

        do {
            intento = Integer.parseInt(JOptionPane.showInputDialog("Adivine el número (entre 0 y 100):"));
            contador++;

            if (intento > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Es menor");
            } else if (intento < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Es mayor");
            }
        } while (intento != numeroSecreto);

        JOptionPane.showMessageDialog(null, "¡Correcto! El número era " + numeroSecreto + ". Intentos: " + contador);
    }
}
