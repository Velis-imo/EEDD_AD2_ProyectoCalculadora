import java.util.Scanner;

/**
 *Esta clase contiene los siguientes métodos de Division de una calculadora:
 * Division de 2 Reakes, Division de 2 enteros, inverso de un numero real y Raiz cuadrada
 * @author Michael jordan telleria guadalajara (MichaelJTG)
 *
 */
public class Division {

        private static Scanner leer = new Scanner(System.in);

        public static void menuDivision() {
            int opcion =0;

            do {
                opcion = pintarMenu();

                switch(opcion) {
                    case 1:

                        procesarOpcion1();
                        break;
                    case 2:

                        procesarOpcion2();
                        break;
                    case 3:

                        procesarOpcion3();
                        break;
                    case 4:
                        calcularRaiz4();
                        break;
                    case 5: Menu.Calculadora();
                }

            }while(opcion !=5);

            System.out.println(" Fin de proceso");


            leer.close();
        }

        public static double procesarOpcion1() throws ArithmeticException {
            /**
             * Realiza la división de dos números reales
             * @param dividendo número real a dividir
             * @param divisor número real que divide
             * @return resultado de la división
             * @throws ArithmeticException si el divisor es 0
             */

            Scanner leer = new Scanner(System.in);
            double divisor, dividendo, resultado;
            System.out.println("Dame dos numeros y los dividire, 0 para salir");
            System.out.println("Escribe el valor de divisor");
            divisor = leer.nextDouble();
            System.out.println("Escribe el valor de dividendo");
            dividendo = leer.nextDouble();
            if (divisor == 0)
                throw new ArithmeticException("El divisor no puede ser igual a 0");
            else {
                resultado = dividendo/divisor;
                System.out.println("El resultado es: " + resultado);
                return resultado;
            }
        }
        public static void procesarOpcion2() throws ArithmeticException {
            /**
             * Realiza la división de dos números enteros
             * @param dividendo número entero a dividir
             * @param divisor número entero que divide
             * @return resultado de la división
             * @throws ArithmeticException si el divisor es 0
             */
            Scanner leer = new Scanner(System.in);
            int divisor, dividendo;
            System.out.println("Dame dos numeros y los dividire, 0 para salir");
            System.out.println("Escribe el valor de divisor");
            divisor = leer.nextInt();
            System.out.println("Escribe el valor de dividendo");
            dividendo = leer.nextInt();
            if (divisor == 0) {
                throw new ArithmeticException("El divisor no puede ser igual a 0");
            } else {
                System.out.println("El resultado es: " + (divisor / dividendo));
            }


        }
        public static void procesarOpcion3() {
            /**
             * Calcula el inverso de un número real
             * @param numero número del cual calcular el inverso
             * @return el inverso del número (1/numero)
             * @throws ArithmeticException si el número es 0
             */
            Scanner leer = new Scanner(System.in);
            double NumInverso;
            System.out.println("Dame un numero del que necesites saber su inverso, 0 para salir");
            NumInverso = leer.nextDouble();
            if (NumInverso == 0) {
                throw new ArithmeticException("El divisor no puede ser igual a 0");
            } else {
                System.out.println("El numero inverso es: " + (1 / NumInverso));
            }


        }
        public static double calcularRaiz4() {
            /**
             * Calcula la raíz cuadrada de un número
             * @param numero número del cual calcular la raíz
             * @return la raíz cuadrada del número
             * @throws IllegalArgumentException si el número es negativo
             */
            Scanner leer = new Scanner(System.in);
            double numero = 0;
            if (numero < 0) {
                throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo");
            }
            return Math.sqrt(numero);
        }


        public static int pintarMenu() {
            int opcion = 0;
            System.out.println("1.-División de dos números reales");
            System.out.println("2.-División de dos números enteros,");
            System.out.println("3.-Inverso de un número real");
            System.out.println("4.-Raíz de un número");
            System.out.println("5.-Salir");
            System.out.println("teclea una opcion, 5 para salir");
            opcion = leer.nextInt();

            while(opcion <1 || opcion >5) {
                System.out.println("opcion incorrecta, validos de 1 al 5");
                opcion = leer.nextInt();

            }
            return opcion;
        }




    }




