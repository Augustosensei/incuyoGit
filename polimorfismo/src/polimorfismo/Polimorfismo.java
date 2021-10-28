/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;
import models.Animales;
import models.Carnivoros;
import models.Herbivoros;
import models.Plantas;
import models.SeresVivos;

/**
 *
 * @author augus
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
          
        SeresVivos plantas = new Plantas();
        Animales animalesHerbivoros = new Herbivoros();
        Animales animalesCarnivoros = new Carnivoros();
        
        
        plantas.comen();
        animalesCarnivoros.comen();
        animalesHerbivoros.comen();
        
        animalesCarnivoros.accion();
        animalesHerbivoros.accion();     
    }
    
}
