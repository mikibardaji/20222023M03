/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minim = 1, maxim = 100, mitad;
        char respuesta;
        
        do{
            mitad = (maxim + minim)/ 2;
            System.out.println("El numero es " + mitad);
            System.out.println("He acertado(i,m,n)");
            respuesta = sc.next().charAt(0);
            if (respuesta=='m'){
                minim=mitad;
            }
            else if(respuesta=='n'){
               maxim=mitad; 
            }
        }while (respuesta != 'i');
        System.out.println("Acertaste");
    }
    
}
