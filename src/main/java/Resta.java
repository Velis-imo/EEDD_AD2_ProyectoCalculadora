import java.util.Scanner;

/**
 * Clase que implementa una calculadora especializada en operaciones de resta.
 * Proporciona diferentes funcionalidades para realizar operaciones de resta,
 * incluyendo números reales, enteros y operaciones acumulativas.
 *
 * <p>La clase ofrece las siguientes operaciones:</p>
 * <ul>
 *   <li> 1. Resta de dos números reales</li>
 *   <li> 5. Salir</li>
 * </ul>
 *
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
         *   <li> 1. Resta de dos números reales</li>
         *   <li> 2. Resta de dos números enteros</li>
         *   <li> 3. Resta de tres números reales</li>
         *   <li> 4. Resta con valor acumulado</li>
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
                    Resta.restaReales();
                    break;
                case 2:
                    Resta.restaEnteros();
                    break;
                case 3:
                    Resta.restaTresReales();
                    break;
                case 4:
                    Resta.restaAcumulada();
                    System.out.println("Resta con valor acumulado");
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
     * El metod restareales, realiza la resta de dos números reales.
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
     *
     * @return double Resultado de la resta de los dos números reales
     *
     */
    public static double restaReales() {
        System.out.println("Dame un numero");
        double a = leer.nextDouble();

        System.out.println("Dame otro numero");
        double b = leer.nextDouble();
        System.out.println("El Resultado es: " + (a-b));
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
     * @return int Resultado de la resta de los dos números enteros
     * @throws "Forarmato Erroneo" si el usuario introduce decimales.
     */
    public static int restaEnteros() {
        System.out.println("Dame un numero");
        int a = leer.nextInt();;

        System.out.println("Dame otro numero");
        int b = leer.nextInt();
        System.out.println("El Resultado es: " + (a-b));
        return a - b;

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
     * @throws
     */
    public static double restaTresReales() {

        System.out.println("dame un numero");
        double a = leer.nextInt();

        System.out.println("dame otro numero");
        double b = leer.nextInt();

        System.out.println("dame otro numero");
        double c = leer.nextInt();

        System.out.println("El Resultado es: " + (a-b-c));
        return a-b-c;

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
     * @return double Resultado final de la resta acumulada
     * @throws
     */
    public static double restaAcumulada()  {

        System.out.println("Dame un numero");

        double numeroLeido = leer.nextDouble();
        double restaAcumulada = numeroLeido;

        System.out.println("Dame otro numero");
        Scanner leer = new Scanner(System.in);
        numeroLeido = leer.nextDouble();

        while (numeroLeido != 0) {
            restaAcumulada -= numeroLeido;
            System.out.println("Dame otro numero");
            numeroLeido = leer.nextDouble();
        }
        System.out.println("La resta acumulada es: " + restaAcumulada);
        return restaAcumulada;
    }
}
