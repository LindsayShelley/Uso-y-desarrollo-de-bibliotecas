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
public class Gastronomia extends Carrera {
      public double white;
    @Override
    public double getColor(){
        return white;
    }
    public Gastronomia (double white){
        this.white=white;
        
    }
    
    
}