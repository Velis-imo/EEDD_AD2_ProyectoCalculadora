package calculadora;

import java.util.Scanner;

/**
 * <p>Esta clase contiene los siguientes métodos de suma de una calculadora:
 * suma de 2 enteros, suma de 2 reales, suma de 3 reales y suma acumulativa.</p>
 * @author Andrea Amado Lain (Github: Andrie42)
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 */
public class Suma {

    /** Scanner para leer los números a introducir por el usuario.*/
    private static Scanner leer = new Scanner(System.in);

    /**
     * Método para suma de 2 enteros.
     * @param a es el primer número entero.
     * @param b es el segundo número entero.
     * @return devuelve la suma de ambos números.
     */
    public static int suma2Enteros(int a, int b) {
        return a + b;
    }

    /**
     * Método para sumar 2 números reales.
     * @param a es el primer número real.
     * @param b es el segundo número real.
     * @return devuelve la suma de ambos.
     */
    public static double suma2Reales(double a, double b) {
        return a + b;
    }

    /**
     * Método que suma 3 números reales.
     *
     * @param a es el primer número real.
     * @param b es el segundo número real.
     * @param c es el tercer número real.
     * @return devuelve la suma de los tres.
     */
    public static double suma3Reales(double a, double b, double c) {
        return a + b + c;
    }


    /**
     * Método para hacer una suma acumulada.
     * Este va sumando los números que recibe desde el
     * Scanner y los va sumando. Sale del bucle cuando se suma 0.
     *
     * @return devuelve el total de la suma acumulada.
     */
    public static double sumaAcumulativa() {
        double numero = leer.nextDouble();
        double sumaAcumulada = 0;

        do {
            sumaAcumulada += numero;
            System.out.println(sumaAcumulada);
            numero = leer.nextDouble();
        }
        while (numero != 0);
        return sumaAcumulada;

    }

    /**
     * Método que escribe las diferentes opciones del menú.
     */
    public static void escribirMenu (){
        System.out.println("Elige una opcion:");
        System.out.println("1. Sumar dos numeros reales");
        System.out.println("2. Sumar dos numeros enteros");
        System.out.println("3. Sumar tres numeros reales");
        System.out.println("4. Sumar con valor acumulado");
        System.out.println("5. Salir al menu principal");
    }

    /**
     * <p>Método que ejecuta el menú de la clase calculadora. Este llama
     * al método escribirmenu() para mostrar las opciones.
     * Después, lee con Scanner la opción elegida y llama al método correspondiente.
     * Finalmente, se llama a sí mismo (llamada recursiva).
     * El bucle se termina cuando se selecciona la opción de salir.</p>
     * <p>Casos especiales:
     * Para evitar los errores que aparecen si se introducen números reales en lugar de enteros,
     * en un principio se leen los números como double, pero luego se realiza un redondeo con
     * Math.round y un casting a integer. De este modo, si, por ejemplo, se introduce un double 2,7
     * este se redondeará a 3 y se transformará en un int.</p>
     */
    public static void menu() {

        escribirMenu();
        int opcion = leer.nextInt();

        while (opcion != 5) {
            switch (opcion) {

                case 1:
                    System.out.println("Introduce los dos reales que quieres sumar: ");
                    System.out.println(Suma.suma2reales(leer.nextDouble(), leer.nextDouble()));
                    break;
                case 2:
                    System.out.println("Introduce los dos enteros que quieres sumar, si introduces numeros reales, se redondearan: ");
                    System.out.println(Suma.suma2enteros((int) Math.round(leer.nextDouble()), (int) Math.round(leer.nextDouble())));
                    break;
                case 3:
                    System.out.println("Introduce los tres reales que quieres sumar: ");
                    System.out.println(Suma.suma3reales(leer.nextDouble(), leer.nextDouble(), leer.nextDouble()));
                    break;
                case 4:
                    System.out.println("Has entrado en el modo suma acumulada, pulsa 0 para salir");
                    System.out.println(Suma.sumaAcumulativa());
                    break;
                default:
                    System.out.println("Numero incorrecto. Elige una opcion del 1 al 5.");

            }
            menu();
        }
        Menu.Calculadora();


    }
}