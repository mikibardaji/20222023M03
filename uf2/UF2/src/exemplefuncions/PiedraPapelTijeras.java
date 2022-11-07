/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplefuncions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PiedraPapelTijeras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int player_choose, computer_choose,winner;
        int point_player=0, point_computer=0;
        int jugadas=0;
        do{
        player_choose = jugada();
        System.out.print("Jugador ");
        imp_jugada(player_choose);
        computer_choose = jugada_ordenador();
        System.out.print("Ordenador ");
        imp_jugada(computer_choose);
        winner = ganador(player_choose, computer_choose);
        imp_ganador(winner);
        
        if (winner==1)
        {
            point_player++;
        }
        else if (winner==2)
        {
            point_computer++;
        }
        jugadas++;
        marcador(point_player, point_computer);
        }while(point_player<3 && point_computer<3 && jugadas<6);
        
        System.out.println("**** Resultado final de partida **** ");
        marcador(point_player, point_computer);
    }
    
    
     public static int jugada(){
        int player;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("El jugador escoge (0 piedra, 1 papel, 2 tijera)");
            player = sc.nextInt();
            
        }while (!(player>=0 && player<=2));
        return player;
    }
     
    public static int jugada_ordenador (){
        Random r = new Random();
        int j = r.nextInt(3);
       // System.out.println("El odenador escoje "+j);
        return j;
    }
    
    
     // Funcion que muestra la opcion que ha escogido el jugador
    public static void imp_jugada(int player){
        if(player==0)
        {
            System.out.println("ha escogido Piedra");
        }
        else if (player==1){
            System.out.println("ha escogido Papel");
        }
        else if (player==2){
            System.out.println("ha escogido Tijera");
        }
    }
    
    
        public static void imp_ganador(int ganador){
        if(ganador == 1){
            System.out.println("Ganador el usuario");
        }
        if(ganador == 2){
            System.out.println("Ganador el ordenador");
        }
        if (ganador == 0) {
            System.out.println("Empate");
        }
        
        
        
    }
        
        
    public static void marcador(int point_player1, int point_player2) {
        System.out.println("----------------------------------------");
        System.out.println("**********PUNTUACION TOTAL**************");
        System.out.println("Puntuacion J1 " + point_player1 + " puntos");
        System.out.println("Puntuacion J2 " + point_player2 + " puntos");
        System.out.println("----------------------------------------");
        
    }
    
        public static int ganador(int choose_player1, int choose_player2){
        int resultado = 0 ;
        if(choose_player1 == choose_player2){
            resultado = 0;
        }
        else if(choose_player1 == 0 && choose_player2 == 2){
            resultado = 1;
        }
        else if(choose_player1 == 0 && choose_player2 == 1){
            resultado = 2;
        }
        else if(choose_player1 == 1 && choose_player2 == 2){
            resultado = 2;
        }
        else if(choose_player1 == 1 && choose_player2 == 0){
            resultado = 1;
        }
        else if(choose_player1 == 2 && choose_player2 == 1){
            resultado = 1;
        }
        else if(choose_player1 == 2 && choose_player2 == 0){
            resultado = 2;
        }
         return resultado;   
    }
         
}
