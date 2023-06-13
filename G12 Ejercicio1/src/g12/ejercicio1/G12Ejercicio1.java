/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12.ejercicio1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import servicio.ServicioCaballo;
import servicio.ServicioGato;
import servicio.ServicioPerro;

/**
 *
 * @author Usuario
 */
public class G12Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPerro sp1 = new ServicioPerro();
        Animal perro1 = new Perro("Stich", "Carnivoro",15,"Doberman");
        sp1.Alimentarse();
        System.out.println(perro1.getAlimento());
        
        ServicioPerro sp2 = new ServicioPerro();
        Animal perro2 = new Perro("Teddy", "Croquetas",10,"Chihuahua");
        sp2.Alimentarse();
        System.out.println(perro2.getAlimento());
        
        ServicioGato sg1 = new ServicioGato();
        Animal gato1 = new Gato("Pelusa","Galleta",15,"Siames");
        sg1.Alimentarse();
        System.out.println(gato1.getAlimento());
        
        ServicioCaballo sc1 = new ServicioCaballo();
        Animal caballo1 = new Caballo ("Spark", "Pasto",25,"fino");
        sc1.Alimentarse();
        System.out.println(caballo1.getAlimento());
    }
    
}
