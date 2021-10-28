/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author augus
 */
public class Herbivoros extends Animales{

    @Override
    public void comen() {
        System.out.println("Se alimentan de plantas");
    }

    @Override
    public void accion() {

        System.out.println("No comer carne");
    }
    
}
