/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico. 
Estos métodos serán abstractos y los implementarán las siguientes clases: 
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre. 
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
los atributos del padre. 

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
superficie y el volumen de cada edificio. 

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package g12.extra2;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;
import servicios.OficinasServicio;
import servicios.PoliServicio;

/**
 *
 * @author Usuario
 */
public class G12Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        PoliServicio ps = new PoliServicio();
        OficinasServicio os = new OficinasServicio();
        Edificio edo1 = os.crearEdOficina();
        edificios.add(edo1);
        Edificio edo2 = os.crearEdOficina();
        edificios.add(edo2);
        Edificio poli1 = ps.crearPoli();
        edificios.add(poli1);
        Edificio poli2 = ps.crearPoli();
        edificios.add(poli2);
        int sumaTechado = 0, sumaAbierto = 0;
        for (Edificio e : edificios) {
            e.calcularSuperficie();
            e.calcularVolumen();
            if (e instanceof EdificioDeOficinas) {
                EdificioDeOficinas edo = (EdificioDeOficinas) e;
                os.cantPersonas(edo);
                System.out.println("");
            } else {
                Polideportivo poli = (Polideportivo) e;
                if (poli.getTipo().equalsIgnoreCase("Techado")) {
                    sumaTechado++;
                } else {
                    sumaAbierto++;
                }
            }
        }
        System.out.println("La cantidad de Polideportivos Techados es: "+sumaTechado);
        System.out.println("La cantidad de Polideportivos Abiertos es: "+sumaAbierto);
    }

}
