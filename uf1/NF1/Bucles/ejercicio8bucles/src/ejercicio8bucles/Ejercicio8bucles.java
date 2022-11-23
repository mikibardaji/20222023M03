/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8bucles;

import java.util.Scanner;

/**
 * Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, 
 * y luego muestre cuantos positivos y cuántos negativos.
1 fase, haz un programa que introduzcas valores hasta que pongas el 0 y termine
2 fase, dentro controla si el número es positivo aumentar un contador_positivos
3 fase hacer lo mismo pero con un contador de negativos.
 * @author mabardaji
 */
public class Ejercicio8bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numeros;
       Scanner sc = new Scanner(System.in);
       int count_positive=0, count_negative=0;
       do{
        System.out.println("Pon numeros, escribe 0 para terminar");
        numeros=sc.nextInt();
        if (numeros>0) 
            {//positivo
            ++count_positive; //count_positive = count_positive + 1;
            }
        else if(numeros<0)
            {
            count_negative++;
            }
       }while(numeros!=0);
       
        System.out.println("Escribiste 0 termino...");
        System.out.println("Positivos: " + count_positive);
        System.out.println("Negativos: " + count_negative);
       //while(!(numeros==0));
       
               
       
       
    }
    
}
