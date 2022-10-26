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
public class exercici7Rectangulo {
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Pon el ancho rectangulo : ");
         double ancho = sc.nextDouble();
         System.out.print("Pon el alto rectangulo : ");
         double alto = sc.nextDouble();
         
         double perimetro = perimetroRectangulo(ancho, alto);
         double area = areaRectangulo(ancho, alto);
         
         System.out.println("El area es " + area);
         System.out.println("El perimetro es " + perimetro);
         
    }
    
    
    /**
     * // Devuelve el perímetro del rectangulo
     * @param ancho del rectangulo
     * @param alto del rectangulo
     * @return el valor de la perimetro del rectangulo
     */
    public static double perimetroRectangulo(double ancho, double alto)
    {
        double perimetro = (ancho*2) + (alto*2);
        return perimetro;
        //return ((ancho*2) + (alto*2));
    }
    
    
    /**
     * devuelve el area del rectangulo pasado
     * @param ancho del rectangulo
     * @param alto del rectangulo
     * @return el area del rectangulo de medidas pasadas
     */
    
 
    public static double areaRectangulo(double ancho, double alto)
    {
        double area = ancho*alto;
        return area;
    }
}
