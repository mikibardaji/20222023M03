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
public class DimeSignoApp {
    
     public static void main(String[] args) {
         
          Scanner sc = new Scanner(System.in);
          //demanar valor al usuari
          System.out.println("pon un valor y te dire el signo");
          int numero = sc.nextInt();
          //cridar a la funció DimeSigno i recollir el valor returm
          int signo = dimeSigno(numero);
          
         //a partir del valro del retunr escriure positiu/negatiu/zero
         switch (signo) {
             case 1:
                 System.out.println("Es positivo");
                 break;
             case -1:
                 System.out.println("Es negativo");
                 break;
             default:
                 System.out.println("Es cero");
                 break;
         }
     }
     
     // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     /**
      * Escollleix signe del numero passat
      * @param num valor del qual hem de saber el signe
      * @return -1(negativo),1(positivo) 0 (sense signe)
      */
     public static int dimeSigno(int num)
     {
         int signo;
         if(num==0)
         {
             signo=0;
             //return 0;
         }
         else if(num>0)
         {
             signo=1;
             //return 1;
         }
         else
         {
             signo = -1;
             //return -1;
                     
         }

         return signo;
         
     }        
     
     
}
