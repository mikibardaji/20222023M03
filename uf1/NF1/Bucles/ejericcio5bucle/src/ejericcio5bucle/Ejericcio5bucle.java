/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericcio5bucle;

import java.util.Scanner;

/**
 * Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
 * @author mabardaji
 */
public class Ejericcio5bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorial;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el numero y calculare su factorial");
        factorial = sc.nextInt();
        int acum_factorial=1;
        
        for (int contador = 1; contador <= factorial; contador++) {
            acum_factorial= contador*acum_factorial;
            if (contador!=factorial)
                {
                    System.out.print(contador+"*");
                }
            else //estoy en la ultima vuelta porquie contador=factoriakl
                {
                    System.out.print(contador);
                }            
        }
        
        System.out.println("=" + acum_factorial);
        
        
        
        
        
    }
    
}
