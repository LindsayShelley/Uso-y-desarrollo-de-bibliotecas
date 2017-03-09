/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author lindsay
 */
public class Oso extends Animal {
      public String grua;
    @Override
    public String getSonido(){
        return grua;
    }
    public Oso (String grua){
        this.grua=grua;
        
    }
    
    
}