/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bf1_clashroyalemenoscodigo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Bf1_clashRoyalemenoscodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cups;
        Scanner sc=new Scanner(System.in);
        System.out.print("Cuantas copas tienes? ");
        cups = sc.nextInt();
        System.out.println("Escoge una carta");
        char card;
        
       // sc.nextLine(); //limpio buffer scaneer del nextInt (paso del return)
        if (cups<2000)
        {
            System.out.println("M- Mago Electrico");
            System.out.println("E- Esbirro Mega");
        }
        else if(cups>=2000 && cups <3000)
        {
            System.out.println("B- Bandida");
            System.out.println("C- Cavallero");
        }
        else if(cups>=3000)
        {
            System.out.println("G- Gigante");
            System.out.println("K- Ejercito de esqueletos");             
        }
        
        System.out.println("Escoger carta");
        card = sc.next().charAt(0);
        switch(card)
            {
                case 'm':
                case 'M':
                    System.out.println("Has escogido el mago electrico");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Has escogido el Esbirro mega");
                    break;
                case 'G':
                case 'g':
                    System.out.println("Has escogido el Gigante");
                    break;
                case 'K':
                case 'k':
                    System.out.println("Has escogido el Ejercito de esqueltos");
                    break;
                case 'c':
                case 'C':
                    System.out.println("Has escogido el Cavallero");
                    break;
                case 'B':
                case 'b':
                    System.out.println("Has escogido el Bandida");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }     
            //haig d'escollir la card i despres mostrar el missate
        
    }
    
}
