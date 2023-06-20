/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Hotel extends Alojamiento{
    protected int cantHabitaciones;//por piso
    protected int numCamas;//por habitación
    protected int cantPisos;
    protected double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }
    
 
    @Override
    public String toString() {
        return "Hotel{" + "Cantidad de Habitaciones= " + cantHabitaciones + "Número de Camas= " + numCamas + ", Cantidad de Pisos= " + cantPisos + ", Precio por Habitacion= " + precioHabitacion + '}'
                +"\n"+super.toString();
    }
    
    public static Comparator<Hotel> menorAMayor = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            if (t.getPrecioHabitacion()==t1.getPrecioHabitacion()) {
                return 0;
            }else if(t.getPrecioHabitacion()>t1.getPrecioHabitacion()){
                return -1;
            } else return 1;
        }
    };
    
      
}
