/*
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;

/**
 *
 * @author Usuario
 */
public class ServicioLavadora extends ServicioElectro {
    
    public Lavadora crearLavadora(){
        Electrodomestico e= super.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        int carga=leer.nextInt();
        Lavadora l= new Lavadora(carga,e.getPrecio(),e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        
        return l;
    }
    
    public void precioFinal (Lavadora l){
        super.precioFinal(l);
        System.out.println("parcial: "+  l.getPrecio());
        l.setPrecio(l.getPrecio()+difPrecioCarga(l));
    }

    private double difPrecioCarga(Lavadora l) {
        double difPrecio = 0;
        if (l.getCarga()>30) {
            difPrecio=500;
        }

        return difPrecio;
    }
}
