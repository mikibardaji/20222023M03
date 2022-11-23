/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexercici1;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PracticaExercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = scan.nextInt();
        System.out.print("Input a month: ");
        int month = scan.nextInt();
        System.out.print("Input a day: ");
        int day = scan.nextInt();
        boolean date_correct = true;
        
        if (year<1900)
        {
               System.out.println("Year incorrecte >1900");
               date_correct = false;
        }
        //if (!(month<=1 && month<=12))
        if (month<1 || month>12)
        {
            System.out.println("Month incorrect month between 1 and 12");
            date_correct = false;
        }
//        if (day<1 || day>30)
//        {
//            System.out.println("day incorrect month between 1 and 30");
//            date_correct = false;
//        }
        if ((day<1 || day>30) && (month==4 || month==6 || month == 9 || month==11))
        {
            System.out.println("day incorrect month between 1 and 30");
            date_correct = false;
        }
        if ((day<1 || day>28) && (month==2))
        {
            System.out.println("day incorrect month between 1 and 30");
            date_correct = false;
        }
        if ((day<1 || day>31) && (month==1 || month==3 || month == 5 || month==7))
        {
            System.out.println("day incorrect month between 1 and 30");
            date_correct = false;
        }
        switch (month) {
            case 2:
                if ((day<1 || day>28))
                {
                    System.out.println("day incorrect month between 1 and 28");
                    date_correct = false;
                }
                break;
            case 4:
            case 6:    
            case 9:    
            case 11:  
                if ((day<1 || day>30))
                {
                    System.out.println("day incorrect month between 1 and 30");
                    date_correct = false;
                }
            case 1:
            case 3:    
            case 5:    
            case 7:  
            case 8:                  
            case 10: 
            case 12:                 
                if ((day<1 || day>31))
                {
                    System.out.println("day incorrect month between 1 and 31");
                    date_correct = false;
                }

        }
        
        
        
        
        if(date_correct==true)
        {
            System.out.println("Date OK");
        }
    }
    
}
