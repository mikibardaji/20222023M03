/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursivitat;

import java.util.Scanner;

/**
 * Partiendo de una pareja, cuántas parejas de conejos obtendremos 
 * después de un número dado de meses sabiendo que cada pareja al mes 
 * tiene una nueva pareja de bebés, la cual no tendrá conejos hasta que sea adulta, 
 * lo que ocurre a los dos meses de nacer.
 * @author mabardaji
 */
public class ConillsFibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Dime en que mes quieres saber cuantos conejos tendras");
//        int mes = sc.nextInt();
//        
//        int conejos = ConejosFibonacci(mes);
//        
//        System.out.println("En el mes "+ mes + " tendras " + conejos + " conejos! ");
//Exercici 1
//        System.out.println("Dime el numero");
//        int num = sc.nextInt();
//        
//        int suma = SumaRecursiva(num);
//        System.out.println("La suma es " + suma);
        System.out.println("Voy a calcular la potencia de un numero");
        System.out.println("Dime la base");
        int base = sc.nextInt();
        System.out.println("Dime la potencia");
        int potencia = sc.nextInt();
        
        int calculo = PotenciaRecursiva(base,potencia);
        System.out.println("El resultado es " + calculo);
    }
    
    /**
     * Partiendo de una pareja, cuántas parejas de conejos obtendremos 
     * después de un número dado de meses sabiendo que cada pareja al mes 
     * tiene una nueva pareja de bebés, la cual no tendrá conejos hasta que sea adulta, 
     * lo que ocurre a los dos meses de nacer.
    * @author mabardaji
     * @param mes
     * @return 
     */
    public static int ConejosFibonacci(int mes)
    {
        int resultado;
        if (mes<=1)
                
        {
            return 1;
        }
        else if(mes>1)
        {
            resultado = ConejosFibonacci(mes-1) + ConejosFibonacci(mes-2);
            return resultado;
        }
        return -1; //numero no validop
    }
    
    
    /**
     * Programar un algoritme recursiu que calculi 
     * la suma dels n primers números. 
     * Exemple: Entrada: 6 -- Sortida: 21 (1+2+3+4+5+6)
     */
    
    public static int SumaRecursiva(int num)
    {
        int suma;
//        if (num==0)
//        {
//              return 0;
//        }
//        else if(num==1)
//        {
//            return 1;
//        }
        if(num<=1) //caso base
        {
            return num;
        }
        else if(num>1) //caso recursivo
        {
         // 2-  //2+sumaRecursiva(1);
         // 3-  //3+sumaRecursiva(2);
        //  4-  //4+sumaRecursiva(3);
//            suma=num+SumaRecursiva(num-1);
//            return suma;
          return num+SumaRecursiva(num-1);
        }
        return -1; //si el numero es negativo
    }

     /**
     * Programa que calculi un numero elevat a una potencia , 
     * tots dos valors demanats al usuari, de forma recursiva.
     */
    private static int PotenciaRecursiva(int base, int potencia) {
        int basepotencia;
        if(potencia==0)
        {
            basepotencia = 1;
            System.out.println("potencia" + potencia +"= " + basepotencia);
            return basepotencia;
        }
        else if(potencia>=1)
        {
            basepotencia = base*PotenciaRecursiva(base, potencia-1);
            System.out.println("potencia" + potencia +"= " + basepotencia);
            return basepotencia;
        }
        return -1;
    }
    
    /**
     * Programa que calculi la suma de tots els numeros parells, 
     * desde el numero que s'ha introduit fins a 2. 
     * Si s'ha introduît un numero senar, no ha de fer la suma i retornar -1 directament
     */
    public static int SumaPares(int num)
    {
       if(num==2) //caso base
       {
           return num; //que es lo que mismo que devolver 2
       }
       else if(num%2==1) //caso no admitido , especie base
       {
           return -1;
       }
       else
       {
           return num + SumaPares(num-2);
       }
    }
    
}
