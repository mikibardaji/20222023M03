/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplefuncions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class exer12tablaMultiplicar {

     public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
          System.out.println("Pon el numero");
          int numero = sc.nextInt();
          
          tablaMultiplicar(numero);
          
     }


    public static void tablaMultiplicar(int num)
    {
        int calculo;
        for (int i = 1; i <= 10; i++) {
            calculo = i*num;
            System.out.println(i+"*"+num+"="+ calculo);
        }
    }
}


