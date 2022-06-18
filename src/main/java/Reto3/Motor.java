/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3;

/**
 *
 * @author Escuiquirin
 */
public class Motor {
    private  String marca;
    private String referencia;
    private String descripcion;
    private int cilindraje;
    private double peso;

    public Motor(String marca, String referencia, String descripcion, int cilindraje, double peso) {
        this.marca = marca;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.cilindraje = cilindraje;
        this.peso = peso;
    }
    public Motor() {
        this ("W16", "8.0 Lts", "cuenta con 1.500CV de potencia y un par motor máximo de 1.600 Nm", 7993, 600);
    }

    public String getMarca() {
        return marca;
    }
    public String getReferencia() {
        return referencia;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public double getPeso() {
        return peso;
    }
    
    
}
