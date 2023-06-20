/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Estudiante;
import java.util.Scanner;
import utilidades.Utilidades;

/**
 *
 * @author Usuario
 */
public class EstudianteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Utilidades u = new Utilidades();

    public void cambioCurso(Estudiante e) {
        if (e == null) {
            System.out.println("DNI incorrecto");
        } else {
            System.out.println("El curso actual en el que está matriculado es: " + e.getCurso());
            System.out.println("Ingrese el nuevo curso");
            e.setCurso(leer.next());
        }
    }

    public Estudiante crearEstudiante() {
        //Estudiante(String curso, String nombre, String apellido, 
        //String dni, String estadoCivil)

        return new Estudiante(u.curso(), u.nombre(), u.apellido(), u.crearDni(), u.estadoCivil());
    }
}
