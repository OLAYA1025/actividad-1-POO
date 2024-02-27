
package com.mycompany.ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        double SUMA, X, Y;
        SUMA=0;
        X=20;
        SUMA+=X;
        Y=40;
        X+=Math.pow(Y,2);
        SUMA+=X/Y;
        System.out.println("El valor de la suma es: "+SUMA);

    }
}
