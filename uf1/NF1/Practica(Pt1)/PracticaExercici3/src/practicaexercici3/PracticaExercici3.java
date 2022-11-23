/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexercici3;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PracticaExercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int PRECIO_ADULTO = 20;
        final int PRECIO_MENOR = 10;
        final double DESCUENTO = 0.25;
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantes entrades vols?: ");
        int total_entrades = scan.nextInt();
        System.out.print("Quants menors hi ha?: ");
        int menors = scan.nextInt();
        int adults = total_entrades-menors;
        double precio_final=0;
        precio_final = adults * PRECIO_ADULTO + menors * PRECIO_MENOR;
        System.out.println("total_entrades " + total_entrades);
        if (total_entrades<25 && total_entrades>=10) // 
        {
            System.out.println("has entrado entre 25 y 10");
            //descuento = (adults * PRECIO_ADULTO + menors * PRECIO_MENOR) *DESCUENTO;
            //precio_final = precio_final - descuento;
            System.out.println("precio final sin descuento" + precio_final);
            precio_final = precio_final * (1-DESCUENTO);
        }else if (total_entrades>25)//supera el 25
        {
            System.out.println("has entrado superior 25 ");
            if (adults>0) //puede ser que no haya adultos
            {
                precio_final = (precio_final - PRECIO_ADULTO) * (1-DESCUENTO);
            }
            else
            {
                 precio_final = (precio_final - PRECIO_MENOR) * (1-DESCUENTO);
            }
            
        }
        
        System.out.println("En total debes de pagar : " + precio_final);
    }
    
}
