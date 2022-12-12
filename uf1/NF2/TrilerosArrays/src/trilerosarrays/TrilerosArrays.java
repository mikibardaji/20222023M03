/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trilerosarrays;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 * El nostre joc sera mes senzill , crearem un array de tipus lletra on hi haurà
 * una boleta , O (o mayuscula) i dues X.
 * Inicialment es ficara  tot a X 
 * i despres una posició  aleatoriament la fiquem a 0.
 * Llavors, ha de fer 10 canvi de posicions.
 * Un canvi de posicio, es intercanviar el valor de 
 * dues de les posicions del cubiletes.
Per exemple canvia el valor del 0 per la posició 2, HAN DE CANVIAR ELS DOS VALORS.
Com que no es visual, apart de fer el canvi ha de mostrar la frase "Intercanvio posicions 0 y 2"
S'ha de mostrar les 10 frases del canvi i despres demanar-te a on esta la pilota.
Si encertes has guanyat, sinò has perdut.
 * 
 * 
 */
public class TrilerosArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            char[] cubiletes = new char[3];
            int ganadas = 0;
            
            do{
            inicializarCubiletes(cubiletes);
            mostrarCubiletes(cubiletes);
            
            for (int i = 1; i <= 10; i++) 
            {
                System.out.print("Cambio: " + i + ": ");
                moverCubiletes(cubiletes);
                //mostrarCubiletes(cubiletes);
            }
            
            //mostrarCubiletes(cubiletes);
            int pos = pedirPosicionBolita();
//            System.out.println("pos" + pos );
//            System.out.println(cubiletes[pos]);
            ganadas = ganado(cubiletes, pos,ganadas);
            }while(ganadas<3):
    }

    /**
     * Poner todas las posiciones a X
     * Y poner una posición aleatoria a 0
     * @param cubiletes 
     */
    private static void inicializarCubiletes(char[] cubiletes) {
        for (int i = 0; i < cubiletes.length; i++) {
            cubiletes[i] = 'X';
        }
        //Array.setChar(cubiletes, 0, 'X');
        Random rd = new Random();
        int pos = rd.nextInt(3);
        cubiletes[pos] = 'O';
        
    }
    
    public static void mostrarCubiletes(char[] valores)
    {
        for (int i = 0; i <= (valores.length-1); i++) {
            System.out.print(valores[i]);  
            
            if (i != (valores.length-1))
            {/*muestro guion menos en la última posición*/
                System.out.print("-");  
            }   
        }
        System.out.println("");
    }

    /**
     * Intercambiar valores de 2 cubiletes de forma aleatoria
     * @param cubiletes array con todas las posiciones de los cubiletes
     */
    private static void moverCubiletes(char[] cubiletes) {
        Random rd = new Random();
        int pos1,pos2;
        pos1 = rd.nextInt(3);
        do{
         pos2 = rd.nextInt(3);
        }while(pos1==pos2);
        System.out.println("Cambio la posicion " + (pos1+1) 
                + " por la posicion " + (pos2+1));
        char aux = cubiletes[pos1]; //guardo el valor
        cubiletes[pos1] = cubiletes[pos2];
        cubiletes[pos2] = aux;
    }
    
    /**
     * Pedira al jugador en que posición esta la bola
     * @return posición bolita que sera entre 0 y 2
     */

    private static int pedirPosicionBolita() {
        Scanner sc = new Scanner(System.in);
          int valor;
          do{
          System.out.println("Pon el cubilete donde esta la bola");
          valor = sc.nextInt();
          }while(!(valor>=1 && valor<=3));
          //}while(valor<=0 || valor>3);
          return valor-1; //"transformo" legnguaje usuario a lenguaje aray
    }

    private static int ganado(char[] cubiletes, int pos, int ganadas) {
        if(cubiletes[pos] == 'O')
                {
                    System.out.println("ganaste");
                    return (ganadas+1);
                }
            else
                {
                    System.out.println("Perdiste");
                    return ganadas;
                }
    }
}
