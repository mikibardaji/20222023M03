/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14;

import java.util.Scanner;

/**
 * Dibuja un ordinograma que lee dos números y nos dice cuál es el mayor o si son iguales.
 * @author mabardaji
 */
public class Exercici14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1,num2;
       Scanner sc = new Scanner(System.in); //recoger datos teclado
        System.out.print("Pon numero1? ");
        num1 = sc.nextInt();
        System.out.print("Pon numero2? ");
        num2 = sc.nextInt();
        
        if(num1>=num2)
            { //si es cierto que num1>=num2 
                System.out.println("");
                if (num1==num2)
                    { //si se cumple 
                        System.out.println("los numeros son iguales");  
                    }
                else
                    {
                        System.out.println("El mayor es " + num1);
                    }
                
            }
        else
            {//no es cierto que num1>=num2 , num2 es mas 
                System.out.println("El mas grande es " + num2);
            }
        
        
      
    }
    
}
