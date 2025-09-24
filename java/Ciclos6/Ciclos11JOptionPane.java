import javax.swing.JOptionPane;

public class Ciclos11JOptionPane {
    public static void main(String[] args) {
        long producto = 1;
        StringBuilder mensaje = new StringBuilder("calculando el producto de los primeros 10 números impares:\n");

        for (int i = 1, contador = 0; contador < 10; i += 2, contador++) {
            producto *= i;
            mensaje.append("impar #").append(contador + 1).append(": ").append(i).append("\n");
        }

        mensaje.append("resultado final: ").append(producto);
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}