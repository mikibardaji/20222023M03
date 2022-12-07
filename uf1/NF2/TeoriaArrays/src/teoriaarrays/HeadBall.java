/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Plenar el array amb monedes una funció apart (aleatori de 1 al 20).
    Aleatori de 0 a 3 per escollir la posició on ficareu -1, i ficar -1 en aquella posició.
    Mostrar Array(es una trampa pero aixi veurem on esta la targeta)
    Demanar posició escollida al usuari (ha de validar que estigui entre 1 i 4)
    Obtenir premi a partir de la posició.
    Acumular premi i tornar al pas 1.
 * @author mabardaji
 */
public class HeadBall {
    
    public static void main(String[] args) {
        int[] tarjetas = new int[4];
        int premio, monedas=0;
        int posicion_escollida;
        boolean respuesta=true;
        do{
            llenarArrayMonedasTarjeta(tarjetas);
           // Utilitats.mostrarArray(tarjetas);
            posicion_escollida = pedirPosicion(tarjetas.length);
            premio = devolverPremio(tarjetas, posicion_escollida);
            //si premio es -1 he perdido , sino acumulo
            if(premio!=-1)
            {
                monedas=monedas+premio;
                System.out.println("Llevas ganado " + monedas);
                respuesta = pedirContinuarOPlantar();
            }
            else
            {
                monedas=0;
            }
        }while(premio!=-1 && (respuesta==true));
        //}while(premio!=-1 && respuesta);
        System.out.println("Al final has ganado... " + monedas);
    }

    /**
     *  Plenar el array amb monedes una funció apart (aleatori de 1 al 20).
     * @param tarjetas 
     */
    private static void llenarArrayMonedasTarjeta(int[] tarjetas) {
        Random rd = new Random();
        //int monedas = rd.nextInt(1,20); Dentro bucle
        for (int i = 0; i < tarjetas.length; i++) {
            //tarjetas[i]= monedas; NO , incorrecto porque monedas siempre tiene el mismo valor
            tarjetas[i] = rd.nextInt(1,21);
        }
        
        ponerTarjetaRoja(tarjetas);
    }

    /**
     * Aleatori de 0 a 3 per escollir la posició on ficareu -1, i ficar -1 en aquella posició.
     * @param tarjetas todas las opsicon
     */
    private static void ponerTarjetaRoja(int[] tarjetas) {
        Random rd = new Random();
        int posicion = rd.nextInt(0, 4);
        tarjetas[posicion]=-1;
        
        //tarjetas[rd.nextInt(0, 4)]=-1;
    }

    private static int pedirPosicion(int tope) {
        Scanner sc = new Scanner(System.in);
        int pos;
            do
            {
            System.out.println("Pon que tarjeta quieres elegir 1-" + tope);
            pos=sc.nextInt();
            }while(pos<1 || pos>tope);
            return (pos-1); //porque array empieza por 0
    }

    private static int devolverPremio(int[] tarjetas, int posicion_escollida) {
        if(tarjetas[posicion_escollida]!=-1)
        {
            System.out.println("Has ganado " + tarjetas[posicion_escollida] +  " monedas");
        }
        else
        {
            System.out.println("Tarjeta roja perdiste");
        }
        
        return tarjetas[posicion_escollida];
        
    }

    /**
     * Va a pedir si quiere continuar si pone si, devolvera true, en cualquier otra respuesta 
     * devolverá false.
     * @return 
     */
    private static boolean pedirContinuarOPlantar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres continuar(Si/No)");
        String frase = sc.next();
        if (frase.equalsIgnoreCase("Si"))
            return true;
        else
            return false;
    }
    
}
