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
public class Turismo extends Carrera {
      public double yellow;
    @Override
    public double getColor(){
        return yellow;
    }
    public Turismo (double yellow){
        this.yellow=yellow;
        
    }
    
    
}