/*
Para las residencias se 
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no 
campo deportivo.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Residencia extends ExtraHotel{
    private int cantHab; //cantidad de habitaciones
    private boolean descGremios; //hacen descuentos a gremios true o false
    private boolean campoDepor; // posee campo deportivo true o false

    public Residencia() {
    }

    public Residencia(int cantHab, boolean descGremios, boolean campoDepor, boolean privado, double mts2, String nombre, String direccion, String localidad, String encargado) {
        super(privado, mts2, nombre, direccion, localidad, encargado);
        this.cantHab = cantHab;
        this.descGremios = descGremios;
        this.campoDepor = campoDepor;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescGremios() {
        return descGremios;
    }

    public void setDescGremios(boolean descGremios) {
        this.descGremios = descGremios;
    }

    public boolean isCampoDepor() {
        return campoDepor;
    }

    public void setCampoDepor(boolean campoDepor) {
        this.campoDepor = campoDepor;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMts2() {
        return mts2;
    }

    public void setMts2(double mts2) {
        this.mts2 = mts2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    
    

    @Override
    public String toString() {
        return "Residencia{" + "Cantidad de Habitaciones= " + cantHab + ", Descuento a Gremios?= " + descGremios + ", Campo de Deportes?= " + campoDepor + '}'
                +"\n"+super.toString();
    }
    
    
    
}
