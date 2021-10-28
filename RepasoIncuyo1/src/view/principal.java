/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import model.Domicilio;
import model.Medico;
import model.Persona;

/**
 *
 * @author augus
 */
public class principal {
    
    
    public static void main(String[] args) {
      /*  Medico m = new Medico();
        Domicilio d = new Domicilio("Avenido siempre viva", "647");
        
        m.setNombre("Gregori");
        m.setApellido("House");
        m.setEspecialidad("infectologia");
   
        m.setRefDomicilio(d);
            
        System.out.println("El nombre es: "+m.getNombre());    
        System.out.println("El apellido es: "+m.getApellido());    
        System.out.println("El la especialidad es: "+m.getEspecialidad());
        System.out.println("la calle es: "+m.getRefDomicilio().getNombreCalle()+" numero"+ m.getRefDomicilio().getNumeroCalle());
        */
    
    
      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("18/05/1984", fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());

      
    
    }
    
}
