/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Barco {
    protected int matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(int matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco ==> " + "matricula= " + matricula + ", eslora= " + eslora + "mts , año de fabricación= " + anioFabricacion+ " //";
    }
    
    
}
