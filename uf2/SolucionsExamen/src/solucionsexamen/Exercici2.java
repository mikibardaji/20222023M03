package solucionsexamen;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Convertir temperatures de Celsius a Fahrenheit en un interval de temperatures
 * entrada per l'usuari
 * @author ProvenSoft
 */
public class Exercici2 {

    public static void main(String[] args) {
        //dades del programa
        int tMinCelsius=0, tMaxCelsius=0;
        double tFahrenheit;
        boolean dadesValides = false;
        Scanner lector = new Scanner(System.in);
        
            //entrada de dades: interval de temperatures a convertir
            //entrar temperatura mínima en C
            System.out.print("Entra la temperatura mínima en Celsius: ");
            tMinCelsius = lector.nextInt();
            //entrar temperatura màxima en C
            System.out.print("Entra la temperatura màxima en Celsius: ");
            tMaxCelsius = lector.nextInt();
            //validar dades (amb condicionals if-else)
             if (tMinCelsius < tMaxCelsius) {
                 dadesValides = true;
             } else {
                 dadesValides = false;
            }
            //validar dades (amb condicional ternari)
            //dadesValides = (tMinCelsius < tMaxCelsius);
        
        //bloc de sortida de dades del programa
        if (dadesValides) {
            //mostrar taula de conversió de temperatures
            //mostrar encapçalament de taula
            //System.out.format("Graus celsius\tGraus Fahrenheit\n");
            //usant bucle while com demana l'enunciat
            int tempC = tMinCelsius; //inicialitzar variable del bucle
            while (tempC <= tMaxCelsius) {
                tFahrenheit = (double) (9.0/5.0)*tempC + 32.0;
                System.out.println(tempC + "ºC - " + tFahrenheit + "ºF ");
                tempC = tempC +1; //actualitzar variable del bucle
            }
        } else {
            System.out.println("Alguna de les dades no és vàlida");
        }

    }
    
}
