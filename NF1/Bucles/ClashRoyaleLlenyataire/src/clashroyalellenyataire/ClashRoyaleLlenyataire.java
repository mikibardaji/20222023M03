/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalellenyataire;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ClashRoyaleLlenyataire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        final int LEVEL_LUMBBERJACK_MAX=11;
        final int LEVEL_LUMBBERJACK_MIN=9;
        
        final int LEVEL_TORRE_MAX= 3;
        final int LEVEL_TORRE_MIN= 1;
        int nivellLenyataire= 0;
        int nivellTorre= 0;
        do
        {
        System.out.println("quin nivell te el llenyataire (" + LEVEL_LUMBBERJACK_MIN + "-" 
                + LEVEL_LUMBBERJACK_MAX + ")?");
        nivellLenyataire = sc.nextInt();
        
        }while (nivellLenyataire<LEVEL_LUMBBERJACK_MIN ||nivellLenyataire>LEVEL_LUMBBERJACK_MAX);
        
        do
        {
        System.out.println("Quin nivell te la torre?");
        nivellTorre = sc.nextInt();
        } while (nivellTorre<LEVEL_TORRE_MIN ||nivellTorre>LEVEL_TORRE_MAX);
        
        int danyoLenyataire = 0;
        int danyoTorre = 0;
        int puntosVidaLenyataire = 0;
        int puntosVidaTorre = 0;
        
//        if (nivellLenyataire==9)
//        {
//              danyoLenyataire = 200;
//              puntosVidaLenyataire = 1060;
//        }
//        else if (nivellLenyataire==10)
//        {
//               danyoLenyataire = 220;
//               puntosVidaLenyataire = 1166;
//        }
            
        switch (nivellLenyataire) {
            case 9:
                danyoLenyataire = 200;
                puntosVidaLenyataire = 1060;
                break;
            case 10:
                danyoLenyataire = 220;
                puntosVidaLenyataire = 1166;
                break;
            case 11:
                danyoLenyataire = 242;
                puntosVidaLenyataire = 1282;
                break;
            
            default:
                danyoLenyataire = 1;
                System.out.println("Nivel incorrecto");
        }
        
        switch (nivellTorre) {
            case 1:
                puntosVidaTorre = 1400;
                danyoTorre = 50;
                break;
            case 2:
                puntosVidaTorre = 1512;
                danyoTorre = 54;
                break;
            case 3:
                puntosVidaTorre = 1624;
                danyoTorre = 58;
                break;
            
            default:
                puntosVidaTorre = 1;
                System.out.println("Nivel incorrecto");
        }
        
        int contadorGolpes = 0;
        //int danyoTorreDoble = danyoTorre*2;
      //  while(!(puntosVidaTorre <= 0 || puntosVidaLenyataire <= 0)) {
            while((puntosVidaTorre > 0 && puntosVidaLenyataire > 0)) {
            puntosVidaTorre = puntosVidaTorre - danyoLenyataire;
            puntosVidaLenyataire = puntosVidaLenyataire - (danyoTorre*2);
            contadorGolpes ++;
            Thread.sleep(500);
            System.out.println("Lenyador ataca con fuerza de valor " + danyoLenyataire + " La torre li queda de vida " + puntosVidaTorre);
            System.out.println("Torre ataca con fuerza de valor " + danyoTorre + " El llenyataire li queda de vida " + puntosVidaLenyataire);

        }
            
        if (puntosVidaLenyataire<=0 && puntosVidaTorre<=0) {
            System.out.println("Los dos se han matado");
        }
        if (puntosVidaTorre <=0){
        System.out.println("Lenyador ha atacat " + contadorGolpes + " vegades " + puntosVidaTorre);
        }
        else if (puntosVidaLenyataire<=0){
            System.out.println("Torre ha atacat "+ contadorGolpes + " vegades "+ puntosVidaLenyataire);
        }        
    
    }
    
}
