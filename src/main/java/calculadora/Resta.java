package calculadora;

import java.util.Scanner;

/**
 * Clase que implementa una calculadora especializada en operaciones de resta.
 * Proporciona diferentes funcionalidades para realizar operaciones de resta,
 * incluyendo números reales, enteros y operaciones acumulativas.
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 *
 * <p>La clase ofrece las siguientes operaciones:</p>
 * <ul>
 *   <li> 1. calculadora.Resta de dos números reales</li>
 *   <li> 5. Salir</li>
 * </ul>
 * @see Menu
 * @author Velislav Krassenov
 * @version 1.0
 */


public class Resta {

    /** Scanner utilizado para la entrada de datos del usuario */
    private static final Scanner leer = new Scanner(System.in);


    /**
     * Metodo principal que ejecuta el programa de calculadora de restas.
     * Implementa un menú interactivo que permite al usuario seleccionar
     * diferentes tipos de operaciones de resta hasta que elija salir.
     *
     */
    public static void menuResta() {

        /**
         * Muestra y gestiona el menú de opciones de la calculadora de restas.
         * Presenta cinco opciones al usuario y valida que la entrada esté en el rango correcto.
         *
         * <p>Las opciones disponibles son:</p>
         * <ol>
         *   <li> 1. calculadora.Resta de dos números reales</li>
         *   <li> 2. calculadora.Resta de dos números enteros</li>
         *   <li> 3. calculadora.Resta de tres números reales</li>
         *   <li> 4. calculadora.Resta con valor acumulado</li>
         *   <li> 5. Salir al menú principal</li>
         * </ol>
         *
         * @return int Opción seleccionada por el usuario (1-5)
         * @throws InputMismatchException si la entrada no es un número válido
         */
        int opcion = 0;

        do {
            opcion = menu();
            switch(opcion)  {
                case 1:
                    System.out.println("Introduce el primer numero real");
                    double a = leer.nextDouble();
                    System.out.println("Introduce el segundo numero real");
                    double b = leer.nextDouble();
                    System.out.println("El Resultado es: " + restaReales(a,b));
                    break;
                case 2:
                    System.out.println("Dame un numero entero");
                    int c = leer.nextInt();
                    System.out.println("Dame otro numero entero");
                    int d = leer.nextInt();
                    System.out.println("El Resultado es: " + restaEnteros(c,d));
                    break;
                case 3:
                    System.out.println("dame un numero real");
                    a = leer.nextInt();
                    System.out.println("dame otro numero real");
                    b = leer.nextInt();
                    System.out.println("dame otro numero real");
                    double e = leer.nextInt();
                    System.out.println("El Resultado es: " + restaTresReales(a, b, e));
                    break;
                case 4:
                    System.out.println(Resta.restaAcumulada());
                    break;
                case 5:
                    Menu.Calculadora();
                    System.out.println("Volver al menu principal");
                    break;

            }
        }while(opcion != 6);
        System.out.println("Fin del programa");
    }


    /**
     * Metodo principal que muestra las 4 funciones de la resta.
     *
     * <p>Funcionalidades principales:
     * <ul>
     *   <li>Muestra un menú interactivo</li>
     *   <li>Permite seleccionar las operaciones de resta</li>
     *   <li>Gestiona el flujo del programa</li>
     * </ul>
     * </p>
     *
     * <p>Flujo de ejecución:
     * <ol>
     *   <li>Mostrar menú</li>
     *   <li>Capturar opción del usuario</li>
     *   <li>Ejecutar operación seleccionada</li>
     *   <li>Repetir hasta que el usuario decida salir</li>
     * </ol>
     * </p>
     */
    public static int menu()    {
        int opcion;
        System.out.println("1. Resta de dos numeros reales");
        System.out.println("2. Resta de dos numeros enteros");
        System.out.println("3. Resta de tres numeros reales");
        System.out.println("4. Resta con valor acumulado");
        System.out.println("5. salir al menu principal");


        opcion = leer.nextInt();

        while(opcion<1 || opcion >5) {
            System.out.println("Opcion Incorrecta: teclea una opcion del 1 al 5");
            opcion = leer.nextInt();
        }
        return opcion;
    }

    /**
     * El metodo restareales, realiza la resta de dos números reales.
     * Solicita al usuario dos números reales y calcula su diferencia.
     *
     * <p>Fórmula: resultado = a - b</p>
     *
     * <p>Ejemplo de uso:</p>
     * <pre>
     * Entrada: a = 5.5, b = 3.2
     * Salida: 2.3
     * </pre>
     *
     * @param a es el primer número real
     * @param b es el segundo número real
     * @return devuelve la resta de ambos números
     *
     *
     */
    public static double restaReales(double a, double b) {
        return a - b;
    }


    /**
     * El metodo restaEnteros realiza la resta de dos números enteros.
     * Solicita al usuario dos números enteros y calcula su diferencia.
     *
     * <p>Fórmula: resultado = a - b</p>
     *
     * <p>Ejemplo de uso:</p>
     * <pre>
     * Entrada: a = 10, b = 4
     * Salida: 6
     * </pre>
     *
     * @param c es el primer número entero
     * @param d es el segundo número entero
     * @return la resta de ambos numeros
     *
     */
    public static int restaEnteros(int c, int d) {
        return c - d;
    }


    /**
     * El metodo restaTresReales, realiza la resta secuencial de tres números reales.
     * Solicita al usuario tres números reales y calcula la resta secuencial.
     *
     * <p>Fórmula: resultado = a - b - c</p>
     *
     * <p>Ejemplo de uso:</p>
     * <pre>
     * Entrada: a = 10.0, b = 3.0, c = 2.0
     * Salida: 5.0
     * </pre>
     *
     * @param a es el primer número real
     * @param b es el segundo número real
     * @param e es el tercer numero real
     * @return devuelve la resta de los tres números
     * @throws
     */
    public static double restaTresReales(double a, double b, double e) {
        return a-b-e;
    }

    /**
     * El metodo restaAcumulada, implementa una resta acumulativa de números reales.
     * Solicita números al usuario y va restándolos sucesivamente hasta que
     * se ingrese un cero para terminar la operación.
     *
     * <p>El proceso:</p>
     * <ol>
     *   <li>Solicita un número inicial como base</li>
     *   <li>Continúa solicitando números para restar del acumulado</li>
     *   <li>Termina cuando se ingresa 0</li>
     * </ol>
     *
     * <p>Ejemplo de uso:</p>
     * <pre>
     * Entrada: 100, 20, 30, 0
     * Proceso: 100 - 20 = 80, 80 - 30 = 50
     * Resultado final: 50
     * </pre>
     *
     * @param
     * @param
     * @return devuelve la resta acumulada
     */
    public static double restaAcumulada()  {

        System.out.println("Método resta acumulada, pulsa 0 para salir");
        System.out.println("Dame un numero");
        double numeroLeido = leer.nextDouble();
        double restaAcumulada = numeroLeido;


        System.out.println("Dame otro numero");
        Scanner leer = new Scanner(System.in);
        numeroLeido = leer.nextDouble();

        while (numeroLeido != 0) {
            restaAcumulada -= numeroLeido;
            System.out.println("La resta por ahora es : " + restaAcumulada);
            System.out.println("Dame otro numero");
            numeroLeido = leer.nextDouble();
        }
        System.out.println("La resta acumulada es: " + restaAcumulada);
        return restaAcumulada;
    }
}

