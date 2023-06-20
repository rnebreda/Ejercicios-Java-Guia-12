/*
 Sobre el personal de servicio, hay que conocer a qué sección están asignados 
(biblioteca, decanato, secretaría, ...). 
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class PersonalDeServicio extends Empleado{
    private String seccion; //array de 10 secciones

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, String Incorporacion, int numDespacho, String nombre, String apellido, String dni, String estadoCivil) {
        super(Incorporacion, numDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
        return "PersonalDeServicio{" + "Sección= " + seccion + '}'
                +"\n"+super.toString();
    }
    
    
    
}
