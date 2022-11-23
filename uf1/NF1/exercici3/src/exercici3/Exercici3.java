/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     * Dibuja un ordinograma que calcule el área de 
     * un cuadrado cuyo lado se introduce por teclado.
     */
    public static void main(String[] args) {
        float lado;
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        
        System.out.println("Pon la longitud del lado del cuadrado");
        lado = sc.nextFloat();
        
        float area = lado*lado;
        
        System.out.println("La area del cuadrado es " + area);
        
    }
    
}
