/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesiExamen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Ordenacion {
    public static void main(String[] args) {
        Integer[] valors = new Integer[5];
        String[] noms = {"Pepe","Juan","Zico","Anibal"};
        ficarValorsAleatoris(valors);
        Utilitats.Utilitats.mostrarArray_Integer(valors);
        Arrays.sort(valors);
        System.out.println("Array ordenado");
        Utilitats.Utilitats.mostrarArray_Integer(valors);
        
        Arrays.sort(noms);
        System.out.println(Arrays.toString(noms));
        Arrays.sort(noms, Collections.reverseOrder());
        System.out.println(Arrays.toString(noms));
        
        Arrays.sort(valors,Collections.reverseOrder());
        System.out.println("Array ordenado");
        Utilitats.Utilitats.mostrarArray_Integer(valors);
        
    }
    
    
     /**
     * posa tot el array amb valors aleatoris del 1 al 15
     * @param valors 
     */
    private static void ficarValorsAleatoris(Integer[] valors) {
        Random rd = new Random();
       int v;
        for (int i = 0; i < valors.length; i++) {
            //v = rd.nextInt(15)+1;
             valors[i] = rd.nextInt(10000)+1;
        }
        
        
    }
}
