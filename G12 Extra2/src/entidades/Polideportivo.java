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
public final class Polideportivo extends Edificio {
    private String nombre;
    private String tipo;//Abierto o Techado

    public Polideportivo(String nombre, String tipo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public Polideportivo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    

    @Override
    public void calcularSuperficie() {
        double sup = ancho * largo;
        System.out.println("La superficie del Polideportivo es "+sup+ " m2");
    }

    @Override
    public void calcularVolumen() {
        double vol = ancho * alto * largo;
        System.out.println("El volumen del Polideportivo es "+vol+" m3");    
    }
    
}
