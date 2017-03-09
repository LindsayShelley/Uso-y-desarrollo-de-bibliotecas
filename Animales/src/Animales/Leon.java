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
public class Leon extends Animal {
    public String Roar;
    @Override
    public String getSonido(){
        return Roar;
    }
    public Leon (String Roar){
        this.Roar=Roar;
        
    }
    
}
