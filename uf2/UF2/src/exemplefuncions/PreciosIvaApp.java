/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplefuncions;

import java.util.Scanner;

/**
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA.
 * @author mabardaji
 */
public class PreciosIvaApp {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pedir 5 precios y llamar la función en cada precio
        double precio;
        double IVA;
       // for (int i = 0; i < 5; i++) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Pon el precio: ");
            precio = sc.nextDouble();
            IVA = precioConIVA(precio);
            System.out.println("Tu precio con iva es " + IVA);
        }
        
        //}
        //mostrar el precio con iva
        
        
    }
    
    
    public static double precioConIVA(double precio)
    {
        double precioIVA;
        precioIVA = precio + (precio*0.21);
        //precioIVA = precio * 1.21;
        return precioIVA;
    }
    //double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
}
