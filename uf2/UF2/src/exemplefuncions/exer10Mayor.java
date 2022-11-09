/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplefuncions;

import PackageMath.Utilitats;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class exer10Mayor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un numero:");
        int numero1 = Utilitats.pedirValorPositivo();
        System.out.print("Pon el segundo numero:");
        int numero2 = sc.nextInt();
        System.out.print("Pon el tercer numero:");
        int numero3 = sc.nextInt();
        int mayor = esMayor(numero1,numero2);
        //tengo el mas grande entre 1 y 2
        mayor = esMayor(numero3, mayor);
        System.out.println("El valor mas grande es " + mayor);
        
        
    }
    
    /**
     * deuvleve el numero mas grande entre 2
     * @param v1 primer valor
     * @param v2 segundo valor
     * @return valor mas grande
     */
    public static int esMayor(int v1, int v2)
    {
        int mayor;
        if(v1>v2)
            mayor=v1; //si es sola una linea puedes no poner {}
        else
            mayor=v2; //si es sola una linea puedes no poner {}
        mayor++;

        return mayor; 
    }
}
