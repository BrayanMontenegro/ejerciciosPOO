/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Elieth
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          planetas atributos = new planetas("Tierra", 6000, 5.97, 1.08, 12742, 1496, 0, true);
       atributos.Imprimir();
       planetas atributos1 = new planetas("Marte", 5, 6.39, 1.63, 6779, 2279, 0, true);
       atributos1.Imprimir();
    }
    
    
}
