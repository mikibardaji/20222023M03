/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchexample;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SwitchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("******Bienvenido FIFA 2022***");
//        System.out.println("1.- Jugar Partido Rapido");
//        System.out.println("2.- Multijugador");
//        System.out.println("3.- Carrera");
//        System.out.println("4.- Ultimate");
//        System.out.println("0 - Exit");
//        System.out.println("***************************");
//        System.out.print("Escoge opcion: ");
//        int opcion = sc.nextInt();
//        
//        
//        switch (opcion) {
//            case 1:
//                System.out.println("Vamos a jugar un partido rapido");
//                break;
//            case 2:
//                System.out.println("Opcion multijugador");
//                break;
//            case 3:
//                System.out.println("Opcion Carrera");
//                break;
//            case 4:
//                System.out.println("Opcion Ultimate");
//                break;
//            case 0:
//                System.out.println("Salir");
//                break;
//            default:
//                System.out.println("Opcion no valida");
//        }
        char opcion ;
        do{
            System.out.println("******Bienvenido FIFA 2022***");
            System.out.println("a.- Jugar Partido Rapido");
            System.out.println("b.- Multijugador");
            System.out.println("c.- Carrera");
            System.out.println("d.- Ultimate");
            System.out.println("z - Exit");
            System.out.println("***************************");
            System.out.print("Escoge opcion: ");
            opcion = sc.nextLine().charAt(0); //opción caracter


            switch (opcion) {
                case 'a':
                case 'A':
                    System.out.println("Vamos a jugar un partido rapido");
                    break;
                case 'b':
                    System.out.println("Opcion multijugador");
                    break;
                case 'c':
                    System.out.println("Opcion Carrera");
                    break;
                case 'd':
                    System.out.println("Opcion Ultimate");
                    break;
                case 'z':
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion!='z');
        //} while(!(opcion=='z'));
        
//        if (opcion == 'a')
//        {
//            
//        }
//        else if (opcion=='b')
//        {
//            
//        }
        
        
        
        
        
    }
    
}
