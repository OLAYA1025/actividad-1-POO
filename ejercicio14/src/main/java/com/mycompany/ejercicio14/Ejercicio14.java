
package com.mycompany.ejercicio14;
import java.util.Scanner;
public class Ejercicio14 {

    public static void main(String[] args) {
        double x;
        Scanner Entrada= new Scanner(System.in);
        System.out.print("Introduzca el numero aca: ");
        x=Entrada.nextDouble();
        double cuadrado, cubo;
        cuadrado=Math.pow(x,2);
        cubo=Math.pow(x,3);
        System.out.println("El cuadrado de " + x + " es: " + cuadrado);
        System.out.println("El cubo de " + x + " es: " + cubo);

    }
}
