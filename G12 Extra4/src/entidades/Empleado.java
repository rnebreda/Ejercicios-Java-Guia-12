/*
 Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
incorporación a la facultad y qué número de despacho tienen asignado
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    protected String Incorporacion; //Año de incorporación "yyyy" (1993-2023)
    protected int numDespacho;// número de despacho asignado (1-9)

    public Empleado() {
    }

    public Empleado(String Incorporacion, int numDespacho, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.Incorporacion = Incorporacion;
        this.numDespacho = numDespacho;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    

    @Override
    public String toString() {
        return "Empleado{" + "Año de Incorporacion= " + Incorporacion + ", Despacho asignado= " + numDespacho + '}'
                +"\n"+super.toString();
    }
    
    
    
}
