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

//import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
//import servicios.ServicioElectro;
import servicios.ServicioLavadora;
import servicios.ServicioTelevisor;

/**
 *
 * @author Usuario
 */
public class G12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioLavadora sl= new ServicioLavadora();
        Lavadora l= sl.crearLavadora();
        sl.precioFinal(l);
        System.out.println(l.toString());
        ServicioTelevisor st= new ServicioTelevisor();
        Televisor t= st.crearTelevisor();
        st.precioFinal(t);
        System.out.println(t.toString());
        
    }
    
}
