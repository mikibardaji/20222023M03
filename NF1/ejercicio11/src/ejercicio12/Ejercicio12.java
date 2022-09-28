/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     * Dibuja el ordinograma de un programa que lee un número y me dice si es positivo o negativo,
     * consideraremos el cero como positivo.
     */
    public static void main(String[] args) {
        int num = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor");
        num = sc.nextInt();
        
        
        if (num>=0)
        {
            System.out.println("Positivo");
        }
        else
        {
            System.out.println("Negativo");
        }    
        
    }
    
}
