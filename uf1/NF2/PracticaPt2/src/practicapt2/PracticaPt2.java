/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapt2;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class PracticaPt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tablero = new int[30];
        
        int posicion=0, dado;
        inicialitzatTauler(tablero);
        casillaMuerte(tablero);
        do{
        dado = tiradaDado();
        posicion = posicion + dado;
        mostrar_tablero(tablero,posicion);
        }while(validarCasilla(tablero,posicion));
        
    }

    private static void inicialitzatTauler(int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = 1;
        }
    }
    
    
    private static void casillaMuerte(int[] tablero) {
        int muertes=0, casilla;
        Random rd = new Random();
                
                while(muertes<4)
                {
                    casilla = rd.nextInt(30);
                    if (tablero[casilla]==1)
                    {
                        tablero[casilla]=0;
                        muertes++;
                    }
                }
    }

    private static int tiradaDado() {
        Random rd = new Random();
        int casilla = rd.nextInt(6)+1;
        return casilla;
    }

    private static void mostrar_tablero(int[] tablero, int posicion) {
        for (int i = 0; i <  tablero.length; i++) {
            if (i==posicion)
            {
                System.out.print("(");
            }
            System.out.print(tablero[i] + "- ");
            if (i==posicion)
            {
                System.out.print(")");
            }
        }
    }
    
}
