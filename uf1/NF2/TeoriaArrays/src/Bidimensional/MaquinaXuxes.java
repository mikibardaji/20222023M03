/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidimensional;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class MaquinaXuxes {
    public static void main(String[] args) {
        final int FILAS=4;
        final int COLUM=4;
        int opcio;
        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
             {"Lacasitos", "Crunch", "Milkybar", "KitKat"} };
        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
            };
        int[][] existencias = new int[FILAS][COLUM];
        inicializarExistencias(existencias);
        
        
        do
        {
                opcio= menu();
                switch(opcio){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("opcion incorrecta");
                        break;
                }
        }while(opcio!=0);
        
    }
    
    private static int menu() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("1.- Demanar llaminadura");
        System.out.println("2.- Mostra llaminadures-columna elegida");
        System.out.println("3.- Omplir llaminadures");
        System.out.println("4.- Mostrar existencies maquina");
        System.out.println("0.- Apagar màquina");
        
        
        do{
          System.out.print("Escull opcio(0-4): ");
          opcion=sc.nextInt();
        }while(!(opcion>=0 && opcion <=4));
        //aqui falta demanar la opci? i uqe si no es correcta torni a demanar-la
        
        //retornar opci? escollida
        return opcion;
    }

    /**
     * Pongo todas las existencias de chuches a 5
     * @param existencias Tabla de enteros con la existencia
     */
    private static void inicializarExistencias(int[][] existencias) {
        for (int fila = 0; fila < existencias.length; fila++) {
            for (int col = 0; col < existencias[0].length; col++) {
                existencias[fila][col]=5;
            }
        }
    }
}
