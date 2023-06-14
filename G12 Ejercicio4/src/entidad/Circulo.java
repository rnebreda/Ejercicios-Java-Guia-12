/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import interfaces.calculosFormas;

/**
 *
 * @author John
 */
public class Circulo implements calculosFormas {

    private double radio;

    @Override
    public double calcularArea() {
        return PI*(radio*2);
    }

    @Override
    public double calcularPerimetro() {
    return PI*(Math.pow(radio,2));
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
