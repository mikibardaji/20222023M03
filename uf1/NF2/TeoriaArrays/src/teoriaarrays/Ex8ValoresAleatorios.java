/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Random;
import java.util.Scanner;

/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.
 * @author mabardaji
 */
public class Ex8ValoresAleatorios {
    
    public static void main(String[] args) {
        int[] valores_aleatorios = new int[10];
        int cont;
        Scanner sc = new Scanner(System.in);
        
        //inicialitzar el array
        inicializarArrayAleatorios(valores_aleatorios);
        
        System.out.println("Muestro array");
        Utilitats.mostrarArray(valores_aleatorios);
       
        System.out.println("Pon valor R");
        int R = sc.nextInt(); //R
        //bucle per trobar quants valors son superior o igual a R  
        cont = contarSuperioresaR(valores_aleatorios, R);

        System.out.println("Hay " + cont + " valores superiores o iguales a " + R);
          
        
    }

    private static void inicializarArrayAleatorios(int[] valores_aleatorios) {
        Random rd = new Random();
        for (int i = 0; i < valores_aleatorios.length; i++) {
            //aleatori = rd.nextInt(1, 51);
            valores_aleatorios[i] = rd.nextInt(1, 51);
        }
    }

    private static int contarSuperioresaR(int[] valores_aleatorios, int R) {
        int cont=0;
        for (int index = 0; index < valores_aleatorios.length; index++) {
            if(valores_aleatorios[index]>=R)
            {
              cont++;  
            }
        }
        return cont;
    }
    
}
