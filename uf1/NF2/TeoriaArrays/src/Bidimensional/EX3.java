/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) 
 * e introduzca en ella NxM valores (también introducidos aleatorios del 1 al 10). 
* Mostrar luego el array
* Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos 
* valores son mayores que 5, cuántos son menores que 5 y cuántos son igual a 5.
 * @author mabardaji
 */
public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el valor de files");
        final int FILES=sc.nextInt();
        System.out.println("Pon el valor de columnes");
        final int COLUM=sc.nextInt();
        
        int [][] tabla= new int[FILES][COLUM];
        
        Random rd=new Random();
        
        for (int files = 0; files < FILES; files++) {
            for (int colum = 0; colum < COLUM; colum++) {
                tabla[files][colum]=rd.nextInt(10)+1;
            }
        }
        Utilitats.Utilitats.mostrarArray2D(tabla);
        int cont5=0;
        int contmayor5=0;
        int menor5=0;
        for (int files = 0; files < FILES; files++) {
            for (int colum = 0; colum < COLUM; colum++) {
                if(tabla[files][colum]==5)
                {
                    cont5++;
                }
                else if(tabla[files][colum]<5)
                {
                    menor5++;
                }
                else if(tabla[files][colum]>5)
                {
                    contmayor5++;
                }
                
                }
            }
        System.out.println("Superior de 5 "+contmayor5);
        System.out.println("Igual a 5 "+cont5);
        System.out.println("Menor que 5  "+menor5);
        }
        
        
        
    }

