/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ex17ArraysIguales {
    public static void main(String[] args) {
        int[] valores1= new int[3];
        int[] valores2= new int[3];
        
        inicializarArray(valores1);
        Utilitats.Utilitats.mostrarArray(valores1);
        
        inicializarArray(valores2);
        Utilitats.Utilitats.mostrarArray(valores2);
                
        boolean igual = validacionIguales(valores1,valores2);
    }

    private static void inicializarArray(int[] valores) {
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Pon valor" + (i+1));
            valores[i] = sc.nextInt();
        }
        
    }

    private static boolean validacionIguales(int[] valores1, int[] valores2) {
        for (int i = 0; i < valores1.length; i++) 
        {
            if(valores1[i]!=valores2[i])
            {
                return false;
            }
        }
        return true;
    }
}
