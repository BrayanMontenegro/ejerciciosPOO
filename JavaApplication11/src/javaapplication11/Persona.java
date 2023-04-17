/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author Oreki
 */
class Persona {
    String nombre;
    String apellido;
    int dni;
    int anoNacimiento;
    String paisNacimiento;
    
    
    
    public Persona(String nombre, String apellido, int dni, int anoNacimiento, String paisNacimiento) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.anoNacimiento = anoNacimiento;
    this.paisNacimiento = paisNacimiento;
}

public void imprimirDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("DNI: " + dni);
    System.out.println("Año de nacimiento: " + anoNacimiento);
    System.out.println("País de nacimiento: " + paisNacimiento);
}

public int calcularEdad(int anoActual) {
        int edadActual = anoActual - anoNacimiento;
    return edadActual;
}
//intente algo nuevo pero nose como hacer que de ese cidgo esta son funcionalidad 
public String devolverNombreCompleto(int valor) {
    int sumaDigitos = 0;
    int numero = dni;
    while (numero > 0) {
        int digito = numero % 10;
        sumaDigitos += digito;
        numero = numero / 10;
    }
    if (sumaDigitos == valor) {
        return nombre + " " + apellido;
    } else {
        return "";
    }
}

}
