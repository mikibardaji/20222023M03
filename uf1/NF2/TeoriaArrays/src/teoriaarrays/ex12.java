/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *  e un array de 10 enteros y
 * a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
que el usuario elija la opción ‘c’ que terminará el programa.

 * @author mabardaji
 */
public class ex12 {
    
    public static void main(String[] args) {
        int[] valores = new int[10];
        //totes les posicions  a 0
         char opcion;
        do{
            opcion = menu();
            switch (opcion) {
                case 'a':
                    Utilitats.mostrarArray(valores);
                    break;
                case 'b': //introducir
                    cambiarValorPosicion(valores);
                    break;
                case 'c':
                    System.out.println("Saliendo ... ");
                    break;
//                default:
//                    throw new AssertionError();
            }
        }while(opcion!='c');
    }

    private static char menu() {
            Scanner sc = new Scanner(System.in);
            char letra=' ';
            do{
            System.out.println("a. Mostrar valores.\n" +
                               "b. Introducir valor.\n" +
                                "c. Salir.");
            System.out.print("Pon opcion:");
            letra = sc.next().charAt(0); 
            }while(letra<'a' || letra>'c');
            return letra;
            
    }

    /**
     * La opción ‘b’ pedirá un valor V y una
        posición P, luego escribirá V en la posición P del array
     * @param valores 
     */
    private static void cambiarValorPosicion(int[] valores) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un valor");
        int v = sc.nextInt();
        int pos;
        //bucle per controlar que la posición
        //esta dentro del array
        do
            {
            System.out.println("Pon posicion 1-" + valores.length);
            pos=sc.nextInt();
            }while(pos<1 || pos>valores.length);
        valores[pos-1]=v;
        
    }
}
