/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ValidarPasswordUsuario {
    
    public static void main(String[] args) {
        String usuario, password;
        
        usuario = ponString("Pon tu mail");
        password = ponString("Pon tu password");
        
        boolean valido = validarDatosEntrada(usuario,password);
        if (valido==true)
        {
            System.out.println("Password y usuario validos!!!");
        }
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

    /**
     * funcion que valida el usuario y el passwors
     * @param usuario
     * @param password
     * @return true si los dos son validos, false si alguno o los dos
     * son invalidos
     */
    private static boolean validarDatosEntrada(String usuario, String password) {
        boolean valido=true;
//detectar que NO tiena @
        if(!usuario.contains("@"))
        {
            System.out.println("No contiene la @");
            valido=false;
        }
        
        
        
        if(usuario.contains(" "))
        {
            System.out.println("usuario contiene espacios");
            valido=false;
        }
        if(password.contains(" "))
        {
            System.out.println("password contiene espacios");
            valido=false;
        }
        if(!usuario.endsWith("@proven.cat"))
        {
            System.out.println("Dominio mail incorrecto");
            valido=false;
        }
        if(password.length()<8)
        {
            System.out.println("Longitud password incorrecto");
            valido=false;
        }
        
        return valido;
    }

    
}
