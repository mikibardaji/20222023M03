/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplefuncions;

import java.util.Scanner;

/**
 * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros.
 * @author mabardaji
 */
public class MillasKmApp {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;
        double km;
        System.out.println("Escribe las millas que quieres pasar a kilometros"); 
        millas = sc.nextInt();
        km = millas_a_kilometros(millas);
        
        System.out.println("Los kilometros son " +km);
    }
    
  //double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
    public static double millas_a_kilometros(int millas){
        double kil = 0;
        kil = millas * 1.60934;
        return kil;  
    }
    
}
