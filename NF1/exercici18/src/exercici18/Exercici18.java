/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18;

import java.util.Scanner;

/**
 *
 * @author mabardaji
      ibuja un ordinograma que calcula el salario_neto neto semanal de un trabajador en función del número de horas trabajadas y de acuerdo a las siguientes hipótesis:
    • Las primeras 35 horas se pagan a tarifa normal.
    • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
Escribir nombre, salario_neto.
 */
public class Exercici18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas,h_extra;
        double precio_horas;
        double salario_neto, salario_hnormales, salario_extra;
        final int HORAS_NORMALES = 35;
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        System.out.print("Posa les hores treballades? ");
        horas = sc.nextInt();
        System.out.print("Posa el preu que et paguen cada hora? ");
        precio_horas = sc.nextDouble();
        if (horas > HORAS_NORMALES)
        { //calclare horas y horas extra
            salario_hnormales = HORAS_NORMALES*precio_horas;
            h_extra = horas - HORAS_NORMALES;
            salario_extra = precio_horas*h_extra*1.5;
            salario_neto = salario_hnormales+salario_extra;
        }
        else
        { //no hay horas extra
            salario_neto = horas * precio_horas;
        }
        
        System.out.println("Et pagaran " + salario_neto + " Euros");
    }
    
}
