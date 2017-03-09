/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carreras;

/**
 *
 * @author lindsay
 */
public class Administracion extends Carrera {
      public double red;
    @Override
    public double getColor(){
        return red;
    }
    public Administracion (double red){
        this.red=red;
        
    }
    
    
}
