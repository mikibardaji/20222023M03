/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesiExamen;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Pt2_25percent_ex3 {
    public static void main(String[] args) {
        int[] valors = new int[30];
        
        ficarValorsAleatoris(valors);
        System.out.println(Arrays.toString(valors));
        ficarZeroPosicions(valors);
        System.out.println(Arrays.toString(valors));
        ficarposicio_1(valors);
        System.out.println(Arrays.toString(valors));
    }

    /**
     * posa tot el array amb valors aleatoris del 1 al 15
     * @param valors 
     */
    private static void ficarValorsAleatoris(int[] valors) {
        Random rd = new Random();
       int v;
        for (int i = 0; i < valors.length; i++) {
            //v = rd.nextInt(15)+1;
             valors[i] = rd.nextInt(15)+1;
        }
        
        
    }

    /**canviï tots els valors entre 7 i 12 per un 0.
     * 
     * @param valors taula de valors
     */
    private static void ficarZeroPosicions(int[] valors) {
        for (int i = 0; i < valors.length; i++) {
            if(valors[i]>=7 && valors[i]<=12)
            {
                valors[i]=0;
            }
        }
    }

    private static void ficarposicio_1(int[] valors) {
        boolean marcado=false;
        for (int i = 0; i < valors.length; i++) 
        {
            if(valors[i]>12 && marcado==false)
            {
                valors[i]=-1;
                marcado=true;
            }
       
        }
    }
    
    
   
}
