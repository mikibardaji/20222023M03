/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2bucles;

/**
 *
 * @author mabardaji
 */
public class Exercici2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador;
        System.out.println("contador de 2 en 2");
        for (contador=2;contador<=20;contador=contador+2)
        {
            System.out.println(contador);
        }
        System.out.println("contador de 1 en 1 solo mostrando los pares");
        for (contador=2;contador<=20;contador++)
        {
              // System.out.println(contador);
            if(contador%2==0) //par
            {
                System.out.println("Par " + contador);
            } //else no imprimere
         
        }
        
        
    }
    
}
