/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.util.Scanner;

/**
 * Dibuja un ordinograma que lea un valor correspondiente a una distancia en millas marinas 
 * y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
 * @author mabardaji
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int milla;
        Scanner sc = new Scanner(System.in); //recoger datos teclado
        System.out.println("Pon las millas que te transformare a metros? ");
        milla = sc.nextInt();
        final int milla_metros = 1852;
        
        int metros = milla*milla_metros;
        System.out.println( milla+" millas son " + metros + " metros");
        
    }
    
}
