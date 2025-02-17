//import test.Menu;

import java.util.Scanner;

/**
 * Esta clase contiene los siguientes métodos de suma de una calculadora:
 * suma de 2 enteros, suma de 2 reales, suma de 3 reales y suma acumulativa
 * @author Andrea Amado Lain (Github: Andrie42)
 *
 */
public class Suma {

    /**
     * método para suma de 2 enteros
     *
     * @param a es el primer número entero
     * @param b es el segundo número entero
     * @return devuelve la suma de ambos números
     */
    public static int suma2enteros(int a, int b) {
        return a + b;
    }

    /**
     * método para sumar 2 números reales
     *
     * @param a es el primer número real
     * @param b es el segundo número real
     * @return devuelve la suma de ambos
     */
    public static double suma2reales(double a, double b) {
        return a + b;
    }

    /**
     * método que suma 3 números reales
     *
     * @param a es el primer número real
     * @param b es el segundo número real
     * @param c es el tercer número real
     * @return devuelve la suma de los tres
     */
    public static double suma3reales(double a, double b, double c) {
        return a + b + c;
    }


    /**
     * Método para hacer una suma acumulada.
     * Éste va sumando los números que recibe desde el
     * Scanner y los va sumando. Sale del bucle cuando se suma 0.
     *
     * @return devuelve el total de la suma acumulada
     */
    public static double sumaAcumulativa() {
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        double sumaAcumulada = 0;

        do {
            sumaAcumulada += numero;
            System.out.println(sumaAcumulada);
            numero = sc.nextDouble();
        }
        while (numero != 0);
        return sumaAcumulada;

    }

    /**
     * Método que escribe las diferentes opciones del menú.
     */
    public static void escribirMenu (){
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Sumar dos números reales");
        System.out.println("2. Sumar dos números enteros");
        System.out.println("3. Sumar tres números reales");
        System.out.println("4. Sumar con valor acumulado");
        System.out.println("0. Salir al menú principal");
    }

    /**
     * Método que ejecuta el menú de la clase Suma. Éste llama
     * al método escribirmenu() para mostrar las opciones.
     * Después, lee con Scanner la opción elegida y llama al método correspondiente.
     * Finalmente, se llama a sí mismo (llamada recursiva).
     * El bucle se termina cuando se selecciona la opción de salir.
     *
     * Casos especiales:
     * Para evitar los errores que aparecen si se introducen números reales en lugar de enteros,
     * en un principio se leen los números como double, pero luego se realiza un redondeo con
     * Math.round y un casting a integer. De este modo, si, por ejemplo, se introduce un double 2,7
     * este se redondeará a 3 y se transformará en un int.
     *
     */
    public static void menu() {

        escribirMenu();
        Scanner leerNumeros = new Scanner(System.in);
        int opcion = leerNumeros.nextInt();

        if (opcion > 4 || opcion < 0) {
            System.out.println("Número incorrecto. Elige una opción del 0 al 4.");
            escribirMenu();
        }
        if (opcion == 0) {
            Menu.Calculadora();
        }
        switch (opcion) {
            case 1:
                System.out.println("Introduce los dos reales que quieres sumar: ");
                System.out.println(Suma.suma2reales(leerNumeros.nextDouble(), leerNumeros.nextDouble()));
                break;
            case 2:
                System.out.println("Introduce los dos enteros que quieres sumar, si introduces números reales, se redondearán: ");
                System.out.println(Suma.suma2enteros((int)Math.round(leerNumeros.nextDouble()), (int)Math.round(leerNumeros.nextDouble())));
                break;
            case 3:
                System.out.println("Introduce los tres reales que quieres sumar: ");
                System.out.println(Suma.suma3reales(leerNumeros.nextDouble(), leerNumeros.nextDouble(), leerNumeros.nextDouble()));
                break;

            case 4:
                System.out.println("Has entrado en el modo suma acumulada, pulsa 0 para salir");
                System.out.println(Suma.sumaAcumulativa());
                break;
        }
        menu();


    }
}