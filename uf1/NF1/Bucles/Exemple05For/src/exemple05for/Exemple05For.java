/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple05for;

/**
 *
 * @author mabardaji
 */
public class Exemple05For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // while, do while for
        int i;
       //for(valor_inicial;condicion_continue;incrementovariale 
        System.out.println("bucle en el for");
        for (i = 0; i < 6; i++) 
            {
                System.out.print(">" + i);
                //aumento variable, pero ya lo hace el i++ del for
            } //fin del for
        
        System.out.println("");
        System.out.println("bucle en un while");
        i=7;
        while(i < 6)
            {
                 System.out.print("*" + i);
                 i++; //i = i+1;     
            }
        
        System.out.println("");
        System.out.println("bucle en el do  while");
        i=7;
        do
            {
               System.out.print("-" + i);
                 i++; //i = i+1;   
            }while(i<6);
        
        
        
        
        }
        
       
    
}
