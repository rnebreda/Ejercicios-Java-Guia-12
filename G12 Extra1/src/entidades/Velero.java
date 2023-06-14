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
public class Velero extends Barco{
    private int nroMastiles;

    public Velero(int nroMastiles, int matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.nroMastiles = nroMastiles;
    }

    public Velero() {
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }


    
    
}
