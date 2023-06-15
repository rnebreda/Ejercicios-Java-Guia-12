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
public final class Yate extends BarcoMotor {
    private int camarotes;

    public Yate() {
    }
    
    
    public Yate(int camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potencia) {
        super(potencia);
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potencia, int matricula, int eslora, int anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate ==> " + "cantidad de camarotes= " + camarotes + " // "+"\n"+super.toString();
    }
    
    
    
}
