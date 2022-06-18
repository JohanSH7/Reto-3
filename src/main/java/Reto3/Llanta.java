/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3;

/**
 *
 * @author Escuiquirin
 */
public class Llanta {
    private String marca;
    private String referencia;
    private float peso;

    public Llanta(String marca, String referencia, float peso) {
        this.marca = marca;
        this.referencia = referencia;
        this.peso = peso;
    }
    public Llanta(){
        this("Michelin","30ZR21",72.6f);
    }

    public String getMarca() {
        return marca;
    }
    public String getReferencia() {
        return referencia;
    }
    public float getPeso() {
        return peso;
    }

    
}
