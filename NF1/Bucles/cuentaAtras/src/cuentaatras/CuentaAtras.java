/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentaatras;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CuentaAtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Opción 2
//        for (int i = 10; i >= 0; i--) {
//            System.out.print(i + " ");  
//        }
//        System.out.println("ring");
        
        
        //Opción 1
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i+"-Aqui se viene a trabajar");
//        }

        //opcion 3
         Scanner sc = new Scanner(System.in);
         int minimo, maximo;
         System.out.println("Pon valor minimo");
         minimo = sc.nextInt();
         System.out.println("Pon valor maximo");
         maximo = sc.nextInt();
         
         for (int cont = minimo; cont <= maximo; cont++) {
             if (cont%2==0)
             {
                 System.out.println(cont);
             }
             //sino nada            
        }
         
         
    }
    
}
