/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petardoswii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PetardosWii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int petardo1, petardo2, petardo3;
        boolean win=false;
         petardo1 = rd.nextInt(10)+1;
        //System.out.println("p1 " + petardo1);
        petardo2 = rd.nextInt(10)+1;
        //System.out.println("p2 " + petardo2);
        petardo3 = rd.nextInt(10)+1;
        //System.out.println("p3 " + petardo3);
        System.out.println("Que petardo quieres(1-3)");
        int eleccionPetardo = sc.nextInt();
        System.out.println(eleccionPetardo);
        
       
        
        
        switch (eleccionPetardo) {
            case 1: //he elegido el petado 1
                if (petardo1>=petardo2 && petardo1>=petardo3)
                {
                    win=true;
                }
                //else win=false ya estaba inicializada false      
                break;
            case 2: //he elegido el petado 2
                if (petardo2>=petardo1 && petardo2>=petardo3)
                {
                    win=true;
                }
                break;
            case 3: //he elegido el petado 3
                if (petardo3>=petardo1 && petardo3>=petardo2)
                {
                    win = true;
                }      
                break;                
            default:
                System.out.println("No has escogido bien");
        }
        
        //pintar asteriscos o espacio
        //  petardo1,petardo2,petardo3)

        for (int linea = 1; linea <= 10; linea++) {
            //petardo1
            if(linea<=petardo1)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
            if (linea<=petardo2)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
            if (linea<=petardo3)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }            
            System.out.println("");//retru
            Thread.sleep(500);
        }
        

        if(win == true)
        {
            System.out.println("Has ganado");
        }
        else
        {
            System.out.println("Has perdido");
        }

        
        
    }
    
}
