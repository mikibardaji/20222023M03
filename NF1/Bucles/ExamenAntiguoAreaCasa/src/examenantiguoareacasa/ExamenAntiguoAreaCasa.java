/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenantiguoareacasa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExamenAntiguoAreaCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int altura, ancho, areah, area_casa=0;
         char seguir;
         do{
            System.out.println("altura habitacion");
            altura = sc.nextInt();
            System.out.println("ancho habitacion");
            ancho = sc.nextInt();
            areah = altura*ancho;
            area_casa = area_casa + areah;
            System.out.println("Tienes mas habitaciones (s/n)");
           // sc.nextLine(); //el return del nextint el llegeix i el neteja
            seguir = sc.next().charAt(0);
         }while(seguir=='s' || seguir=='S');
         System.out.println("La casa mide " + area_casa);
    }
    
}
