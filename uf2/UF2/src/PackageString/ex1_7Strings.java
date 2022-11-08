/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageString;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ex1_7Strings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la frase que quieras");
        String frase = sc.nextLine();
        //ex1 que retorne el numero de caracteres
        int letras=contarLetras(frase); 
        System.out.println(letras);
        
    }

    private static int contarLetras(String frase) {
        int num=frase.length();
        return num;
    }
}
