/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Camping extends ExtraHotel{
    private int cantCarpas;//Capacidad máxima de carpas
    private int cantBanios;//cantidad de baños
    private boolean tieneRest;//tiene Restaurante = true o false

    public Camping() {
    }

    public Camping(int cantCarpas, int cantBanios, boolean tieneRest, boolean privado, double mts2, String nombre, String direccion, String localidad, String encargado) {
        super(privado, mts2, nombre, direccion, localidad, encargado);
        this.cantCarpas = cantCarpas;
        this.cantBanios = cantBanios;
        this.tieneRest = tieneRest;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isTieneRest() {
        return tieneRest;
    }

    public void setTieneRest(boolean tieneRest) {
        this.tieneRest = tieneRest;
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
        return "Camping{" + "Cantidad de Carpas= " + cantCarpas + ", Cantidad de Baños= " + cantBanios + ", tiene Restaurante?= " + tieneRest + '}'
                +"\n"+super.toString();
    }
    
    
    
}
