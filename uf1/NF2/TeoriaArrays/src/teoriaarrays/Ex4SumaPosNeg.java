/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *  Crea un programa que pida MAX números enteros por teclado,
 * los almacene en un array y
 * luego muestre por separado 
* la suma de todos los valores positivos y negativos.
 * @author mabardaji
 */
public class Ex4SumaPosNeg {
    
    public static void main(String[] args) {
        final int MAX = 6;
        int[] nums = new int[MAX];
        Scanner sc = new Scanner(System.in);
        int valor;
        
        System.out.println("Pon valores");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduce valor: ");
            valor = sc.nextInt();
            nums[i] = valor;
        }
        
//        System.out.println("Muestro array");
//        Utilitats.mostrarArray(nums);
        int sum_pos=0, sum_neg=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) /*positius*/
            {
                sum_pos = sum_pos + nums[i];
            }
            if (nums[i]<0) /*negatius*/
            {
                sum_neg = sum_neg + nums[i];
            }            
        }
        System.out.println("positius " + sum_pos);
        System.out.println("negatius " + sum_neg);
        
    }
}
