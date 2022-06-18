/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3;

/**
 *
 * @author Escuiquirin
 */
public class Automovil {
    private String placa;
    private String marca;
    private String color;
    private String descripcion;
    private int modelo;
    private int anioFabricacion;
    private double precio;
    private double kilometraje;

    public Automovil(String placa, String marca, String color, String descripcion, int modelo, int anioFabricacion, double precio, double kilometraje) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    public Automovil() {
        placa= "FCS999";
        marca= "Ferrari";
        color = "rojo";
        descripcion= "Coche deportivo y lujoso";
        modelo=2021;
        anioFabricacion= 2020;
        precio= 500000000;
        kilometraje=1200;
        
    }
    
    
    
    public String calcularUsoAutomovil(){
        if (kilometraje == 0 && kilometraje < 1000){
            return "Auto nuevo";
        }
        if (kilometraje > 1000 && kilometraje < 20000){
            return "Auto casi nuevo";
        }
        if (kilometraje < 100000){
            return "Auto muy usado";
        }
        return null;
    }
    
    public String calcularCalidadAutomovil (){
        if (anioFabricacion < 2015 ){
            return "modelo antiguo";
        }
        if (anioFabricacion >= 2015 && anioFabricacion < 2020){
            return "modelo intermedio";
        }
        if (kilometraje == 2021){
            return "modelo nuevo";
        }
        if (kilometraje == 2022){
            return "ultimo-modelo";
        }
        return null;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getModelo() {
        return modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    
    
    
}
