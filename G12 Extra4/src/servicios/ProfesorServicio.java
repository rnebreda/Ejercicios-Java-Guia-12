/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Profesor;
import java.util.Scanner;
import utilidades.Utilidades;

/**
 *
 * @author Usuario
 */
public class ProfesorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Utilidades u = new Utilidades();

    public void cambioDepto(Profesor p) {
        if (p == null) {
            System.out.println("DNI incorrecto");
        } else {
            System.out.println("El departamento actual es: " + p.getDepto());
            System.out.println("Ingrese el nuevo departamento");
            p.setDepto(leer.next());
        }
    }

    public Profesor crearProfesor() {
        //Profesor(String depto, String Incorporacion, int numDespacho, 
        //String nombre, String apellido, String dni, String estadoCivil)
        return new Profesor(u.departamento(), u.incorporacion(), u.despacho(), u.nombre(), u.apellido(), u.crearDni(), u.estadoCivil());
    }
}
