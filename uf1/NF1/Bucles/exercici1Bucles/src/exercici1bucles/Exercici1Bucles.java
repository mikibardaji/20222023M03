/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1bucles;

/**
 *
 * @author mabardaji
 */
public class Exercici1Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=1;
        while(contador<=20)
        {
            System.out.println(contador);
            contador++;
        }
        
        for (contador = 1; contador <= 20; contador++) {
            System.out.println("for--> " + contador);
        }
    }
    
}
