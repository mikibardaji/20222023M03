/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 *  * 
 *  * 
Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0
 * @author mabardaji
 */
public class ex5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon una frase");
        String frase = sc.nextLine();
        //mayuscula
        frase=frase.toUpperCase();
        int[] vocales = new int[5];
         for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'A':
                    vocales[0] = vocales[0]+1;
                    break;
                case 'E':
                    vocales[1]++;
                    break;
                case 'I':
                    vocales[2]++;
                    break;
                case 'O':
                    vocales[3]++;
                    break;
                case 'U':
                    vocales[4]++;
                    break;
                default:
                    break;
            }
         }
        
         Utilitats.Utilitats.mostrarArray(vocales);
         String letrasVocales = "AEIOU";
         
         //char[] letras = {'A','E','I','O','U'};
         char[] letras = letrasVocales.toCharArray();
         /*char[]letras = new char[5];
         letras[0] = 'A';
         letras[1] = 'A';
         ...*/
         for (int i = 0; i < vocales.length; i++) {
             System.out.println("Numero de " + letras[i] + "'s =" + vocales[i]); 
        }
         
         
         //recorro array y muestro
         //no lo recorro pero todas las posciones
        
    }
}
