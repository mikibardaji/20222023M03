/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Pon el numero y hare su tabla de multuplicar");
//        int num = sc.nextInt();
        int calculo;
        for (int tabla = 1; tabla <= 10; tabla++) 
        {
            System.out.println("Tabla de multiplicar del " + tabla);
            for (int i = 1; i <= 10; i++) {
                calculo = i * tabla;
                //System.out.println(i + "x" + num + "=" + (i*num));
                System.out.println(i + "x" + tabla + "=" + calculo);
            }
        }

    }

}
