import javax.swing.JOptionPane;

public class Ciclos08JOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un número N:");
        int N = Integer.parseInt(input);

        StringBuilder resultado = new StringBuilder("Números del 1 al " + N + ":\n");
        for (int i = 1; i <= N; i++) {
            resultado.append(i).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}