/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import servicios.EmpleadoServicio;
import servicios.EstudianteServicio;
import servicios.PersonaServicio;
import servicios.PersonalDeServicioServicio;
import servicios.ProfesorServicio;

/**
 *
 * @author Usuario
 */
public class GestionFacultad {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PersonaServicio pes = new PersonaServicio();
    EmpleadoServicio ems = new EmpleadoServicio();
    EstudianteServicio ess = new EstudianteServicio();
    ProfesorServicio prs = new ProfesorServicio();
    PersonalDeServicioServicio pss = new PersonalDeServicioServicio();
    List<Persona> facultad = new ArrayList();

    public void llenarLista() {
        for (int i = 0; i < 40; i++) {
            facultad.add(ess.crearEstudiante());
        }
        for (int i = 0; i < 10; i++) {
            facultad.add(prs.crearProfesor());
        }
        for (int i = 0; i < 10; i++) {
            facultad.add(pss.crearPersonalDeServicio());
        }
    }

    private void listarTodo() {
        for (Persona p : facultad) {
            System.out.println(p.toString());
            System.out.println("");
        }
    }

    private void listarEmpleados() {
        for (Persona p : facultad) {
            if (p instanceof Empleado) {
                System.out.println(p.toString());
                System.out.println("");
            }
        }
    }

    private void listarProfesores() {
        for (Persona p : facultad) {
            if (p instanceof Profesor) {
                System.out.println(p.toString());
                System.out.println("");
            }
        }
    }

    private void listarDeServicio() {
        for (Persona p : facultad) {
            if (p instanceof PersonalDeServicio) {
                System.out.println(p.toString());
                System.out.println("");
            }
        }
    }

    private void listarEstudiantes() {
        for (Persona p : facultad) {
            if (p instanceof Estudiante) {
                System.out.println(p.toString());
                System.out.println("");
            }
        }
    }

    public void gestionFacultad() {
//El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación.
//A continuación, debe programar las clases definidas en las que, además de los constructores, 
//hay que desarrollar los métodos correspondientes a las siguientes operaciones: 
//• Cambio del estado civil de una persona. 
//• Reasignación de despacho a un empleado. 
//• Matriculación de un estudiante en un nuevo curso. 
//• Cambio de departamento de un profesor. 
//• Traslado de sección de un empleado del personal de servicio. 
//• Imprimir toda la información de cada tipo de individuo.
        int opcion;

        do {
            System.out.println("1 - Listar Todo");
            System.out.println("2 - Listar Empleados");
            System.out.println("3 - Listar Profesores");
            System.out.println("4 - Listar Personal de Servicio");
            System.out.println("5 - Listar Estudiantes");
            System.out.println("6 - Cambio de Estado Civil");
            System.out.println("7 - Reasignación de Despacho a Empleado");
            System.out.println("8 - Cambio de departamento a Profesor");
            System.out.println("9 - Traslado de Sección a Personal de Servicio");
            System.out.println("10 - Matriculación en Nuevo curso a Estudiante");
            System.out.println("99 - Salir");
            System.out.println("Elija una opción");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    listarTodo();
                    break;
                case 2:
                    listarEmpleados();
                    break;
                case 3:
                    listarProfesores();
                    break;
                case 4:
                    listarDeServicio();
                    break;
                case 5:
                    listarEstudiantes();
                    break;
                case 6:
                    pes.cambioEstadoCivil(buscarPersona());
                    break;
                case 7:
                    ems.cambioDespacho(buscarEmpleado());
                    break;
                case 8:
                    prs.cambioDepto(buscarProfesor());
                    break;
                case 9:
                    pss.cambioSeccion(buscarDeServicio());
                    break;
                case 10:
                    ess.cambioCurso(buscarEstudiante());
                    break;
                default:
                    break;
            }

        } while (opcion != 99);

    }

    private Persona buscarPersona() {
        System.out.println("Ingrese el DNI de una persona a modificar");
        String buscado = leer.next();
        Persona aux, encontrado = null;

        Iterator<Persona> it = facultad.iterator();

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getDni().equals(buscado)) {
                encontrado = aux;
            }
        }
        return encontrado;
    }

    private Empleado buscarEmpleado() {
        System.out.println("Ingrese el DNI de una persona a modificar");
        String buscado = leer.next();
        Persona aux;
        Empleado encontrado = null;

        Iterator<Persona> it = facultad.iterator();

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getDni().equals(buscado) && aux instanceof Empleado) {
                encontrado = (Empleado) aux;
            }
        }
        return encontrado;
    }

    private Profesor buscarProfesor() {
        System.out.println("Ingrese el DNI de una persona a modificar");
        String buscado = leer.next();
        Persona aux;
        Profesor encontrado = null;

        Iterator<Persona> it = facultad.iterator();

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getDni().equals(buscado) && aux instanceof Profesor) {
                encontrado = (Profesor) aux;
            }
        }
        return encontrado;
    }

    private PersonalDeServicio buscarDeServicio() {
        System.out.println("Ingrese el DNI de una persona a modificar");
        String buscado = leer.next();
        Persona aux;
        PersonalDeServicio encontrado = null;

        Iterator<Persona> it = facultad.iterator();

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getDni().equals(buscado) && aux instanceof PersonalDeServicio) {
                encontrado = (PersonalDeServicio) aux;
            }
        }
        return encontrado;
    }

    private Estudiante buscarEstudiante() {
        System.out.println("Ingrese el DNI de una persona a modificar");
        String buscado = leer.next();
        Persona aux;
        Estudiante encontrado = null;

        Iterator<Persona> it = facultad.iterator();

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getDni().equals(buscado) && aux instanceof Estudiante) {
                encontrado = (Estudiante) aux;
            }
        }
        return encontrado;
    }

}
