/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     * Dibuja un ordinograma que toma como dato de entrada un número 
     * que corresponde a la longitud de un radio y 
     * nos escribe la longitud de la circunferencia(Pi * diametro), 
     * el área del círculo(buscalo en google).
     */
    public static void main(String[] args) {
        double longitud_circunferencia;
        double area;
        final double PI = 3.14;
        double radio;
         Scanner sc = new Scanner(System.in); //recoger datos teclado
         System.out.println("Pon el radio de la circunferencia");
         radio = sc.nextDouble();
         double diametro = radio + radio;
         longitud_circunferencia = PI * diametro;
         System.out.println(diametro + " - " + longitud_circunferencia );
         area = PI * radio * radio;
         System.out.println("area es " + area);
        


    }
    
}
