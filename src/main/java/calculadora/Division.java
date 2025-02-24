package calculadora;

import java.util.Scanner;

/**
 *Esta clase contiene los siguientes métodos de calculadora. Division de una calculadora:
 * Division de 2 Reales, calculadora. Division de 2 enteros, inverso de un número real y raiz cuadrada
 * @see Menu
 * @author Michael jordan telleria guadalajara (MichaelJTG)
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 *
 */
public class Division {

    private static double divisor;
    private static double dividendo;
    private static double NumInverso;
    private static double numero;
    private static double resultado;




        private static Scanner leer = new Scanner(System.in);


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


    public static double menuDivision() {
            int opcion =0;

            do {
                opcion = pintarMenu();

                switch(opcion) {
                    case 1:
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

                        }return resultado;



                    case 2: System.out.println("Dame dos numeros y los dividire, 0 para salir");
                        System.out.println("Escribe el valor de divisor");
                        int divisor = leer.nextInt();
                        System.out.println("Escribe el valor de dividendo");
                        int dividendo = leer.nextInt();
                        if (divisor == 0) {
                            throw new ArithmeticException("El divisor no puede ser igual a 0");
                        } else {
                            System.out.println("El resultado es: " + (divisor / dividendo));
                        }

                        break;
                    case 3:
                        System.out.println("Dame un numero del que necesites saber su inverso, 0 para salir");
                        NumInverso = leer.nextDouble();
                        if (NumInverso == 0) {
                            throw new ArithmeticException("El divisor no puede ser igual a 0");
                        } else {
                            System.out.println("El numero inverso es: " + (1 / NumInverso));
                        }


                        break;
                    case 4:
                        System.out.println("Dame un número positivo para hacer su raiz cuadrada");
                        Scanner leer = new Scanner(System.in);
                        numero = leer.nextDouble();

                        if (numero < 0) {
                            throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo");
                        }
                        System.out.println("el resultado es : " + Math.sqrt(numero));
                        return Math.sqrt(numero);

                    case 5: Menu.Calculadora();
                }

            }while(opcion !=5);

            System.out.println(" Fin de proceso");


            leer.close();
            return 0;
        }
         /**
          * Realiza la división de dos números reales
          * @param dividendo número real a dividir
          * @param divisor número real que divide
          * @return resultado de la división
          * @throws ArithmeticException si el divisor es 0
          */
        public static int DivisionEnteros (int divisor, int dividendo) {
            return divisor/dividendo;
        }


         /**
          * Realiza la división de dos números enteros
          *
          * @param dividendo número entero a dividir
          * @param divisor   número entero que divide
          * @return resultado de la división
          * @throws ArithmeticException si el divisor es 0
          */
        public static double DivisionReales (double divisor, double dividendo){
            return divisor/dividendo;
        }



            /**
            * Calcula el inverso de un número real
            * @param NumInverso número del cual calcular el inverso
            * @return el inverso del número (1/numero)
            * @throws ArithmeticException si el número es 0
            */

        public static double NumInverso (double NumInverso) {
            return NumInverso;
        }


        /**
         * Calcula la raíz cuadrada de un número
         * @param numero número del cual calcular la raíz
         * @return la raíz cuadrada del número
         * @throws IllegalArgumentException si el número es negativo
         */


        public static double RaizCuadrada (double numero) {
            return Math.sqrt(numero);
        }


    }




