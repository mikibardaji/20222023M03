/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2dowhile;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ejemplo2dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        do
            {
            System.out.print("Pon numeros , para terminar escribe 0? ");
            num=sc.nextInt();
            if (num<0)
                {
                       System.out.println("numero negativo no valido");
                }
            else if (num>0)
                {
                    System.out.println("Has escrito -> " + num);
                }
            }while(num!=0); //condición para que continue
        System.out.println("Programa terminado");
        
        //negando la condicion de salida
          do
            {
            System.out.print("Pon numeros , para terminar escribe 0? ");
            num=sc.nextInt();
            if (num<0)
                {
                       System.out.println("numero negativo no valido");
                }
            else if (num>0)
                {
                    System.out.println("Has escrito -> " + num);
                }
            }while(!(num==0)); //condición para que continue
        
        
    }
    
}
