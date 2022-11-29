/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import java.util.Scanner;
import Utilitats.Utilitats;

/**
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 * @author mabardaji
 */
public class maximominimoarray {
    public static void main(String[] args) {
        final int TAMANY = 6;
        int[] numeros = new int[TAMANY];
        
        //demanar datos
        introducirDatosArray(numeros);

        
        Utilitats.mostrarArray(numeros);
        
        
        int minimo, maximo;
        minimo=numeros[0]; //si solo leo un numero este seguro que es el minimo
        maximo=numeros[0]; //si solo leo un numero este seguro que es el maximo
        for (int index = 0; index < numeros.length; index++) {
            if(numeros[index]>maximo)
            {
                maximo=numeros[index];
            }
            if(numeros[index]<minimo)
            {
                minimo = numeros[index];
            }
            
        }
        
        System.out.println("El maximo es " + maximo);
        System.out.println("El minimo es " + minimo);
    }

    private static void introducirDatosArray(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce valor " + (i+1) + "=");
            numeros[i] = sc.nextInt();
        }
    }
    
   
}
