/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidimensional;

/**
 * Crea un programa que cree una matriz de tamaño 5x5 
 * que almacene los números del 1 al 25 y luego muestre 
 * la matriz por pantalla.
 * @author mabardaji
 */
public class Ex1 {
    public static void main(String[] args) {
        final int FILES = 5;
        final int COLUM = 5;
        int inici = 1;
        
        int tauler [][] = new int [FILES][COLUM];
        
        for (int files = 0; files < tauler.length; files++) {
            for (int colum = 0; colum < tauler[files].length; colum++) {
                tauler[files][colum]= inici;
                //if(inici<20) {++}
                inici++;
            }
        }
    }
 
}
