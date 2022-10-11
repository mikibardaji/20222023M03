/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AdivinarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int aleatori = rd.nextInt(51)+50;
        //System.out.println("el aleatori es " + aleatori);
        int numero;
        do{
        //AQUI NO PORQUE CAMBIARIA EL NUMERO A CADA VUELTA    aleatori = rd.nextInt(51)+50;
        System.out.println("dime un numero y te dire si acertaste");
        numero = sc.nextInt();
        if(numero>aleatori)
        {
            System.out.println("Es mes petit");
        }
        else if (numero<aleatori)
        {
            System.out.println("Es mes gran");
        }
        else if(numero==aleatori)
        {
            System.out.println("Has acertat");
        }
        }while(numero!=aleatori);
    }
    
}
