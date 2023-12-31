/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OficinasServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas crearEdOficina() {
        System.out.println("Ingrese la cantidad de personas por oficina");
        int cantPersonas = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos en el Edificio");
        int cantPisos = leer.nextInt();
        double aux = (Math.random() * 4) + 8;

        return new EdificioDeOficinas(cantPisos, cantPersonas, cantPisos, aux, 2.5 * cantPisos, aux);
    }

    public void cantPersonas(EdificioDeOficinas e) {
        System.out.println("La cantidad de personas por piso es " + e.getCantPersonas());
        System.out.println("La cantidad de personas total en el edificio es " + (e.getCantPersonas() * e.getNumPisos()));
    }

}
