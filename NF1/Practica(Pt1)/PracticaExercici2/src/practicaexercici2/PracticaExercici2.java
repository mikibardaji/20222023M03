/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexercici2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PracticaExercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = "";
        System.out.print("Input a number: ");
        
            int number = scan.nextInt();
            if (number%2 == 0) { //even number
                if (number%3 == 0) { //also multiple of 3
                    message = String.format("%d is even and multiple of 3", number);
                } else { //even but not multiple of 3
                    message = String.format("%d is even but not multiple of 3", number);
                }
            } else { //odd number
                message = String.format("%d is an odd number", number);
            }
            System.out.println(message);
        } 
        
    }
    

