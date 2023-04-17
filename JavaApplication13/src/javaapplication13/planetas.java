/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author Elieth
 */
public class planetas {
       
    String nombre;
    int CantidadSatelites;
    double MasaKilogramos;
    double VolumenKilometrosCbc;
    int DiametroKilometros;
    int DistanciaKilometros;
    int Tamanio;
    boolean Vista;
    
    public planetas(String nombre, int CantidadSatelites, double MasaKilogramos, double VolumenKilometrosCbc, int DiametroKilometros, int DistanciaKilometros, int Tamanio, boolean Vista) {
        this.nombre = nombre;
        this.CantidadSatelites = CantidadSatelites;
        this.MasaKilogramos = MasaKilogramos;
        this.VolumenKilometrosCbc = VolumenKilometrosCbc;
        this.DiametroKilometros = DiametroKilometros;
        this.DistanciaKilometros = DistanciaKilometros;
        this.Tamanio = Tamanio;
        this.Vista = Vista;
    }
    void Imprimir(){
        System.out.println("\nNombre : " + nombre +
                "\nCantidad de satelites : " + CantidadSatelites +
                "\nMasa : " + MasaKilogramos +
                "\nVolumen : " + VolumenKilometrosCbc +
                "\nDiametro : " + DiametroKilometros + 
                "\nDistancia : " + DistanciaKilometros +
                "\nObservable : " + Vista +
                "\nTamaño : " + Tam() + 
                "\nDensidad : " + CalDensidad() +
                "\nPlaneta Exterior : " + DeterCinturon());
        System.out.println("----------------------------------------");
    }
    public String Tam(){
        String Tipo = "";
        double tamanio = VolumenKilometrosCbc;
        if(tamanio <= 1.80 && tamanio >= 1.65){
            Tipo = String.valueOf("Gaseoso " + tamanio);
        }else if(tamanio <= 1.65 && tamanio >= 1.05){
            Tipo = String.valueOf("Terrestre " + tamanio);
        }else if(tamanio <= 1.05 && tamanio >= 1.01){
            Tipo = String.valueOf("Enano " + tamanio);
        }else{
            Tipo = String.valueOf("Error!!.");
        }
        return Tipo;
    }
    
    public double CalDensidad(){
        double Masa = MasaKilogramos;
        double Volumen = VolumenKilometrosCbc; 
        double densidad;
        densidad = Masa / Volumen;
        return densidad;
    }
    
    public boolean DeterCinturon(){
        return (DistanciaKilometros / 149597870) > 3.4 ;
    }
    
}
