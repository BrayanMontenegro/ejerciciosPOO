/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author Oreki
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

    Persona persona1 = new Persona("Juan", "Perez", 12345678, 1990, "Argentina");
    Persona persona2 = new Persona("María", "Gomez", 87654321, 2000, "España");
    
    persona1.imprimirDatos();
    persona2.imprimirDatos();
    
    int añoActual = 2021;
    int edad1 = persona1.calcularEdad(añoActual);
    int edad2 = persona2.calcularEdad(añoActual);
    System.out.println("La edad de " + persona1.nombre + " " + persona1.apellido + " es " + edad1 + " años.");
    System.out.println("La edad de " + persona2.nombre + " " + persona2.apellido + " es " + edad2 + " años.");
    
   
    }

}
    

