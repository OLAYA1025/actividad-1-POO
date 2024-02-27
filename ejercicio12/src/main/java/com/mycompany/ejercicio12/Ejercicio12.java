
package com.mycompany.ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        double horas_laboradas, vhora, porc_retencion,salario_bruto, retencion, salario_neto;
        horas_laboradas=48;
        vhora=5000;
        porc_retencion=12.5/100;
        salario_bruto=horas_laboradas*vhora;
        retencion=salario_bruto*porc_retencion;
        salario_neto=salario_bruto-retencion;
        System.out.println("El trabajador laboro un total de " + horas_laboradas + " horas en la semana");
        System.out.println("El valor de cada hora es de " + vhora +"$");
        System.out.println("El porcentaje de la retencion de fuente es del "+(porc_retencion*100)+"%");
        System.out.println("El salario bruto es: " + salario_bruto + "$");
        System.out.println("La retencion represento un valor de: " + retencion + "$");
        System.out.println("El salario neto es: " + salario_neto + "$");
    }
}
