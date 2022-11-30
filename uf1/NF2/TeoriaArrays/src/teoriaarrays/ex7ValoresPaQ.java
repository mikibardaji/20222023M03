/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros P y Q, 
 * luego cree un array que contenga
 * todos los valores desde P hasta Q, y lo muestre por pantalla.
 * @author mabardaji
 */
public class ex7ValoresPaQ {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Pon valor minimo");
          int minimo = sc.nextInt(); //P
          System.out.println("Pon valor maximo");
          int maximo = sc.nextInt(); //Q
          
          final int TAMANY = maximo-minimo+1;
          int[] valores = new int[TAMANY];
          for (int index = 0; index < valores.length; index++) 
          {
              valores[index] = minimo;
//              if(minimo<maximo) // comprovacio redundant
//              {
                  ++minimo;
//              }2
              
          }
          
          System.out.println("Muestro array");
            Utilitats.mostrarArray(valores);
          
    }
//1pas
    
    //2onpas
    
}
