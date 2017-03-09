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
public class Raton extends Animal {
      public String iii;
    @Override
    public String getSonido(){
        return iii;
    }
    public Raton (String iii){
        this.iii=iii;
        
    }
    
    
}
