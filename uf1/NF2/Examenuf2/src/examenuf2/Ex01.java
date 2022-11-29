package examenuf2;



import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int identificador = llegirNumero();
        System.out.print("Entra el teu any de naixement: ");
        int anyNaixement = lector.nextInt();

        System.out.print("Coneixes la teva contrasenya(S/N)? ");
        char coneixPsw = lector.next().charAt(0);

        if (coneixPsw=='N' || coneixPsw == 'n') 
            {
                int contrasenya = generarContrasenya(identificador, anyNaixement);
                System.out.println("La teva contrasenya és " + contrasenya);
            } 
        else if (coneixPsw=='S' || coneixPsw=='s') 
            {
                System.out.print("Entra la teva contrasenya: ");
                int contrasenya = lector.nextInt();
                if (verificarCredencials(identificador, anyNaixement, contrasenya)==true) {
                    iniciaAplicacio(identificador, anyNaixement);
                } else {
                    System.out.println("Contrasenya incorrecta");
                }
            }
        System.out.println("Fins a una altra!");
    }

    /**
     * llegeix l'identificador de l'usuari fins que és vàlid
     *
     * @return l'identificador de l'usuari
     */
    public static int llegirNumero() {
        int id = 0;
        boolean idValid = false;
        Scanner lector = new Scanner(System.in);
        do {
                System.out.print("Entra l'identificador: ");
                id = lector.nextInt();
                idValid = ((id > 1000) && (id < 10000));
        } while (!idValid);
        return id;
    }

    /**
     * genera una contrasenya per a l'usuari, donats l'identificador i l'any de
     * naixement
     *
     * @param id l'identificador de l'usuari
     * @param any l'any de naixement de l'usuari
     * @return la contrasenya de l'usuari
     */
    public static int generarContrasenya(int id, int any) {
        int mult = id * any;
        int password = (mult) % 10000;
        return password;
    }

    /**
     * verifica les credencials d'accés de l'usuari
     *
     * @param id l'identificador de l'usuari
     * @param any l'any de naixement de l'usuari
     * @param psw la contrasenya a verificar
     * @return true si les credencials són vàlides, false si no ho són
     */
    public static boolean verificarCredencials(int id, int any, int psw) {
        int password = generarContrasenya(id, any);
        return (psw == password);
    }

    /**
     * mostra el perfil de l'usuari associat a l'identificador
     *
     * @param id l'identificador de l'usuari
     * @param any l'any de naixement de l'usuari
     */
    public static void mostrarPerfilUsuari(int id, int any) {
        final int anyActual = 2022;
        int edat = anyActual - any;
        int psw = generarContrasenya(id, any);
        System.out.println("*****************");
        System.out.println(id + " - " +  edat + " - " +  psw);
        System.out.println("*****************");
    }

    /**
     * mostra el menú de l'aplicació
     */
    public static int Menu() {
        Scanner lector = new Scanner(System.in);
        System.out.println("*******Menu********");
        System.out.println("0. Sortir");
        System.out.println("1. Mostrar el perfil de l'usuari");
        System.out.print("Entra una opció: ");
        int opcioSel = lector.nextInt();
        return opcioSel;
    }
    
    public static void Menu2()
    {
        System.out.println("*******Menu********");
        System.out.println("0. Sortir");
        System.out.println("1. Mostrar el perfil de l'usuari");
        System.out.print("Entra una opció: "); 
    }

    /**
     * inicia el bucle de control de l'aplicació, amb el menú i la interacció amb l'usuari
     * @param identificador l'identificador de l'usuari
     * @param anyNaixement l'any de naixement de l'usuari
     */
    public static void iniciaAplicacio(int identificador, int anyNaixement) {

        int opcioSel = -1;
        int maxOpcions = 2;
        do {
                opcioSel = Menu();

                if ((opcioSel >= 0) && (opcioSel < maxOpcions)) {
                    switch (opcioSel) {
                        case 0: //sortir
                            break;
                        case 1:
                            mostrarPerfilUsuari(identificador, anyNaixement);
                            break;
                        default:
                            System.out.println("Opció no vàlida");
                            break;
                    }
        }
                
        }while (opcioSel != 0);
    }
}
