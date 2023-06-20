/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Residencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ResidenciaServicio {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Residencia crearResidencia(){
        Residencia aux = new Residencia();
            //int cantHab, boolean descGremios, boolean campoDepor, 
            //boolean privado, double mts2, String nombre, String direccion, 
            //String localidad, String encargado
                    

        System.out.println("Ingrese el nombre del Alojamiento");
        aux.setNombre(leer.next());
        System.out.println("Ingrese la Dirección");
        aux.setDireccion(leer.next());
        System.out.println("Ingrese la Localidad");
        aux.setLocalidad(leer.next());
        System.out.println("Ingrese el nombre del Gerente o Encargado");
        aux.setEncargado(leer.next());
        System.out.println("Ingrese la cantidad de habitaciones en la residencia");
        aux.setCantHab(leer.nextInt());
        System.out.println("Se hacen descuentos a gremios? (S=Si)");
        aux.setDescGremios(leer.next().equalsIgnoreCase("S"));
        System.out.println("Tiene campo de deportes? (S=Si)");
        aux.setCampoDepor(leer.next().equalsIgnoreCase("S"));
        System.out.println("Es privado? (S=Si)");    
        aux.setPrivado(leer.next().equalsIgnoreCase("S"));
        System.out.println("Ingrese la cantidad de metros cuadrados de la residencia");
        aux.setMts2(leer.nextDouble());
        
        return aux;
    }
}
