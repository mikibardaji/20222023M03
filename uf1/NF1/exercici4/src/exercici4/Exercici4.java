/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 * Dibuja un ordinograma que lea dos números, 
 * calcule y muestre el valor de sus suma, resta, producto y división.
 * 
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        double num1, num2;
        System.out.println("Escribe un numero");
        num1 = sc.nextDouble(); //leer del teclado double y lo guardo en variable
        System.out.println("Escribe un segundo numero");
        num2= sc.nextDouble(); //leer del teclado double y lo guardo en variable
        
        double suma = num1 + num2;
        double resta = num1-num2;
        double multi = num1*num2;
        
         System.out.println("La suma es " + suma
                           + " resta " + resta 
                           + " multiplicacion " + multi);
        double divi=0;
        if (num2!=0)
            { //num2 diferente de 0 se hara este codigo
            divi = num1/num2;
                System.out.println(" division " + divi);
            }
        else
            {
                System.out.println("El segundo numero es 0 y no se puede dividir");
            }
        
  
    }
    
}
