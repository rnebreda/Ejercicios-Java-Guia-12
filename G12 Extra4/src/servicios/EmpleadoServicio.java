/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EmpleadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cambioDespacho(Empleado e) {
        if (e == null) {
            System.out.println("DNI incorrecto");
        } else {
            System.out.println("El despacho actual es: " + e.getNumDespacho());
            System.out.println("Ingrese el nuevo despacho");
            e.setNumDespacho(leer.nextInt());
        }
    }
}
