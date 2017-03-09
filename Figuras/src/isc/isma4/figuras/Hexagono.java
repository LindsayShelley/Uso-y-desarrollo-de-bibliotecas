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
public class Hexagono extends Figura {

    double apotema, lado;
    private double perimetro;
    public Hexagono (double apotema,double lado, double perimetro)
    {
        this.apotema=apotema;
        this.lado=lado;
        this.perimetro=perimetro;
        
    }
    
      @Override
    public double getArea() {
return (perimetro()*apotema)/2;
    }

    private double perimetro() {
      {
        return lado*6;
      }
    }
          
    }
    
