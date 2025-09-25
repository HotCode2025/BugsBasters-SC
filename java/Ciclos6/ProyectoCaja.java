package caja;

public class Caja {
    double ancho = 2.0;
    double alto = 4.0;
    double profundidad = 3.5;
    
    public double calcularVolumen() {
        return ancho * alto * profundidad;
    }
   public static void main(String[] args) { 
        Caja miCaja = new Caja();
        double volumen = miCaja.calcularVolumen();
        System.out.println("El volumen de la caja sería: " + volumen);
   }
}
