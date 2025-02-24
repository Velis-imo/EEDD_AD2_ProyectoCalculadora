package calculadora;

import java.util.Scanner;

/**
 * Esta clase contiene los siguientes métodos de producto de una calculadora:
 * producto de 2 enteros, producto de 2 reales, producto de 3 reales y cálculo de potencias
 * @author David Pozo (Github Darknegan)
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 *
 */

public class Producto {
/**
 * Creo todas las variables que vamos a necesitar y las defino
 */
    private static Scanner leer = new Scanner(System.in);

    private static double a;
    private static double b ;
    private static double c ;
    private static int d;
    private static int f;
    private static int opcion;

    /**
     * Inicializo las variables
     */
    static {
        a=0;
        b=0;
        c=0;
        d=0;
        f=0;
        opcion=0;
    }

    /**
     * Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la
     *  solución
     * @param a es el primer número real
     * @param b es el segundo número real
     * @return devuelve el producto de ambos números
     */

        public static double productoReales(double a, double b){

            return  a * b;
        }


    /**
     * Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la
     *  solución
     * @param d es el primer número entero
     * @param f es el segundo número entero
     * @return devuelve el producto de ambos números
     */

        public static int productoEntero(int d, int f) {
                    return  d * f;

            }

    /**
     * Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la
     *  solución
     * @param a es el primer número real
     * @param b es el segundo número real
     * @param c es el tercer número real
     * @return devuelve la solución del producto
     */

        public static double productoTres(double a, double b, double c) {
            return a * b * c;

        }

        /** Potencia, tendrá dos parámetros de entrada (base y exponente) y uno de salida que será la solución
         * @param a es la base de la potencia
         * @param b es el exponente de la potencia
         * @return devuelve el resultado de la potencia
         * */

        public static double potencia(double a, double b) {
            return Math.pow(a,b);
    }

    /**
     * Método que ejecuta el menú del calculadora.Producto . Éste llama
     * al método productoMenu() para mostrar las opciones.
     * Después, lee con Scanner la opción elegida y llama al método correspondiente.
     * Finalmente, se llama a sí mismo (llamada recursiva).
     * El bucle se termina cuando se selecciona la opción de salir o se vuelve al menu principal.
     *
     */

    public static void productoMenu() {


        System.out.println("1. Producto de dos numeros reales");
        System.out.println("2. Producto de dos numeros enteros");
        System.out.println("3. Producto de tres numeros reales");
        System.out.println("4. Potencia");
        System.out.println("5. Volver");
        System.out.println("6. Salir");

        System.out.println("Elige la operación que quieres realizar en la calculadora pulsa 5 para volver o 6 para salir.");


        opcion = leer.nextInt();



        if (opcion < 1 || opcion > 6) {
            System.out.println("Opción Incorrecta: teclea una opción del 1 al 6");
            Producto.productoMenu();
        }
        else {
            switch (opcion) {
                case 1:
                    //calculadora.Producto de dos números reales
                    System.out.println("Dame el primer número real: ");
                    a = leer.nextDouble();
                    System.out.println("Dame el segundo número real: ");
                    b = leer.nextDouble();
                    System.out.println("\nEl resultado es: " + Producto.productoReales(a, b) + "\n");
                    Producto.productoMenu();
                case 2:
                    //calculadora.Producto de dos números enteros
                    System.out.println("calculadora.Producto de dos números enteros");
                    System.out.println("Dame el primer número entero: ");
                    d = leer.nextInt();
                    System.out.println("Dame el segundo número entero: ");
                    f = leer.nextInt();
                    System.out.println("\nEl resultado es: " + Producto.productoEntero(d, f) + "\n");
                    Producto.productoMenu();
                case 3:
                    //calculadora.Producto de tres números reales
                    System.out.println("calculadora.Producto de tres números reales");
                    System.out.println("Dame el primer número real: ");
                    a = leer.nextDouble();
                    System.out.println("Dame el segundo número real: ");
                    b = leer.nextDouble();
                    System.out.println("Dame el tercer número real: ");
                    c = leer.nextDouble();
                    System.out.println("\nEl resultado es: " + Producto.productoTres(a, b, c)+"\n");
                    Producto.productoMenu();
                case 4:
                    //Potencia
                    System.out.println("Potencia");
                    System.out.println("Dame la base de la potencia: ");
                    a = leer.nextDouble();
                    System.out.println("Dame el exponente de la potencia: ");
                    b = leer.nextDouble();
                    System.out.println("\nEl resultado es: " + Producto.potencia(a, b)+"\n");
                    Producto.productoMenu();
                case 5:
                    //Volver
                    System.out.println("Volver");
                    Menu.Calculadora();
                case 6:
                    //Fin del programa
                    System.out.println("Fin del programa");
                    break;


            }
        }
    }
}