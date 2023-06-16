/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public abstract class Edificio {
    protected double ancho, alto, largo;

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio() {
    }


    
    public abstract void calcularSuperficie();
        
    public abstract void calcularVolumen();
}
