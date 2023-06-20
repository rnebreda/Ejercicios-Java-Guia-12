/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cambioEstadoCivil(Persona p) {
        if (p == null) {
            System.out.println("DNI incorrecto");
        } else {
            System.out.println("El estado civil actual es: " + p.getEstadoCivil());
            System.out.println("Ingrese el nuevo estado civil");
            p.setEstadoCivil(leer.next());
        }
    }

}
