/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo 
siguiente:
 */
package g12.ej1.v2;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author Usuario
 */
public class G12Ej1V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich","Carne",15,"Doberman");
        perro1.alimentarse();
        Animal perro2 = new Perro("Teddy", "Croquetas",10,"Chihuahua");
        perro2.alimentarse();
        Animal gato1 = new Gato("Pelusa","Galletas",15,"Siamés");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Spark","Pasto",25,"Fino");
        caballo1.alimentarse();
    }
    
}
