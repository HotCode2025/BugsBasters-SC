package clase.pkg4;


import clase.pkg4.Persona;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brian
 */


public class PruebaPersona {

    public static void main(String[] args) {
        // Mejor práctica: Declaración y asignación en una sola línea.
        Persona personal = new Persona();

        personal.nombre = "Leo";
        personal.apellido = "Messi";

        personal.obtenerInformacion();
    }
}