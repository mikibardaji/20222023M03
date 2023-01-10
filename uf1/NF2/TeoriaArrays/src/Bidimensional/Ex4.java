/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos 
 * (llamados “Alumno1”, “Alumno2”, etc.) y 5 asignaturas. 
* Las notas se pondran de forma aleatoria.
* Y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 * @author mabardaji
 */
public class Ex4 {
    public static void main(String[] args) {
        final int ALUMNOS =4;
        final int NOTAS =5;
        int[][] notas_alumnos = new int[ALUMNOS][NOTAS];

         Random rd=new Random();
        
        for (int files = 0; files < ALUMNOS; files++) {
            for (int colum = 0; colum < NOTAS; colum++) {
                notas_alumnos[files][colum]=rd.nextInt(10)+1;
            }
        }
        
        Utilitats.Utilitats.mostrarArray2D(notas_alumnos);
        int minima, maxima;
        double media; //variable acumulativo
        for (int i = 0; i < ALUMNOS; i++) { //files
            
            minima=notas_alumnos[i][0];
            maxima=notas_alumnos[i][0];
            media=0;
            for (int j = 0; j < NOTAS; j++) 
                { //columna per obtenir alumne
                    if(minima>notas_alumnos[i][j])
                    {
                        minima = notas_alumnos[i][j];
                    }
                    if(maxima<notas_alumnos[i][j])
                    {
                        maxima = notas_alumnos[i][j];
                    }
                    media = media + notas_alumnos[i][j]; 
                }
            //aqui han acabat les notes del alummne i
            media = (double) media/NOTAS;  /* /notas_alumnos[i].length*/
            
            System.out.println("La nota minima de " +(i+1) + " es " + minima);
            System.out.println("La nota maxima de " +(i+1) + " es " + maxima);
            System.out.println("La media es " + media);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("De que alumno quieres saber la nota");
        int alum = sc.nextInt();
        
        mostrarDatosAlumno(notas_alumnos,alum-1);

        System.out.println("De que asignatura quieres saber la nota");
        int asignatura = sc.nextInt();
        
        mostrarDatosAsignatura(notas_alumnos,asignatura-1);
    }

    /**
     * Función que nos da las notas minimas y maximas de un alumno en concreto
     * @param notas_alumnos tablas de notas 
     * @param alum alumno escogido.
     */
    private static void mostrarDatosAlumno(int[][] notas_alumnos, int alum) {
         int minima, maxima;
        double media; //variable acumulativo
        int col;
        minima=notas_alumnos[alum][0];
        maxima=notas_alumnos[alum][0];
        media=0;
        for(col=0;col<notas_alumnos[alum].length;col++)
        {
             if(minima>notas_alumnos[alum][col])
                    {
                        minima = notas_alumnos[alum][col];
                    }
                    if(maxima<notas_alumnos[alum][col])
                    {
                        maxima = notas_alumnos[alum][col];
                    }
                    media = media + notas_alumnos[alum][col]; 
        }
        media = (double) media/notas_alumnos[alum].length;  /* /notas_alumnos[i].length*/
        System.out.println("La nota minima de " +(alum+1) + " es " + minima);
        System.out.println("La nota maxima de " +(alum+1) + " es " + maxima);
        System.out.println("La media es " + media);
    }
    
    
    private static void mostrarDatosAsignatura(int[][] notas_alumnos, int asignatura) {
        //asignatura es la columna X, de la matriz0
         int minima, maxima;
        double media; //variable acumulativo
        int filas;
        minima=notas_alumnos[0][asignatura];
        maxima=notas_alumnos[0][asignatura];
        media=0;
        for(filas=0;filas<notas_alumnos.length;filas++)
        {
             if(minima>notas_alumnos[filas][asignatura])
                    {
                        minima = notas_alumnos[filas][asignatura];
                    }
                    if(maxima<notas_alumnos[filas][asignatura])
                    {
                        maxima = notas_alumnos[filas][asignatura];
                    }
                    media = media + notas_alumnos[filas][asignatura]; 
        }
        media = (double) media/notas_alumnos.length;  /* /notas_alumnos[i].length*/
        System.out.println("La nota minima de " +(asignatura+1) + " es " + minima);
        System.out.println("La nota maxima de " +(asignatura+1) + " es " + maxima);
        System.out.println("La media es " + media);
    }
}
