/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercici17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora, minutos, segundos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon la hora:");
        hora = sc.nextInt();
        System.out.print("Pon el minuto:");
        minutos = sc.nextInt();
        System.out.print("Pon los segundos:");
        segundos = sc.nextInt();
        
        segundos = segundos +1; //segundos++;
        
        if(segundos ==60)
            {//cambio minuts
                    segundos = 0;
                    minutos++; //minutos = minutos + 1
                    if (minutos == 60)
                    {//cambio horas
                        minutos = 0;
                        hora = hora + 1;
                        if(hora==24)
                            {
                                hora = 0;
                            }
                    }
            }
        
        
        
        System.out.println("El segundo siguiente es  " + hora + ":" + minutos + ":"+ segundos);
        
    }
    
}
