package examenuf2;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calcula el nombre de bombetes totals per il·luminar un arbre de Nadal
 * @author Jose
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

            System.out.print("Entra el número de files de l'arbre: ");
            int numFiles = lector.nextInt();
            if (numFiles > 0) {
                int numBombetesTotals = calculaBombetes2(numFiles);
                System.out.format("Per a un arbre de %d files calen %d bombetes en total\n",
                        numFiles, numBombetesTotals);
            } else {
                System.out.println("El número de files ha de ser positiu");
        }
    }
    
    /**
     * calcula recursivament el nombre de bombetes d'un arbre de Nadal
     * @param files el nombre de files de l'arbre
     * @return el nombre total de bombetes
     */
    public static int calculaBombetes(int files) {
        int bombetesTotals;

        if (files==1) {
            bombetesTotals = 1;
        } else {
            bombetesTotals = ((2*files)-1) + calculaBombetes(files-1);
        }
        return bombetesTotals;
    }
    
    
    
    public static int calculaBombetes2(int files) {
        int bombetesTotals = calculaBombetasFila(files-1)+2;

        if (files==1) {
            bombetesTotals = 1;
        } else {
            bombetesTotals = bombetesTotals + calculaBombetes(files-1);
        }
        return bombetesTotals;
    }

    private static int calculaBombetasFila(int fila) {
        if (fila==1)
            return 1;
        else
            return 2+calculaBombetasFila(fila-1);
    }

    
}