/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplefuncions;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class exer11DataCorrecta {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon dia: ");
        int dia = sc.nextInt();
        System.out.print("Pon mes: ");
        int mes = sc.nextInt();
        System.out.print("Pon año: ");
        int anyo = sc.nextInt();
        
        boolean correcta = fechaCorrecta(dia, mes, anyo);
        
        //if(correcta==true)
        if(correcta)
        //if(fechaCorrecta(dia, mes, anyo))    
        {
            System.out.println("Fecha correcta");
        }
        else
        {
            System.out.println("Fecha incorrecta");
        }
        
    }
    
    
    public static boolean fechaCorrecta(int dia, int mes , int anyo)
    {
        boolean correcta=true;
        if(anyo<1900)
            {
                correcta=false;
            }       
        if(mes<1 || mes>12)
            {
                correcta = false;
            }        
        if(dia<1 || dia > 30)
            {
            correcta = false;
            }
                
                
        return correcta;
    }
}
