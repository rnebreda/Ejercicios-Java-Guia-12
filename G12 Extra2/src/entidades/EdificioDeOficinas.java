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
public class EdificioDeOficinas extends Edificio {
    
    private int numOficinas, cantPersonas, numPisos;

    public EdificioDeOficinas(int numOficinas, int cantPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;//total de oficinas = total de pisos (una oficina por piso)
        this.cantPersonas = cantPersonas;//cantidad de personas por oficina
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
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
        double sup = ancho * largo * numPisos;
        sup = decimales(sup,2);
        System.out.println("La superficie del Edificio de oficinas es "+sup+ " m2");
    }

    @Override
    public void calcularVolumen() {
        double vol = ancho * alto * largo;
        vol= decimales(vol,2);
        System.out.println("El volumen del Edificio de oficinas es "+vol+" m3");      }
}
