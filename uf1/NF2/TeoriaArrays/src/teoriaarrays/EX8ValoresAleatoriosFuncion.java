/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class EX8ValoresAleatoriosFuncion {
    
    public static void main(String[] args) {
         int[] valores_aleatorios = new int[10];
        Random rd = new Random();
        int cont=0;
        Scanner sc = new Scanner(System.in);
        
        
       // inicializarArrayAleatorios
                
     //   System.out.println("Muestro array");
        Utilitats.mostrarArray(valores_aleatorios);
       
     //   System.out.println("Pon valor R");
        int R = sc.nextInt(); //R

        //li passi el array y el valor R y retorni el numero de numeruso superior a r
        //contarSuperioresaR
        
        System.out.println("Hay " + cont + " valores superiores o iguales a " + R);
        
    }
    
    
    
    
    
}
