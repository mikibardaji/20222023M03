/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author mabardaji
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros;
        int acum_pares=0, acum_impar=0;
        
        for (numeros = 100; numeros <= 200; numeros++) {
           
            if (numeros%2==0)
                {
                    acum_pares = acum_pares + numeros;
                    //acum_pares += numeros;
                    
                }
            else 
                {
                    acum_impar = acum_impar + numeros;
                    //acum_impar += numeros;
                   
                }
            
        }
        
        System.out.println("La suma de los pares es " + acum_pares);
        System.out.println("La suma de los impare es " + acum_impar);
    }
    
}
