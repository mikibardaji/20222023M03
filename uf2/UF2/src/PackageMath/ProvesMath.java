/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageMath;

/**
 *
 * @author mabardaji
 */
public class ProvesMath {
    
    
    public static void main(String[] args) {
        int n1=15;
        int n2= 7;
        
        int maxim = Math.max(n1, n2);
        System.out.println("maxim es " + maxim);
        double decimales = 345.178;
        System.out.println("decimales " + decimales);
        long parteEntera = Math.round(decimales);
        System.out.println(parteEntera);
        int numeroAleatorio =(int) (Math.random() * 10);
        System.out.println("aleatorio " + numeroAleatorio);
        int negativo = Math.negateExact(15);
        System.out.println("en negativo es " + negativo);
        double exponent = Math.pow(5,3);
        System.out.println("5 elevado a 3 es " + exponent);
        
    }
}
