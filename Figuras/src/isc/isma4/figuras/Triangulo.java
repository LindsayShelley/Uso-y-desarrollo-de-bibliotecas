/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

import isc.isma4.figuras.Figura;

/**
 *
 * @author lindsay
 */
public class Triangulo extends Figura{
        public double base;
    public double altura;

    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return (base*altura)/2;
    }
     public Triangulo (double base, double altura){
         this.base=base;
         this.altura=altura;
     }
}
