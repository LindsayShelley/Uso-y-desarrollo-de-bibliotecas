/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

public class Simpson extends Figura {

 public static void main(String[] args) {

 final int n = 1000; // número de divisiones
 // extremos del intervalo
 final double a = 0;
 final double b = Math.PI/2;

 double h=(b-a)/n; // tamaño de cada subintervalo

 // primer sumando
 double suma=f(a)+f(b);

 // segundo sumando: impares
 for(int i=1; i<n; i+=2)
 suma+=4*f(a+i*h);

 // tercer sumando: pares
 for(int i=2; i<n; i+=2)
 suma+=2*f(a+i*h);

 // mostramos el resultado final
 System.out.println("El resultado es: "+(suma*h/3));
 }

 // función a integrar: sen(x)
 public static double f(double x){
 return Math.sin(x);
 }
} 
    

