/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import java.util.Scanner;

/**
 * 5) Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
 * mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la
 * posicion es correcta, se añadira a una cadena que se mostrara al final, se
 * dejará de insertar cuando se introduzca un -1.
 *
 * Por ejemplo, si escribo los siguientes numeros 0 //Añadira la ‘A’ 5 //Añadira
 * la ‘F’ 25 //Añadira la ‘Z’ 50 //Error, inserte otro numero -1 //fin
 *
 * Cadena resultante: AFZ
 *
 * @author mabardaji
 */
public class Ejercicio5WebEscribirFrase {

    public static void main(String[] args) {
        //char[] abecedario = {'A','B','C','D'};
        char[] abecedario = new char[26];
        abecedario[0] = 'A';
        abecedario[1] = 'B';
        abecedario[2] = 'C';
        /*.... 25*/
        int cont = 0;
        String frase = "";
        for (int i = 65; i < 91; i++) {
            abecedario[cont] = (char) i;
            cont++;
        }

        for (int i = 0; i < abecedario.length; i++) {
            System.out.println(abecedario[i]);
        }
        int pos;
        do 
            {
                pos = pedirPosicionLetra();
                if (pos != -1) //comprobació necessaria
                {//perque la posició -1 no existeix al array
                    frase = frase + abecedario[pos];
                }
            } while (pos != -1);
        
        System.out.println(frase);
        //frase.contains(abecedario[pos]);

    }

    private static int pedirPosicionLetra() {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Pon la posicion letra (0-25)"
                    + " (-1 terminar)");
            valor = sc.nextInt();
        } while (!(valor >= -1 && valor <= 25));

        return valor;
    }
}
