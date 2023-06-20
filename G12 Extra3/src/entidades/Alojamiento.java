/*
Los alojamientos se identifican por un nombre, una dirección, una localidad y 
un gerente encargado del lugar.
La compañía trabaja con dos tipos de alojamientos: 
Hoteles y Alojamientos Extrahoteleros. 
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String encargado;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.encargado = encargado;
    }


    @Override
    public String toString() {
        return "Alojamiento{" + "Nombre= " + nombre + ", Direccion= " + direccion + ", Localidad= " + localidad + ", Encargado= " + encargado + '}';
    }
    
    
}
