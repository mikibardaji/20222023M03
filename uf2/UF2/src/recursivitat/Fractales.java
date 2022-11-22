/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Fractales {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          System.out.println("Dime el lado del cuadrado inicial?");
          int lado =  sc.nextInt();
          
          int perimetro_total = contarPerimetroFractal(lado); //CamelCase
          
          System.out.println("Perimetro total: " + perimetro_total);
    }

    /**
     * cuenta el perimetro
     * @param lado
     * @return 
     */
    private static int contarPerimetroFractal(int lado) {
        if (lado==0)
        {
            return 0;
        }
//        else if (lado==1)
//        {
//            return 4*lado;
//        }
        else if(lado>0)
        {
            return 4*lado + 4*contarPerimetroFractal(lado/2);
            // 4*lado (perimetro cuadadro actual) + 4(4 cuadrados hijos) * perimetro(l/2) uno de los hijos
        }
        return -1;
    }
}
