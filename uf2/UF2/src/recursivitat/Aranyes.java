/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Aranyes {
    
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Cuantes aranyes tens?");
          int aranyes =  sc.nextInt();
          
          int potes = contarPotes(aranyes);
          
          System.out.println(aranyes + " tenen " + potes + " potes 10");
          
          potes = contarPotesMutants(aranyes);
          
          System.out.println(aranyes + " mutants tenen " + potes + " potes 10");
      }
      
      
      private static int contarPotes(int aranyes)
      {
          if (aranyes==0) /*caso base*/
          {
              return 0;
          }
//          if (aranyes==1)
//          {
//              return 8;
//          }
          else if (aranyes>=1)
          {
              return 8+contarPotes(aranyes-1);
          }
          
          return -1;
      }
      
      private static int contarPotesMutants(int aranyes)
      {
          if (aranyes==0) /*caso base*/
          {
           return 0;   
          }
          else if(aranyes%2!=0) /*impar*/
          {
              return 8+contarPotesMutants(aranyes-1);
          }
          else if(aranyes%2==0) /* par*/
          {
              return 6+contarPotesMutants(aranyes-1);
          }
          
          return -1;//cas aranyes  sigui negatiu
      }
      
      
      
}
