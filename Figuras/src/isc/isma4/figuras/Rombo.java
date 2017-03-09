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
public class Rombo extends Figura {
        public double D;
    public double d;

    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return (D*d)/2;
    }
     public Rombo (double D, double d){
         this.D=D;
         this.d=d;
    }
}
    
