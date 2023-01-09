/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidimensional;

/**
 * Crea un programa que cree una matriz de 10x10 
 * e introduzca los valores de las tablas de
 * multiplicar del 1 al 10 (cada tabla en una fila). 
 * Luego mostrará la matriz por pantalla.
 * @author mabardaji
 */
public class Ex2 {
    public static void main(String[] args) {
        
        final int FILAS=10;
        final int COLUMNAS=10;
        
        int [][] tabla= new int[FILAS][COLUMNAS];
        
        tablasMultiplicar(tabla);
//        for (int files = 0; files < tabla.length; files++) {
//            for (int colum = 0; colum < tabla[files].length; colum++) {
//                tabla[files][colum]= (files+1)*(colum+1);
//            }
//        }
        Utilitats.Utilitats.mostrarArray2D(tabla);
    }

    private static void tablasMultiplicar(int[][] tabla) {
        for (int files = 0; files < tabla.length; files++) {
            for (int colum = 0; colum < tabla[files].length; colum++) {
                tabla[files][colum]= (files+1)*(colum+1);
            }
        }
    }
 
}
