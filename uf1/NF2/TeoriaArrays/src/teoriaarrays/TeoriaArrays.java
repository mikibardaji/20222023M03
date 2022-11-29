/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaarrays;

import Utilitats.Utilitats;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TeoriaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definició arrays
        int[] notes;
        int num_notas=4; 
        notes = new int[num_notas];
        notes[0]=3;
        notes[1]=4;
        notes[2]=7;
        notes[3]=1;
        System.out.println("Array creat " + notes);
        System.out.println("Mostrar array notes");
        Utilitats.mostrarArray(notes);
        
        int suma;
        double media;
        
        suma = calcularSumaNotas(notes);
       
        media = (double) suma/notes.length;
        System.out.println("La nota media es " + media);
        
        //inicialitzarem array a partir de la informació usuari
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon tus notas ");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("introdueix la nota " + (i+1));
            notes[i] = sc.nextInt(); 
        }
        
        suma = calcularSumaNotas(notes);
       
        media = (double) suma/notes.length;
        System.out.println("Tus notas media es " + media);
        
        
        int[] copia_notes = new int[num_notas];
        
        //copia els valors, no per memoria
        for (int i = 0; i < notes.length; i++) {
            copia_notes[i] = notes[i];
        }
        System.out.println("Array copia ");
        Utilitats.mostrarArray(copia_notes);
        
        System.arraycopy(notes, 0, copia_notes, 0, notes.length);
        
        
//        int[] notes2;
//         notes2 = new int[num_notas];
//        notes2[0]=13;
//        notes2[1]=14;
//        notes2[2]=17;
//        notes2[5]=11;
//        System.out.println("Mostrar array notes2");
//         Utilitats.mostrarArray(notes2);
    }

    private static int calcularSumaNotas(int[] notes) {
        int suma = 0;
         for (int i = 0; i < notes.length; i++) {
            //System.out.println("posicion " + i + " acumulo el valor " + notes[i]);
            suma = suma + notes[i]; //variable acumulativa
            //System.out.println("Acumulado por ahora " + suma);
        }
         return suma;
    }
    
}
