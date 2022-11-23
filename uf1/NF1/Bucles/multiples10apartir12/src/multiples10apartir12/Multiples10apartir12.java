/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiples10apartir12;

/**
 * Escriu un programa que mostri per pantalla 
 * els 10 múltiples de 7 a partir del 12
 * @author mabardaji
 */
public class Multiples10apartir12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=12;
        int cont10=0;
        do
        {
            
            num++;
            if (num%7==0)
            {
                cont10++;
                System.out.println(num );
            }
        }while(cont10<10);
    }
    
}
