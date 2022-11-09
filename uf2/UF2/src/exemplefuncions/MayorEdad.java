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
public class MayorEdad {
    
     /**
     * @param args the command line arguments
     * . Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
        o no. Implementa y utiliza la función:
            boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario

     */
    public static void main(String[] args) {
        boolean mayor;
        Scanner sc = new Scanner(System.in);
        //pedir la edad del usuario
        System.out.println("Pon la edad que tienes");
        int edad = sc.nextInt();
        //llamar a la función que te devuelve true/fasle si eres matyo
        mayor=Utilitats.esMayorEdad(edad);
        //dependiendo de lo uqe te haya escribir eres mayor de edad o menor
        if(mayor==true)
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("Eres de menor edad");            
        }
        

        
    } //fi main

//    public static boolean esMayorEdad(int a)
//    {
//        boolean mayor;
//        if(a>=18)
//            {
//                //return true;
//                mayor=true;
//            }
//        else
//            {
//                mayor=false;
//                //return false;
//            }
//        
//        
//        return mayor;
//    }
//

}
