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
public class Energias extends Carrera {
      public double black;
    @Override
    public double getColor(){
        return black;
    }
    public Energias (double black){
        this.black=black;
        
    }
    
    
}