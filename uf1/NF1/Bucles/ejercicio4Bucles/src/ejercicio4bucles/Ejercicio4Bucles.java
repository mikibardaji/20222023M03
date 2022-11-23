/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4bucles;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 * Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado.
 */
public class Ejercicio4Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
         int contador=1;
        Scanner sc = new Scanner(System.in);
         System.out.println("introduce un valor n");
          n= sc.nextInt();
          while (contador<=n)
            {
                System.out.println(contador);
                contador=contador+1;
            }
          
    }
    
}
