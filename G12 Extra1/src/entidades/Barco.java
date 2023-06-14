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
    protected double eslora;
    protected int anio;

    public Barco(int matricula, double eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public Barco() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}
