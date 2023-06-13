/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Animal;

/**
 *
 * @author Usuario
 */
public class ServicioPerro extends ServicioAnimal{
    @Override
        public void Alimentarse (){
        System.out.println("Soy carnivoro pero tambien como galletas");
    }
}
