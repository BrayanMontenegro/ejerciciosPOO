/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author Oreki
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        automovil miAuto1 = new automovil ("Hilux", 2005, 1.0, "Gasolina", "Deportivo", 2, 4, 180, "Blanco", 150);
        miAuto1.Imprimir();
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");
        
        miAuto1.acelerar(20);
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

        miAuto1.desacelerar(50);
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

        miAuto1.frenar();
        System.out.println("Velocidad actual: " + miAuto1.getVelocidadActual() + " km/h");

    }
}