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
public class Sistemas extends Carrera {
      public double blue;
    @Override
    public double getColor(){
        return blue;
    }
    public Sistemas (double blue){
        this.blue=blue;
        
    }
    
    
}
