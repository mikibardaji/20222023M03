/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8;

import java.util.Scanner;

/**
 * Dibuja un ordinograma de un programa que 
 * pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos.
 * @author mabardaji
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        System.out.print("Pon tu edad? ");
        edad = sc.nextInt();
        
        if (edad>=18)
            { //si es cierto la condición del if
                System.out.println("Eres mayor de Edad , ya puedes ir al Bingo");
            }
        else
            { //si no es cierto la condición del if (edad>=18)
                System.out.println("Eres menor de edad, no entres al Bingo");
            }

        System.out.println("programa terminado");
        
    }
    
}
