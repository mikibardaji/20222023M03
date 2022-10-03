/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3while;

/**
 *
 * @author mabardaji
 */
public class Ejemplo3while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma_acum=0; //variable acumulativa
        int contador=1;
        
        while(contador<=5)
        {
            suma_acum = suma_acum + contador;
            System.out.println("Contador=" + contador + " suma:" + suma_acum);
            contador=contador+1;
        }
        System.out.println("la suma acumulada while es " + suma_acum);
        
        suma_acum=0;
        for (contador = 1; contador <=5; contador++) {
            suma_acum = suma_acum + contador;
            System.out.println("Contador=" + contador + " suma:" + suma_acum);
        }
        
        System.out.println("la suma acumulada for es " + suma_acum);
        
        
        
        
    }
    
}
