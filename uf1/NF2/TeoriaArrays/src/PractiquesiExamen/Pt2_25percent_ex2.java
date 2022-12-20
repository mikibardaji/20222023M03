/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesiExamen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Pt2_25percent_ex2 {
    public static void main(String[] args) {
        String nom;
        String posicio;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("Fica el teu nom");
            nom = sc.nextLine();
        }while(nom.length()<4);
        System.out.println("Quina part vols agafar(first/last)");
        posicio = sc.next();
        String gamer="";
        if (posicio.equalsIgnoreCase("first"))
        {
            gamer = nom.substring(0, 4);
        }
        else 
        {
            gamer = nom.substring(nom.length()-4);
        }
        
        Random rd = new Random();
        int numero = rd.nextInt(10000)+1;
        String num = String.valueOf(numero);
        
        
        String nick = gamer + "_" + num;
        System.out.println(nick);
    }
}
