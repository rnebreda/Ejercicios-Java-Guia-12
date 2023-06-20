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
public class ExtraHotel extends Alojamiento{
    protected boolean privado;//privado=true o false
    protected double mts2;//metros cuadrados ocupados

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, double mts2, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privado = privado;
        this.mts2 = mts2;
    }

    @Override
    public String toString() {
        return "ExtraHotel{" + "Es privado?= " + privado + ", Cantidad de mts2= " + mts2 + '}'
                +"\n"+super.toString();
    }
    
    
}
