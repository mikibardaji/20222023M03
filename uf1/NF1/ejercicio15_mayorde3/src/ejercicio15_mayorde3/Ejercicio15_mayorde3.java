/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_mayorde3;

import java.util.Scanner;

/**
 * ibuja un ordinograma que lea tres números distintos 
 * y nos diga cuál es el mayor.
 * @author alumne
 */
public class Ejercicio15_mayorde3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el numero1:");
        num1 = sc.nextInt();
        System.out.print("Pon el numero2:");
        num2 = sc.nextInt();
        System.out.print("Pon el numero3:");
        num3 = sc.nextInt();
        //&& AND se deben cumplir las dos condiciones para que sea cierto
        
        if(num1>=num2 && num1>=num3)
            {
                System.out.println("El mayor es el primero " + num1);
            }
        else if (num2>=num1 && num2>=num3)
        {
             System.out.println("El mayor es el segundo  " + num2);
        }
        else if (num3>num2 && num3>num1)
        {
            System.out.println("El mayor es el tercero " + num3);
        }
    }
    
}
