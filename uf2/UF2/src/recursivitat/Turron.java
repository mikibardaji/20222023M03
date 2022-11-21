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
public class Turron {
    
      public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
          System.out.println("Dime el dia de navidad en que te encuentras?");
          int dia =  sc.nextInt();
          int trozos= contarCalorias(dia);
          System.out.println(trozos);
      }
      
      public static int Turron(int dia)
              {
                  if (dia==0){
                      return 0;
                  }
                  else if (dia==1){
                      return 4;
                  }
                  else if (dia%3==0){
                      return 1+Turron(dia-1);
                  }
                  else if (dia>1){
                      return 4+Turron(dia-1);
                  }
                  
              return -1;}
      
      public static int contarCalorias(int dia)
              {
                  int calorias= 91;
                  if (dia==0){
                      return 0;
                  }
//                  else if (dia==1){
//                      return 4*calorias;
//                  }
                  else if (dia%3==0){
                      return (1*calorias)+contarCalorias(dia-1);
                  }
                  else if (dia>0){
                      return (4*calorias)+contarCalorias(dia-1);
                  }
                  
              return -1;}
}

