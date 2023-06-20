/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Hotel4;
import entidades.Hotel5;

/**
 *
 * @author Usuario
 */
public class Hotel5Servicio extends Hotel4Servicio {

    @Override
    public Hotel5 crearHotel() {
        Hotel4 h4 = super.crearHotel();
        Hotel5 aux = new Hotel5();
        //public Hotel5(int cantSalones, int cantSuites, int cantLimos, 
        //String Gimnasio, String nombreRest, int capacidadRest, int cantHabitaciones, 
        //int numCamas, int cantPisos, double precioHabitacion, String nombre, 
        //String direccion, String localidad, String encargado) {

        aux.setNombre(h4.getNombre());
        aux.setDireccion(h4.getDireccion());
        aux.setLocalidad(h4.getLocalidad());
        aux.setEncargado(h4.getEncargado());
        aux.setGimnasio(h4.getGimnasio());
        aux.setNombreRest(h4.getNombreRest());
        aux.setCapacidadRest(h4.getCapacidadRest());
        aux.setNumCamas(h4.getNumCamas());
        aux.setCantPisos(h4.getCantPisos());
        aux.setCantHabitaciones(h4.getCantHabitaciones());
        System.out.println("Ingrese la cantidad de salones para conferencias");
        aux.setCantSalones(leer.nextInt());
        System.out.println("Ingrese la cantidad de Suits en el hotel");
        aux.setCantSuites(leer.nextInt());
        System.out.println("Ingrese la cantidad de limusinas disponibles");
        aux.setCantLimos(leer.nextInt());
        aux.setPrecioHabitacion(h4.getPrecioHabitacion()+aux.getCantLimos()*15);

        return aux;

    }



}
