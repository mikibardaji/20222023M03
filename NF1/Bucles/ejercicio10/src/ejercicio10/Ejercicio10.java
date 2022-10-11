/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        boolean puesto_10 = false;
         Scanner sc = new Scanner(System.in);
         int cont_notas=0;
        do
            {
                 System.out.println("Pon notas, escribe -1 para salir");
                 nota=sc.nextInt();
                 
                 if (nota==10)
                    { //activo variable centinela
                        puesto_10=true;
                    }
                 if (nota>10 || nota<0)
                 {
                     System.out.println("nota incorrrecta debe de estar entre 0 y 10");
                 }
                 else{ //nota correcta
                     cont_notas++;
                 }
                
            } while(nota!=-1);
        
        
            if (puesto_10==true)
                {
                    System.out.println("Has puesto algun 10");
                }
            else
            {
                System.out.println("No has pueso ningun 10");
            }
        
        System.out.println("Has pusto" + cont_notas + " notas");
       
        
        
    }
    
}
