/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

/**
 *
 * @author mabardaji
 */
public class HipHurra {
 
    
    public static void main(String[] args) throws InterruptedException {
       int num=5;
       
       salut(num);
    }
    
    
    public static void salut(int n)
    {
        //caso base
        if(n==0)
        {
            System.out.println("Hurra!!! ");
        }
        else
        {
            System.out.print( " Hip ");
            salut(n-1);
        }
    }
}
