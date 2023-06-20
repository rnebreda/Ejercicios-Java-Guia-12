/*
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de 
identificación y su estado civil. 
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Persona {
    protected String nombre;// de un array de 20 nombres
    protected String apellido;// de un array de 15 apellidos
    protected String dni;//"##.###.###" entre 10 millones y 50 millones.
    protected String estadoCivil;//"Soltero/a, Casado/a, Divorciado/a, Viudo/a, Otro/a"

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + " " + apellido + ", dni=" + dni + ", Estado Civil=" + estadoCivil + '}';
    }
    
    
    
}
