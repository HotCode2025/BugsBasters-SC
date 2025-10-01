package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] argg){
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        persona1.setNombre("Juan Ignacio");

System.out.println("persona1 con su nombre modificado: " +persona1.getNombre());
System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());

//Tarea 
  
    Persona persona2 = new Persona("Cande", 500.000, true);
    System.out.println("persona2 su nombre es: " + persona2.getNombre());
    System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
    System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());

    persona2.setNombre("María");
    persona2.setSueldo(50.000);
    persona2.setEliminado(false);

    System.out.println("persona2 nuevo nombre: " + persona2.getNombre());
    System.out.println("persona2 nuevo sueldo: " + persona2.getSueldo());
    System.out.println("persona2 nuevo estado eliminado: " + persona2.isEliminado());
}

    }
   
