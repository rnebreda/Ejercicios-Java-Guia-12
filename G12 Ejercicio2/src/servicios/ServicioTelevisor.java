/*
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
también deben afectar al precio.
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;

/**
 *
 * @author Usuario
 */
public class ServicioTelevisor extends ServicioElectro {

    public Televisor crearTelevisor() {
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion");
        int resolucion = leer.nextInt();
        System.out.println("Tiene Sintonizador TDT? (S=si) ");
        boolean tdt = leer.next().equalsIgnoreCase("S");
        Televisor t = new Televisor(resolucion, tdt, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());

        return t;
    }

    public void precioFinal(Televisor t) {
        super.precioFinal(t);
        System.out.println("parcial: " + t.getPrecio());
        t.setPrecio(t.getPrecio() + difPrecioResolucion(t) + difPrecioTdt(t));
    }

    private double difPrecioResolucion(Televisor t) {
        double difPrecio = 0;
        if (t.getResolucion() > 40) {
            difPrecio = t.getPrecio() * 0.3;
        }

        return difPrecio;
    }

    private double difPrecioTdt(Televisor t) {
        double difPrecio = 0;
        if (t.isTdt()) {
            difPrecio = 500;
        }

        return difPrecio;
    }
}
