import java.util.Scanner;

/** @author David Pozo (Github Darknegan)
 *
 */

public class Producto {

    private static Scanner leer = new Scanner(System.in);

    private static double a;
    private static double b ;
    private static double c ;
    private static int d;
    private static int f;
    private static int opcion;

    static {
        a=0;
        b=0;
        c=0;
        d=0;
        f=0;
        opcion=0;
    }

    /**Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la
         solución.*/

        public static double productoreales(double a, double b){
            return  a * b;
        }


        /**Producto de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la
         solución.*/

        public static int productoentero(int d, int f) {
                    return  d * f;

            }

        /**Producto de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la
         solución.*/

        public static double productotres(double a, double b, double c) {
            return a * b * c;

        }

        /** Potencia, tendrá dos parámetros de entrada (base y exponente) y uno de salida que será la solución*/

        public static double potencia(double a, double b) {
            return Math.pow(a,b);
    }

    /**
     * Creo menú de la clase
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
                    //Producto de dos números reales
                    System.out.println("Dame el primer número real: ");
                    a = leer.nextDouble();
                    System.out.println("Dame el segundo número real: ");
                    b = leer.nextDouble();
                    System.out.println("\nEl resultado es: " + Producto.productoreales(a, b) + "\n");
                    Producto.productoMenu();
                case 2:
                    //Producto de dos números enteros
                    System.out.println("Producto de dos números enteros");
                    System.out.println("Dame el primer número entero: ");
                    d = leer.nextInt();
                    System.out.println("Dame el segundo número entero: ");
                    f = leer.nextInt();
                    System.out.println("\nEl resultado es: " + Producto.productoentero(d, f) + "\n");
                    Producto.productoMenu();
                case 3:
                    //Producto de tres números reales
                    System.out.println("Producto de tres números reales");
                    System.out.println("Dame el primer número real: ");
                    a = leer.nextDouble();
                    System.out.println("Dame el segundo número real: ");
                    b = leer.nextDouble();
                    System.out.println("Dame el tercer número real: ");
                    c = leer.nextDouble();
                    System.out.println("\nEl resultado es: " + Producto.productotres(a, b, c)+"\n");
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