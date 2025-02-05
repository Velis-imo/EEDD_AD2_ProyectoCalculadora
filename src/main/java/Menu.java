
/**
 *
 * Implementación de un menú de opciones para una calculadora básica.
 * Permite realizar operaciones matemáticas fundamentales como suma, resta,
 * multiplicación, división y módulo.
 *
 * @autor Andrea
 * @author Velislav Krassenov
 * @autor David
 * @autor Miguel
 * @autor Michael
 * @version 1.0
 * */

import java.util.Scanner;


public class Menu{

    private static Scanner leer = new Scanner(System.in);

    /**
     * Metodo principal que ejecuta el menú de opciones en un bucle hasta que
     * el usuario seleccione la opción de salir (opcion 6).
     */
    public static void main(String[] args) {
        int opcion = 0;

        do {
            opcion = pintarMenu();
            switch(opcion)  {
                case 1:
                    //Suma.menu();
                    System.out.println("Procesar Suma");
                    break;
                case 2:
                    //Resta.menu();
                    System.out.println("Procesar Resta");
                    break;
                case 3:
                    //Multiplicar.menu();
                    System.out.println("Procesar Mulriplicar");
                    break;
                case 4:
                    //Dividir.menu();
                    System.out.println("Procesar Dividir");
                    break;
                case 5:
                    //Modulo.menu();
                    System.out.println("Procesar Modulo");
                    break;
            }

        }while(opcion != 6);
        System.out.println("Fin del programa");

        leer.close();
    }

    /**
     * Metodo principal que ejecuta el menú de opciones de la calculadora.
     * @param
     */
    public static int pintarMenu()   {

        int opcion = 0;

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Modulo");
        System.out.println("6. Salir");

        System.out.println("Elige la operacion que quieres realizar en la calculadora o pulsa 6 para salir.");


        opcion = leer.nextInt();

        while(opcion<1 || opcion >6) {
            System.out.println("Opcion Incorrecta: teclea una opcion del 1 al 6");
            opcion = leer.nextInt();
        }
        return opcion;

    }
}


