/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidimensional;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import Utilitats.*;

/**
 *
 * @author mabardaji
 */
public class TeoriaBidimensional {
    
    public static void main(String[] args) {
        final int FILES=3;
        final int COLUM=4;
        int[][] mapa = new int[FILES][COLUM];
        //PRIMERA FILA = 0
        mapa[0][0] = 4;
        mapa[0][1] = 14;
        mapa[0][2] = 24;
        mapa[0][3] = 34;
        //SEGONA FILA
        mapa[1][0] = 5;
        mapa[1][1] = 15;
        mapa[1][2] = 25;
        mapa[1][3] = 35;
        //TERCERA FILA
        mapa[2][0] = 6;
        mapa[2][1] = 16;
        mapa[2][2] = 26;
        mapa[2][3] = 36;
        
        System.out.println(Arrays.deepToString(mapa));
        
        for (int fila = 0; fila < mapa.length; fila++) {
            //mapa.length em dona les files
            for (int col = 0; col < mapa[fila].length; col++) 
            {
                //mapa[0].length dona les columnes existents
            System.out.print(mapa[fila][col] + "-");
            }
            System.out.println("");
        }
        
        //recorreu tot el array y el paso a valor 4
        System.out.println("poniendo todo a valores aleatories entre 1 y 100");
        Random rd=new Random();
        
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                mapa[fila][col] = rd.nextInt(100)+1;
            }   
        }
        
        
        System.out.println("*******aleatorios***********");
        //mostrar array
        for (int fila = 0; fila < mapa.length; fila++) {
            //mapa.length em dona les files
            for (int col = 0; col < mapa[fila].length; col++) 
            {
                //mapa[0].length dona les columnes existents
            System.out.print(mapa[fila][col] + "-");
            }
            System.out.println("");
        }
        
        //pedir valores al usuario
        Scanner sc = new Scanner(System.in);
        
//        for (int fila = 0; fila < mapa.length; fila++) {
//            for (int col = 0; col < mapa[fila].length; col++) {
//                System.out.println("Pon valor para " + fila + "-" + col);
//                mapa[fila][col] = sc.nextInt();
//            }   
//        }
        //informant primer tota la columna 0
         for (int col = 0; col < mapa[0].length; col++)
         {   
            for (int fila = 0; fila <mapa.length; fila++){
                System.out.println("Pon valor para " + fila + "-" + col);
                mapa[fila][col] = sc.nextInt();
            }   
        }
        
        
        
        //mostrar array
       // Utilitats.Utilitats.
       Utilitats.mostrarArray2D(mapa);
        
        //mostrarValorCoordenada(mapa);
        
    }

    private static void mostrarValorCoordenada(int[][] mapa) {
        int x,y; //x -> fila, y -> columna
        Scanner sc=new Scanner(System.in);
        System.out.print("Fica la fila que vols veure(1-"+mapa.length+"): ");
        x = sc.nextInt();
        System.out.print("Fica columna(1-" +mapa[0].length+") : ");
        y = sc.nextInt();
        x--;
        y--;
        System.out.println("El valor de la coordenada introduïda es: "+ mapa[x][y]);
    }
}
