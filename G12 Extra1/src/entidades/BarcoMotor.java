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
public class BarcoMotor extends Barco{
    protected int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(int potencia, int matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor ==> " + "potencia= " + potencia + "cv // "+"\n"+super.toString();
    }
    
    
}
