/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author augus
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;  
    
    private Domicilio refDomicilio;
    

    public Persona() {
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getEdad() {
        return fechaNacimiento;
    }

    public void setEdad(LocalDate edad) {
        this.fechaNacimiento = edad;
    }

    public Domicilio getRefDomicilio() {
        return refDomicilio;
    }

    public void setRefDomicilio(Domicilio refDomicilio) {
        this.refDomicilio = refDomicilio;
    }
    
    
    
    
}
