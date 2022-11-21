/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

import java.util.Scanner;
import static recursivitat.Turron.contarCalorias;

/**
 *
 * @author mabardaji
 */
public class virusTriple {
    
     public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
          System.out.println("Dime el dia y te dire los virus?");
          int dia =  sc.nextInt();
          int virus= contarVirus(dia);
          System.out.println(virus);
      }
     
     public static int contarVirus(int dia){
     
    
         if(dia==1){
         
             return 1;
             
        }

         else if(dia>1){
         
             return 3*contarVirus(dia-1);
             
         }
         
         return -1;
    }
     
}
