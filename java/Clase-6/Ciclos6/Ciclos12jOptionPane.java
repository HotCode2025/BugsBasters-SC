import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Ingrese un número para calcular su factorial:");
        int numJOption = Integer.parseInt(input);
        long resultado = calcularFactorial(numJOption);
        JOptionPane.showMessageDialog(null, "El factorial de " + numJOption + " es: " + resultado);
        
    }

    // Método para calcular el factorial
    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}