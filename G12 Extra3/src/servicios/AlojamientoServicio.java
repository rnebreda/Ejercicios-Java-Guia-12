/*
Realizar un programa en el que se representen todas las relaciones descriptas.

Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios: 
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
 */
package servicios;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class AlojamientoServicio {

    List<Alojamiento> alojamientos = new ArrayList();

    public void alojamientos() {

        Hotel4Servicio h4s = new Hotel4Servicio();
        Hotel5Servicio h5s = new Hotel5Servicio();
        CampingServicio cs = new CampingServicio();
        ResidenciaServicio rs = new ResidenciaServicio();
        int opcion;
        do {

            System.out.println("1 - Agregar Hotel 4*");
            System.out.println("2 - Agregar Hotel 5*");
            System.out.println("3 - Agregar Camping");
            System.out.println("4 - Agregar Residencia");
            System.out.println("5 - Listar Todos los alojamientos");
            System.out.println("6 - Listar Solo Hoteles");
            System.out.println("7 - Listar Campings con Restaurant");
            System.out.println("8 - Listar Residencias con descuento a gremios");
            System.out.println("99 - Salir");
            System.out.println("Ingrese una opción");
            opcion = h4s.leer.nextInt();
            switch (opcion) {
                case 1:
                    alojamientos.add(h4s.crearHotel());
                    break;
                case 2:
                    alojamientos.add(h5s.crearHotel());
                    break;
                case 3:
                    alojamientos.add(cs.crearCamping());
                    break;
                case 4:
                    alojamientos.add(rs.crearResidencia());
                    break;
                case 5:
                    listarAlojamientos();
                    break;
                case 6:
                    listarHoteles();
                    break;
                case 7:
                    listarCampings();
                    break;
                case 8:
                    listarResidencias();
                    break;
                default:
                    break;
            }
        } while (opcion != 99);
    }

    public void listarAlojamientos() {
        for (Alojamiento a : alojamientos) {
            System.out.println(a.toString());
            System.out.println("");
        }

    }

    public void listarHoteles() {
        Set<Hotel> hoteles = new TreeSet(Hotel.mayorAMenor);
        for (Alojamiento a : alojamientos) {
            if (a instanceof Hotel) {
                Hotel aux = (Hotel) a;
                hoteles.add(aux);
            }
        }
        for (Hotel h : hoteles) {
            System.out.println(h.toString());
            System.out.println("");
        }
    }

    public void listarCampings() {
        for (Alojamiento a : alojamientos) {
            if (a instanceof Camping) {
                Camping aux = (Camping) a;
                if (aux.isTieneRest()) {
                    System.out.println(aux.toString());
                    System.out.println("");
                }
            }
        }
    }

    public void listarResidencias() {
        for (Alojamiento a : alojamientos) {
            if (a instanceof Residencia) {
                Residencia aux = (Residencia) a;
                if (aux.isDescGremios()) {
                    System.out.println(aux.toString());
                    System.out.println("");
                }
            }
        }
    }
}
