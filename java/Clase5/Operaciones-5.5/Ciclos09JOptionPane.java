import javax.swing.JOptionPane;

public class Ciclos09JOptionPane {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        String mensaje;
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12) {
            mensaje = "La fecha " + dia + "/" + mes + "/" + año + " es válida.";
        } else {
            mensaje = "La fecha ingresada es inválida.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}