/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageString;

import PackageMath.Utilitats;
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
        System.out.println("Ex1 letras=" + letras);
        System.out.println("Ex 2 ");
        MayusculasMinusculas(frase);
        System.out.println("Ex 3");
        int numA = contarA(frase);
        System.out.println("EL numero de a's es " + numA);
        int numVocales = contarVocales(frase);
        System.out.println("numVocales:  " + numVocales);
        System.out.println("Exercici 6: Pon el caracter que quieres contar de la frase");
        char letraBuscada = sc.next().charAt(0);
        int numCar = contarCaracterFrase(frase, letraBuscada);
        System.out.println("La letra " + letraBuscada + " esta " + numCar);
        System.out.println("Exercici 7 ");
        FraseSinEspacio(frase);
        

    }

    private static int contarLetras(String frase) {
        int num=frase.length();
        return num;
    }
    
    /**
     * Función que muestra una frase que recibe por parámetros
     * y la muestra en mayusculas, y luego toda en mínusculas
     */
    
    private static void MayusculasMinusculas(String frase)
    {
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
    /**
     * Función que retorna el numero de 'a' de una frase.
     * 
     */
    private static int contarA(String frase) 
    {
        int contA=0;
        for (int i = 0; i < frase.length(); i++) 
            {
            //if (frase.toUpperCase().charAt(i)=='A')
            if (frase.charAt(i)=='a' || frase.charAt(i)=='A')
            {
                contA++;
            }
        }
        return contA;
    }
    
    private static int contarVocales(String frase) 
    {
        int numVocales=0;
        for (int i = 0; i < frase.length(); i++) 
            {
            //if (frase.toUpperCase().charAt(i)=='A')
            if (frase.charAt(i)=='a' || frase.charAt(i)=='A'
                || frase.charAt(i)=='e' || frase.charAt(i)=='E'
                || frase.charAt(i)=='i' || frase.charAt(i)=='I'    
                || frase.charAt(i)=='o' || frase.charAt(i)=='O'
                || frase.charAt(i)=='u' || frase.charAt(i)=='U')   
            {
                numVocales++;
            }
        }
        return numVocales;
    }

    private static int contarCaracterFrase(String frase, char letra)
    {
        int numCaracteres=0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==letra)
            {
                numCaracteres++;
            }
        }
        return numCaracteres;
    }

    private static void FraseSinEspacio(String frase)
    {
        //Solució 1
        System.out.println(frase.replace(" ", ""));
        //Solució 2
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)!= ' ')
            {
                System.out.print(frase.charAt(i));
            }
        }
        
        
    }
}



