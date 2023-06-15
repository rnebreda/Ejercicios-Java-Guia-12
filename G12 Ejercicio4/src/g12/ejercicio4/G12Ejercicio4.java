/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g12.ejercicio4;
import entidad.Circulo;
import entidad.Rectangulo;
/**
 *
 * @author Usuario
 */
public class G12Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



     Circulo circulo = new Circulo(3);
     Rectangulo rectangulo = new Rectangulo(4,2);
        System.out.println("El area del circulo es: "+circulo.calcularArea());
        System.out.println("El perimetro del circulo es: "+circulo.calcularPerimetro());
        System.out.println("");
        System.out.println("El area del rectangulo es: "+rectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: "+rectangulo.calcularPerimetro());
     
    }
    
}
    
    

