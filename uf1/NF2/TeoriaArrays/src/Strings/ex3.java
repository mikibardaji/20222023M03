/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
 * @author mabardaji
 */
public class ex3 {
    
    public static void main(String[] args) {
        String nombre, apell1, apell2;
    
        nombre = ponString("Pon tu nombre");
        apell1 = ponString("Pon tu primer apellido");
        apell2 = ponString("Pon tu segundo apellido");
        System.out.println(nombre+apell1+apell2);
        String nombreUsuario = nombre.substring(0, 3)
                + apell1.substring(0, 3)
                + apell2.substring(0, 3);
        System.out.println(nombreUsuario.toUpperCase());
        
        char[] codigoNombre = new char[3];
        char[] codigoApelli1 = new char[3];
        char[] codigoApelli2 = new char[3];
        
        for (int i = 0; i < 3; i++) {
            codigoNombre[i] = nombre.charAt(i);
        }
        int num=0;
        for (int i = nombre.length()-3; i < nombre.length(); i++) {
            codigoNombre[num] = nombre.charAt(i);
            num++;
        }
        
        
        for (int i = 0; i < 3; i++) {
            codigoApelli1[i] = apell1.charAt(i);
        }
        for (int i = 0; i < 3; i++) {
            codigoApelli2[i] = apell2.charAt(i);
        }
        
        nombreUsuario = String.valueOf(codigoNombre) + 
                String.valueOf(codigoApelli1) +
                String.valueOf(codigoApelli2) ;
            
        }
       
    

    /**
     * te pedira un string y lo retorna
     * @param pregunta el texto que se mostrara en pantalla
     * @return la palabra introducida
     */
    private static String ponString(String pregunta) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pregunta);
        String respuesta = sc.nextLine();
        return respuesta;
        //return sc.nextLine();
    }
    
    
    
}
