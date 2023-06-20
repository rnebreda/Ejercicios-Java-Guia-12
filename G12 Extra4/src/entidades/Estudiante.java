/*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están 
matriculados. 
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    private String curso; //array de 15 cursos

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, String dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
        return "Estudiante{" + "Curso Matriculado= " + curso + '}'
                +"\n"+super.toString();
    }
    
    
}
