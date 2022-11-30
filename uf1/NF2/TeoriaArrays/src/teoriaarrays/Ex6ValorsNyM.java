/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros N y M, 
 * luego cree un array de tamaño N,
 * escriba M en todas sus posiciones y lo muestre por pantalla.
 * @author mabardaji
 */
public class Ex6ValorsNyM {
    
    public static void main(String[] args) {
     
          Scanner sc = new Scanner(System.in);
          System.out.println("Pon tamanyo array");
          int tamany = sc.nextInt();
          System.out.println("Pon valor array");
          int valor = sc.nextInt();
          int[] numeros = new int[tamany];
          
          for (int index = 0; index < numeros.length; index++) {
            numeros[index] = valor;
        }
        
        
        System.out.println("Muestro array");
        Utilitats.mostrarArray(numeros);
    }
}
