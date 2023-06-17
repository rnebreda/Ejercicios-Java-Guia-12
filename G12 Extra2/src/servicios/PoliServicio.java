/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PoliServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo crearPoli() {
        System.out.println("Ingrese el nombre del Polideportivo");
        String nombre = leer.next();
        System.out.println("Ingrese el tipo (Techado/Abierto)");
        String tipo = leer.next();
        double ancho = (int) ((Math.random() * 40) + 10);
        double alto = (int) ((Math.random() * 7) + 3);
        double largo = (int) ((Math.random() * 40) + 10);
        return new Polideportivo(nombre,tipo,ancho,alto,largo);
    }
}
