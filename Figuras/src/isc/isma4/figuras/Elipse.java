/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author lindsay
 */
public class Elipse extends Figura {
    public double altura;
    public double base;
    
     @Override
     public double getArea(){
         return Math.PI * altura * base;
     }    
    public Elipse (double radio) {
        this.altura=altura;
        this.base=base;
    }
    
}
