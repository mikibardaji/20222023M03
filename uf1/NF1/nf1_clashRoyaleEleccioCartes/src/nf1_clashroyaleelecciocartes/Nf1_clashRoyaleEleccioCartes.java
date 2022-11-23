/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nf1_clashroyaleelecciocartes;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Nf1_clashRoyaleEleccioCartes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cups;
        Scanner sc=new Scanner(System.in);
        System.out.print("Cuantas copas tienes? ");
        cups = sc.nextInt();
        System.out.println("Escoge una carta");
        char carta;
        
       // sc.nextLine(); //limpio buffer scaneer del nextInt (paso del return)
        if (cups<2000)
        {
            System.out.println("M- Mago Electrico");
            System.out.println("E- Esbirro Mega");
            System.out.println("Escoger carta");
            carta = sc.next().charAt(0);
            switch(carta)
            {
                case 'm':
                case 'M':
                    System.out.println("Has escogido el mago electrico");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escogido el Esbirro mega");
                    break;
            }     
            //haig d'escollir la carta i despres mostrar el missate
        }
        else if(cups>=2000 && cups <3000)
        {
            System.out.println("B- Bandida");
            System.out.println("C- Cavallero");
            System.out.println("Escoger carta");
            carta = sc.next().charAt(0);
            switch(carta)
            {
                case 'c':
                case 'C':
                    System.out.println("Has escogido el Cavallero");
                    break;
                case 'B':
                case 'b':
                    System.out.println("Has escogido el Bandida");
                    break;
            } 
        }
        else if(cups>=3000)
        {
            System.out.println("G- Gigante");
            System.out.println("K- Ejercito de esqueltos");
            System.out.println("Escoger carta");
            carta = sc.next().charAt(0);
            switch(carta)
            {
                case 'G':
                case 'g':
                    System.out.println("Has escogido el Gigante");
                    break;
                case 'K':
                case 'k':
                    System.out.println("Has escogido el Ejercito de esqueltos");
                    break;
            }             
        }
        
    }
    
}
