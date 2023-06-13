/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, 
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios:
 */
package g12.ejercicio2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
//import servicios.ServicioElectro;
import servicios.ServicioLavadora;
import servicios.ServicioTelevisor;

/**
 * . Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
 * Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
 * televisores, con valores ya asignados. Luego, recorrer este array y ejecutar
 * el método precioFinal() en cada electrodoméstico. Se deberá también mostrar
 * el precio de cada tipo de objeto, es decir, el precio de todos los
 * televisores y el de las lavadoras. Una vez hecho eso, también deberemos
 * mostrar, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
 * tenemos una lavadora con un precio de 2000 y un televisor de 5000, el
 * resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para
 * lavadora y 5000 para televisor.
 */
public class G12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ServicioLavadora sl= new ServicioLavadora();
//        Lavadora l= sl.crearLavadora();
//        sl.precioFinal(l);
//        System.out.println(l.toString());
//        ServicioTelevisor st= new ServicioTelevisor();
//        Televisor t= st.crearTelevisor();
//        st.precioFinal(t);
//        System.out.println(t.toString());

        List<Electrodomestico> electros = new ArrayList();
        ServicioLavadora sl = new ServicioLavadora();
        Lavadora l1 = sl.crearLavadora();
        electros.add(l1);
        Lavadora l2 = sl.crearLavadora();
        electros.add(l2);
        ServicioTelevisor st = new ServicioTelevisor();
        Televisor t1 = st.crearTelevisor();
        electros.add(t1);
        Televisor t2 = st.crearTelevisor();
        double sumaT = 0, sumaL = 0;
        electros.add(t2);
        for (Electrodomestico e : electros) {
            System.out.println(e.toString());
            if (e instanceof Televisor) {
                st.precioFinal(e);
                sumaT += e.getPrecio();
                System.out.println("Este Televisor vale: " + e.getPrecio());
            } else {
                sl.precioFinal(e);
                sumaL += e.getPrecio();
                System.out.println("Esta Lavadora vale: " + e.getPrecio());
            }
            System.out.println("");
        }
        System.out.println("Todos los Televisores valen: " + sumaT);
        System.out.println("Todas las Lavadoras valen: " + sumaL);
        System.out.println("La suma de todos los Electros es: " +(sumaT+sumaL));
    }

}
