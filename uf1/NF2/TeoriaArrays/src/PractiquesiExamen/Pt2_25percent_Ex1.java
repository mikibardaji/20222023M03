/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PractiquesiExamen;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Pt2_25percent_Ex1 {
    public static void main(String[] args) {
        int[] tauler = new int [30];
        int pos_jugador=0, dau;
        inicialitzarTauler(tauler);
        definirCasellesMort(tauler);
        mostrarTauler(tauler, pos_jugador);
        boolean viu=true;
        do
        {
           
            dau = tiradaDau();
            
            pos_jugador = pos_jugador + dau;
            System.out.println("T'ha sortit un " + dau + " estas " + pos_jugador);
            mostrarTauler(tauler, pos_jugador);
            //viu = comprobarCasellaValida(tauler, pos_jugador);
        }while(pos_jugador<30 && comprobarCasellaValida(tauler, pos_jugador));
        
        if(pos_jugador>=30)
        {
            System.out.println("Has guanyat");
        }
        else
        {
            System.out.println("Has palmado");
        }
        
    }
    
    
    
    /**
     * n’inicialitza totes les posicions del tauler a 1
     * @param tauler de joc
     */
    public static void inicialitzarTauler(int[] tauler)
    {
        for (int i = 0; i < tauler.length; i++) {
            tauler[i] = 1;
        }
        
    }
    
    /**
     *  escollirà 4 caselles aleatòriament, marcant-les amb el valor zero. 
     * Ha de verificar que no se selecciona dos cops la mateixa casella i 
     * que finalment queden 4 caselles de mort 
     * @param tauler  de joc
     */
    public static void definirCasellesMort(int[] tauler)
    {
        int mort=0;
        Random rd = new Random();
        int casella;
        while(mort<1)
        {
            casella=rd.nextInt(30); //for
            if(tauler[casella]==1)
            {
                tauler[casella]=0;
                mort++;
            }
            
        }
     
    }
    
    /**
     * simula la tirada d’un dau del 1 al 6, no rebrà cap paràmetre d’entrada 
     * i retornarà el valor aleatori del dau.

     * @return valor del dau
     */
    public static int tiradaDau()
    {
        Random rd = new Random();
        int tirada = rd.nextInt(6)+1;
        return tirada;
    }
    
    /**
     * el tauler i un enter que indica la casella.
     * Retorna un valor booleà true si la casella no és mort 
     * (o sigui, si té el valor 1) i false si és mort (valor 0).

     * @param tauler tablero juego
     * @param casella posicion jugado
     * @return 
     */
    
    public static boolean comprobarCasellaValida(int[] tauler, int casella)
    {
        return (tauler[casella]==1);
    }
    
    /**
     * rep com a paràmetre el tauler de joc i la posició del jugador, mostra els valors de totes les caselles, separades per un guió i en la mateixa línia. 
     * La posició del jugador s’indicarà tancant la casella entre parèntesis.
     * @param tauler
     * @param posicio on es trba el jugador
     */
    public static void mostrarTauler(int[] tauler, int posicio)
    {
//        for (int i = 0; i < tauler.length; i++) {
//            if(i==posicio)
//            {
//                System.out.print("(");
//            }
//            System.out.print(tauler[i] + "-");
//            if(i==posicio)
//            {
//                System.out.print(")");
//            }
//        }
//        
//        for (int i = 0; i < tauler.length; i++) {
//            if(i==posicio)
//            {
//                System.out.print("(" + tauler[i] + ")-");
//            }
//            else
//            {
//                System.out.print(tauler[i] + "-");
//            }
//            
//        }

        for (int i = 0; i < tauler.length; i++) {
            if(i==posicio-1)
            {
                System.out.print("X-");
            }
            else
            {
                System.out.print(tauler[i] + "-");
            }
            
        }        
        System.out.println("");
        
        
    }
}
