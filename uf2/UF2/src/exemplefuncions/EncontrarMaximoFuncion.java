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
public class EncontrarMaximoFuncion {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("maximmo");
        Scanner sc = new Scanner(System.in);
        //pedir dos valores
        double num1,num2,max;
        System.out.println("Pon el valor 1");
        num1= sc.nextDouble();
        System.out.println("Pon el valor 2");
        num2= sc.nextDouble();
        //llamar a funcion maximo que RETORNARA el valor
        //recogerlo en otra variable
        max = maximo(num1, num2);
        //mostrar el valor maximo (recogido en la variable anterior)
        System.out.println("maximo ->" + max);
        
        max = minimo(num1, num2);
        System.out.println("minimo-> " + max);
        
        
    }
    
    
    public static double maximo(double valor1, double valor2) 
    {
        double max;
        if (valor1 > valor2)
        {
            max = valor1;
        }
        else
        {
            max = valor2;
        }
            
        return max;
    }


    public static double minimo(double valor1, double valor2) 
    {
        double min;
        if (valor1 > valor2)
        {
            min = valor2;
        }
        else
        {
            min = valor1;
        }
            
        return min;
    }    
    
    
    
}
