/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author brian
 */
package test;

import domain.Persona; // Asegúrate de tener esta línea si tu clase Persona está en el paquete 'domain'

public class PersonaPrueba {

    public static void main(String[] args) {
        
        // Crea la primera persona (idPersona = 1)
        Persona persona1 = new Persona("Ariel");
        
        // Imprime el objeto. Llama automáticamente a persona1.toString()
        System.out.println("persona1 = " + persona1); 
        
        // Crea la segunda persona (idPersona = 2)
        Persona persona2 = new Persona("Naty");
        
        // Imprime el segundo objeto. Llama automáticamente a persona2.toString()
        System.out.println("persona2 = " + persona2); 
        
        
        // Opcional: Uso del Getter Estático (acceso a través de la clase)
        System.out.println("\nTotal de objetos creados hasta ahora: " + Persona.getContadorPersona());
    }
}