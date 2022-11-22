/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Bitlles {
 /*****/
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Cuantes files tens?");
          int files =  sc.nextInt();

          int bitlles = contarBitlles(files);
          
          System.out.println(files + " tenen " + bitlles + " bitlles.");
      }

    private static int contarBitlles(int files) {
        int bitlles;
        if(files==1)
        {
            bitlles = 1;
            return bitlles;
        }
        else if(files>1)
        {
            bitlles = files;
            return bitlles+contarBitlles(files-1);
        }

        return -1;
    }
}
