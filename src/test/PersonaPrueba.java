// Con nuestro primer objeto de tipo persona Ahora lo que podemos hacer con 
// los metodos get y set es acceder a la informacion de este objeto o modificarla

package test;


import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Daniel", 4.500000, false);
        System.out.println("persona1 Nombre = " + persona1.getNombre());
        //
        System.out.println("persona1 Nombre = " + persona1.toString());
        persona1.setNombre("Daniel Andres");
        //
        System.out.println("persona1 Nombre con cambio = " + persona1.getNombre()); //
        System.out.println("------------------------------------------");
        
        System.out.println("persona1 Nombre = " + persona1.getNombre());
        System.out.println("persona1 Sueldo = " + persona1.getSueldo());
        System.out.println("persona1 Eliminado = " + persona1.isEliminado());
        
        // toString: este metodo convierte en cadena a cada uno de los atributos denuestra clase
        System.out.println("------------------------------------------");
        // m
        System.out.println("----- Metodo toString ----");
        System.out.println("persona1: " + persona1.toString());
        
    }
     
}
