/*
 Por lo que se refiere a los profesores, es necesario gestionar a qué departamento 
pertenecen (lenguajes, matemáticas, arquitectura, ...). 
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Profesor extends Empleado{
    private String depto; //departamento, array de 10 departamentos

    public Profesor() {
    }

    public Profesor(String depto, String Incorporacion, int numDespacho, String nombre, String apellido, String dni, String estadoCivil) {
        super(Incorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getIncorporacion() {
        return Incorporacion;
    }

    public void setIncorporacion(String Incorporacion) {
        this.Incorporacion = Incorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Profesor{" + "Departamento= " + depto + '}'
                +"\n"+super.toString();
    }
    
    
    
}
