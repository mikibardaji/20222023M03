/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplefuncions;

/**
 *
 * @author mabardaji
 */
public class Exemplefuncions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idioma=1;
        int julia=2;
         int calculo=0;
       // char helloGoodbye = 'A';
        //System.out.println("idioma en main antes de llamar funcion " + idioma );
        //imprimeHelloWorldIdiomas(idioma);
        //System.out.println("idioma en main despues de llamar funcion " + idioma );
        //System.out.println(idioma);      
        System.out.println("antes de llamar al doble" + calculo);
        calculo=doble(julia);
        System.out.println("despues de llmar a doble" + calculo);
        
        calculo = doble(idioma);
        System.out.println("despues de llmar calculo a doble" + calculo);
        int variabledoble = doble(idioma);
        System.out.println("despues de llmar  variabledoble a doble" + variabledoble);
        
    }
    
    
    public static int doble(int a) {
        int resultado = a * 2;
        return resultado; //public static int, quiere decir que la variable return debe de ser int
    }

    
    
    
    
    public static void imprimeHelloWorldIdiomas(int idioma)
    {
        System.out.println("idioma que me ha llegado" + idioma);
        switch (idioma) {
            case 1:
                    System.out.println("Hello World");
                    System.out.println("goodbye");
                    break;
            case 2:
                    System.out.println("Hola Mon!");
                    System.out.println("Adeu");
                   break;
            default:
                    System.out.println("Hola Mundo!");
                    System.out.println("Adios");
                  break;
        }
        idioma = 7;
        System.out.println("idioma en HelloWorld Final" + idioma);
        
    }
    
    public static void imprimeHelloWorldIdiomasAdios(int idioma, char helloGoodbye)
    {
        System.out.println("idioma o el valor de x que me ha llegado" + idioma);
        switch (idioma) {
            case 1:
                if (helloGoodbye=='H')
                {
                    System.out.println("Hello World");
                }
                else if (helloGoodbye=='A')
                {
                    System.out.println("goodbye");
                }   break;
            case 2:
                if (helloGoodbye=='H')
                {
                    System.out.println("Hola Mon!");
                }
                else if (helloGoodbye=='A')
                {
                    System.out.println("Adeu");
                }   break;
            default:
                if (helloGoodbye=='H')
                {
                    System.out.println("Hola Mundo!");
                }
                else if (helloGoodbye=='A')
                {
                    System.out.println("Adios");
                }   break;
        }
        
    }
    
    
    
    
}
