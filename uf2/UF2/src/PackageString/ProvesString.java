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
public class ProvesString {
    public static void main(String[] args) {
        int x=3;
        String frase="Hola que tal ";
        System.out.println(frase + x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        
//        frase = sc.nextLine();
//        System.out.println("frase con nextLine " + frase);
//        if(frase.isEmpty())
//        {
//            System.out.println("String vacio");
//        }
//        else
//        {
//            System.out.println("String no vacio");
//        }
//        
//        System.out.println("La frase tienen " + frase.length());
//        
//        for (int i = 0; i < frase.length(); i++) {
//            System.out.println("En la posicion " + i+ " hay el caracter " + frase.charAt(i));
//        }
        String f1 = "hola que tal";
        String f2 = "hola que Tal";
        if (f1.equals(f2))
        {
            System.out.println("Frase igual");
        }
        else
        {
            System.out.println("Frase diferente");
        }
        if (f1.equalsIgnoreCase(f2))
        {
            System.out.println("Frase igual sin importar mayusculas");
        }
        else
        {
            System.out.println("Frase diferente sin importar mayus,");
        }        
        
        if (f1.contains("que"))
        {
            System.out.println("contiene la palabra que");
        }
        else
          {
            System.out.println("No contiene la palabra que");
        }
        System.out.println("La frase tienen " + frase.length());
        f1 = "hola que tal?";
        f2 = "Yo estoy bien";
        
        String f3= f1.concat(f2);
        System.out.println("f1 concatenar " + f3 );
        int unicode = f1.codePointAt(0);
        System.out.println("codigo unicode " + unicode);
        if(f1.startsWith("Hola"))
        {
            System.out.println("Empieza por hola");
        }
        else
        {
            System.out.println("No empieza por hola");
        }
        
        System.out.println(f1.toUpperCase());
        System.out.println(f1.replace('a','e'));
        System.out.println(f1.repeat(4));
        f1.compareTo(f2);
        
    }
}
