/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3_calculararealadoteclado;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3_calcularAreaLadoTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.in es llegir del teclat
        Scanner sc = new Scanner(System.in);
        double lado;
        System.out.println("Pon la longitud del lado");
        lado = sc.nextDouble(); //llegeix del teclat un sencer , i l'assigna a la variable lado
       
        double area = lado*lado;
         System.out.println("El lado mide " + lado);
         System.out.println("El area mide " + area);
    }
    
}
