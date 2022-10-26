package solucionsexamen;


import java.util.Scanner;

/**
 * Mostra preu esmorzar en funció del tipus de dia i tipus d'esmorzar
 * @author ProvenSoft
 */
public class Exercici1 {

    public static void main(String[] args) {
        //Tarifes de preus
        final double PREU_L_1 = 2.00;
        final double PREU_L_2 = 2.50;
        final double PREU_S_1 = 2.20;
        final double PREU_S_2 = 2.70;
        final double PREU_F_1 = 2.30;
        final double PREU_F_2 = 2.80;
        //variables del programa
        double preuEsmorzar = 0.0; //el preu de l'esmorzar
        char tipusDia = ' '; //tipus de dia
        int tipusEsmorzar = 1; //tipus d'esmorzar
        boolean opcioIncorrecta = false;  //senyal per marcar si alguna opció és incorrecta
        //
        Scanner lector = new Scanner(System.in);

            //llegir tipus de dia
            System.out.print("Entra el tipus de dia (L/S/F): ");
            tipusDia = lector.next().charAt(0);
            //llegir tipus d'esmorzar
            System.out.print("Entra el tipus d'esmorzar (1/2): ");
            tipusEsmorzar = lector.nextInt();
            //determinar el preu de l'esmorzar
            switch (tipusDia) {
                case 'L': //dia laborable
                    if (tipusEsmorzar == 1) {
                        preuEsmorzar = PREU_L_1;
                    } 
                    else if (tipusEsmorzar == 2) {
                            preuEsmorzar = PREU_L_2;
                        } 
                    else {
                            opcioIncorrecta = true;
                        }
                    
                    break;
                case 'S':  //dissabte
                    if (tipusEsmorzar == 1) {
                        preuEsmorzar = PREU_S_1;
                    } else {
                        if (tipusEsmorzar == 2) {
                            preuEsmorzar = PREU_S_2;
                        } else {
                            opcioIncorrecta = true;
                        }
                    }
                    break;
                case 'F':  //festiu
                    if (tipusEsmorzar == 1) {
                        preuEsmorzar = PREU_F_1;
                    } else {
                        if (tipusEsmorzar == 2) {
                            preuEsmorzar = PREU_F_2;
                        } else {
                            opcioIncorrecta = true;
                        }
                    }
                    break;
                default:
                    opcioIncorrecta = true;
                    break;
            }
         
        //mostrar el preu de l'esmorzar
        if (opcioIncorrecta==true) 
            {
                System.out.println("El preu de l'esmorzar " + tipusEsmorzar + " en dia " + tipusDia + " es " + preuEsmorzar);
            } 
        else {
            System.out.println("Almenys alguna de les opcions és incorrecta");
        }
        
    }

}
