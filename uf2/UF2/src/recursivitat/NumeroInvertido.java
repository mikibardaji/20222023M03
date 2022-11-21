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
public class NumeroInvertido {
 
     public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
          System.out.println("Dime el numero y te lo mostrare invertido");
          
          int num1 =  sc.nextInt();
          
          mostrarNumeroInvertido(num1);
     }
     
     
     public static void mostrarNumeroInvertido(int valor)
     {
      if (valor<10)
      {
          System.out.println(valor);
      }
      else
      {
          System.out.print(valor%10+ "-");
          mostrarNumeroInvertido(valor/10);
      }
     }
}
