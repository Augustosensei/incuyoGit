/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author augus
 */
public class Domicilio {
    
    private String nombreCalle;
    private String numeroCalle;

    public Domicilio() {
    }

    
    
    
    public Domicilio(String nombreCalle, String numeroCalle) {
        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
    }

    
    
    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(String numeroCalle) {
        this.numeroCalle = numeroCalle;
    }
    
    
    
}
