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
public class ex8numeros1aN {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Pon un numero:");
        int numero = sc.nextInt();
        int suma, producto;
        double mitad, mitad2numeros;
        suma = suma1aN(numero);
        System.out.println("La suma de 1 a " + numero 
                + " es " + suma);
        producto = producto1aN(numero);
        System.out.println("El producto de 1 a " + numero 
                + " es " + producto);
        mitad = intermedio1aN(numero);
        System.out.println("La mitad de 1 a " + numero 
                + " es " + mitad);
        mitad2numeros = intermedioNyM(numero, 1000);
        System.out.println("La mitad de " + numero  + " y 1000 "
                + " es " + mitad2numeros);
    }
    
    /**
     * 
     * @param n el numero maximo a multiplicar
     * @return la multiplicació de 1 a n
     */
    public static int producto1aN(int n)
    {
        int producto=1;
        for (int i = 1; i <= n; i++) {
            producto = producto*i;
        }
        
        return producto;
    }
    
    /**
     * calcular la suma de todos los numeros desde 1 hasta n
     * @param n el numero maximo a sumar
     * @return la suma de todos los numeros
     */
    public static int suma1aN(int n)
    {
        int suma=0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i; 
        }
        
        return suma;
    }
    
    
    
    /**
     * encontrar el valor medio entre 1 y n
     * @param n el numero maximo
     * @return el numeor del medio entre 1 y n
     */
    public static double intermedio1aN(int n)
    {
        double mitad = (double)(1 + n)/2;
        return mitad;
    }
    
    /**
     * encontrar el valor medio entre m y n
     * @param minimo valor mas pequeño
     * @param maximo valor mas grande
     * @return  la mitad entre los dos numeros pasados
     */
    public static double intermedioNyM(int minimo, int maximo)
    {
        double mitad = (double)(maximo + minimo)/2;
        return mitad;
    }
    
}
