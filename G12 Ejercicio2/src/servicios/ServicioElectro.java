/*
Electrodomestico:
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios:
 */
package servicios;

import entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioElectro {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
    precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        System.out.println("Ingrese el color y el consumo energético del electro");
        String clr = leer.next();
        String cons = leer.next();
        int peso = (int) ((Math.random() * 150) + 1);
        Electrodomestico e = new Electrodomestico(1000, clr, cons, peso);
        return e;
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
    precio. Esta es la lista de precios:
     */
    public void precioFinal(Electrodomestico e) {
        e.setPrecio(e.getPrecio()+difPrecioConsumo(e)+difPrecioPeso(e));

    }

    private double difPrecioConsumo(Electrodomestico e) {
        double difPrecio = 0;
        String cons = e.getConsumoEnergetico();
        switch (cons) {
            case "A":
                difPrecio = 1000;
                break;
            case "B":
                difPrecio = 800;
                break;
            case "C":
                difPrecio = 600;
                break;
            case "D":
                difPrecio = 500;
                break;
            case "E":
                difPrecio = 300;
                break;
            case "F":
                difPrecio = 100;
                break;
            default:
                System.out.println("Ha ocurrido un error");
        }

        return difPrecio;
    }

    private double difPrecioPeso(Electrodomestico e) {
        double difPrecio = 0;
        int peso = e.getPeso();
        if (peso < 20) {
            difPrecio = 100;
        } else if (peso < 50) {
            difPrecio = 500;
        } else if (peso < 80) {
            difPrecio = 800;
        } else if (peso >= 80) {
            difPrecio = 1000;
        }

        return difPrecio;
    }
}
