/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Camping;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CampingServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Camping crearCamping(){
        Camping aux = new Camping();
            //public Camping(int cantCarpas, int cantBanios, boolean tieneRest, 
            //boolean privado, double mts2, String nombre, String direccion, 
            //String localidad, String encargado)
                    

        System.out.println("Ingrese el nombre del Alojamiento");
        aux.setNombre(leer.next());
        System.out.println("Ingrese la Dirección");
        aux.setDireccion(leer.next());
        System.out.println("Ingrese la Localidad");
        aux.setLocalidad(leer.next());
        System.out.println("Ingrese el nombre del Gerente o Encargado");
        aux.setEncargado(leer.next());
        System.out.println("Ingrese la capacidad máxima de carpas");
        aux.setCantCarpas(leer.nextInt());
        System.out.println("Ingrese la cantidad de baños");
        aux.setCantBanios(leer.nextInt());
        System.out.println("Tiene restaurante? (S=Si)");
        aux.setTieneRest(leer.next().equalsIgnoreCase("S"));
        System.out.println("Es privado? (S=Si)");    
        aux.setPrivado(leer.next().equalsIgnoreCase("S"));
        System.out.println("Ingrese la cantidad de metros cuadrados del camping");
        aux.setMts2(leer.nextDouble());
        
        return aux;
    }
    
}
