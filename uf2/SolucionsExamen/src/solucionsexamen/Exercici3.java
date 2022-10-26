package solucionsexamen;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Pregunta la taula de multiplicar del número entrar per l'usuari i indica el
 * nombre d'errades al final
 *
 * @author ProvenSoft
 */
public class Exercici3 {

    public static void main(String[] args) {
        //dades del programa
        int numErrades = 0;
        Scanner lector = new Scanner(System.in);
        Random rd = new Random();
        //generar el número per a la taula
        int numero = rd.nextInt(9) + 1;
        //preguntar la taula del número
        System.out.println("Taula de multiplicar del número " + numero);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i +"=");
            //càlcul del resultat correcte i el guardo
            int resultatCorrecte = numero * i;
                //llegir resposta de l'usuari
            int resultatUsuari = lector.nextInt();
                //comprovar si la resposta de l'usuari és vàlida.
            if (resultatUsuari != resultatCorrecte) 
                { //resposta errònia
                    numErrades++;  //incrementar comptador d'errades
                    System.out.println(
                            ">>Incorrecte " + numero + "x" + i + "=" + resultatCorrecte );
                }
            

        }
        System.out.println("Has tingut " + numErrades + " errades");

    }

}
