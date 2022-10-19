/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenantiguodivisibleper3;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenAntiguoDivisibleper3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num;
         int cont_3=0;
         int acum_num=0;
         int cont_num=0;
         do
         {
            System.out.println("Pon numeros cuando lleves 3 divisibles por 3 parare...");
            num=sc.nextInt();
            ++cont_num;
            if (num%3==0)
            {
                acum_num = acum_num + num;
                ++cont_3;
            }
         }while(cont_3<3);
         System.out.println("has introducido " + cont_num);
         System.out.println("la suma acumulada de los 3 numeros es " + acum_num);
    }
    
}
