/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12.extra1;

import servicios.AmarreServicio;

/**
 *
 * @author Usuario
 */
public class G12Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
AmarreServicio am= new AmarreServicio();
am.crearAmarre();
        System.out.println("El valor del alquiler es: "+am.calcularAlquiler(am.amarre));
    }
    
}
