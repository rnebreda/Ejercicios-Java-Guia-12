/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Hotel4;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Hotel4Servicio {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel4 crearHotel() {
        Hotel4 aux = new Hotel4();
        //public Hotel4(String Gimnasio, String nombreRest, int capacidadRest,
        //int cantHabitaciones, int numCamas, int cantPisos,
        //double precioHabitacion, String nombre, String direccion,
        //String localidad, String encargado)
        System.out.println("Ingrese el nombre del Alojamiento");
        aux.setNombre(leer.next());
        System.out.println("Ingrese la Dirección");
        aux.setDireccion(leer.next());
        System.out.println("Ingrese la Localidad");
        aux.setLocalidad(leer.next());
        System.out.println("Ingrese el nombre del Gerente o Encargado");
        aux.setEncargado(leer.next());
        String tipoGym;
        boolean correcto = false;
        do {
            System.out.println("Ingrese tipo de gimnasio (A o B)");
            tipoGym = leer.next().toUpperCase();
            if (tipoGym.equals("A") || tipoGym.equals("B")) {
                correcto = true;
                aux.setGimnasio(tipoGym);
            }
        } while (!correcto);
        System.out.println("Ingrese el nombre del Restaurante");
        aux.setNombreRest(leer.next());
        System.out.println("Ingrese la Capacidad del Restaurante");
        aux.setCapacidadRest(leer.nextInt());
        System.out.println("Ingrese el número de camas por habitación");
        aux.setNumCamas(leer.nextInt());
        System.out.println("Ingrese la cantidad de habitaciones por piso");
        aux.setCantHabitaciones(leer.nextInt());
        System.out.println("Ingrese la cantidad de pisos del hotel");
        aux.setCantPisos(leer.nextInt());
        calcularPrecio(aux);
        return aux;
    }

    protected void calcularPrecio(Hotel4 h) {
        /*
        El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
        PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor 
        agregado por gimnasio) + (valor agregado por limosinas). 
        Donde: 
            Valor agregado por el restaurante: 
                • $10 si la capacidad del restaurante es de menos de 30 personas.
                • $30 si está entre 30 y 50 personas. 
                • $50 si es mayor de 50. 
            Valor agregado por el gimnasio: 
                • $50 si el tipo del gimnasio es A. 
                • $30 si el tipo del gimnasio es B. 
            Valor agregado por las limosinas: (En Hoteles 4 estrellas no corresponde)
                • $15 por la cantidad de limosinas del hotel.
         */
        double aux = 50 + h.getCantHabitaciones() * h.getNumCamas() * h.getCantPisos();

        if (h.getGimnasio().equals("A")) {
            aux += 50;
        } else {
            aux += 30;
        }

        if (h.getCapacidadRest() < 30) {
            aux += 10;
        } else if (h.getCapacidadRest() <= 50) {
            aux += 30;
        } else {
            aux += 50;
        }
        h.setPrecioHabitacion(aux);
    }
}
