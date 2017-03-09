/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author Lindsay
 */
public class Perro extends Animal {
      public String woof;
    @Override
    public String getSonido(){
        return woof;
    }
    public Perro (String woof){
        this.woof=woof;
        
    }
     
    
}
