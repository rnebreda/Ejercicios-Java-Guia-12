/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.PersonalDeServicio;
import java.util.Scanner;
import utilidades.Utilidades;

/**
 *
 * @author Usuario
 */
public class PersonalDeServicioServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Utilidades u = new Utilidades();

    public void cambioSeccion(PersonalDeServicio p) {
        if (p == null) {
            System.out.println("DNI incorrecto");
        } else {
            System.out.println("La sección actual es: " + p.getSeccion());
            System.out.println("Ingrese la nueva sección");
            p.setSeccion(leer.next());
        }
    }

    public PersonalDeServicio crearPersonalDeServicio() {
        //PersonalDeServicio(String seccion, String Incorporacion, int numDespacho, 
        //String nombre, String apellido, String dni, String estadoCivil)

        return new PersonalDeServicio(u.seccion(), u.incorporacion(), u.despacho(), u.nombre(), u.apellido(), u.crearDni(), u.estadoCivil());
    }
}
