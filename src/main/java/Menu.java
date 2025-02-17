<import java.util.Scanner;
/**
 * Clase principal de una Calculadora Básica que proporciona una interfaz de menú
 * para realizar operaciones matemáticas fundamentales.
 *
 * <p>Esta aplicación permite al usuario realizar las siguientes operaciones:
 * <ul>
 *   <li>Suma</li>
 *   <li>Resta</li>
 *   <li>Multiplicación</li>
 *   <li>División</li>
 *   <li>Módulo</li>
 * </ul>
 * </p>
 *
 * <p>Características principales:
 * <ol>
 *   <li>Interfaz de usuario basada en consola</li>
 *   <li>Validación de entradas</li>
 *   <li>Menú interactivo</li>
 * </ol>
 * </p>
 *
 * <h2>Ejemplo de Uso</h2>
 * <pre>
 * // Ejecutar la calculadora
 * java calculadora.Menu
 *
 * // Seleccionar una opción del menú
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Modulo
 * 6. Salir
 *
 * </pre>
 *
 * @author Velislav Krassenov
 * @author Andrea Amado
 * @author  David Pozo
 * @author Miduel del Castillo
 *
 * @version 1.0.
 * @see Suma
 * @see Resta
 * @see //Multiplicacion
 * @see //Division
 * @see //Modulo
 */
public class Menu {

    /**
     * Scanner estático para manejar la entrada de datos del usuario.
     * <p>Se utiliza para capturar las entradas del usuario desde la consola.</p>
     * @see java.util.Scanner
     */
    private static Scanner leer = new Scanner(System.in);


    /**
     * Metodo principal que inicia la aplicación de la calculadora.
     *
     * <p>Funcionalidades principales:
     * <ul>
     *   <li>Muestra un menú interactivo</li>
     *   <li>Permite seleccionar operaciones matemáticas</li>
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
    public static void main(String[] args) {

        int opcion;
        do {
            opcion = pintarMenu();
            switch(opcion)  {
                case 1:
                    // Opción de Suma
                    System.out.println("Procesar Suma");
                    break;
                case 2:
                    // Llamada al menú de Resta
                    Resta.menuResta();
                    break;
                case 3:
                    // Opción de Multiplicación
                    System.out.println("Procesar Multiplicar");
                    break;
                case 4:
                    // Opción de División
                    System.out.println("Procesar Dividir");
                    break;
                case 5:
                    // Opción de Módulo
                    System.out.println("Procesar Modulo");
                    break;
            }

        }while(opcion != 6);
        // Mensaje de finalización del programa
        System.out.println("Fin del programa");

        // Cierre del Scanner
        leer.close();
    }

    /**
     * Metodo que muestra el menú de opciones de la calculadora y gestiona la selección del usuario.
     *
     * <p>Detalles del metodo:
     * <ul>
     *   <li>Despliega las opciones disponibles</li>
     *   <li>Captura la selección del usuario</li>
     *   <li>Valida que la opción esté en el rango correcto</li>
     * </ul>
     * </p>
     *
     * <p>Validaciones:
     * <ul>
     *   <li>Rango de opciones: 1-6</li>
     *   <li>Reintento en caso de opción inválida</li>
     * </ul>
     * </p>
     *
     * @return Opción seleccionada por el usuario (entre 1 y 6)
     */
    public static int pintarMenu()   {
        int opcion;

        // Mostrar opciones del menú
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Modulo");
        System.out.println("6. Salir");

        // Instrucción para el usuario
        System.out.println("Elige la operacion que quieres realizar en la calculadora, o pulsa 6 para salir.");

        // Capturar la opción del usuario
        opcion = leer.nextInt();

        // Validar que la opción esté en el rango correcto
        while(opcion<1 || opcion >6) {
            System.out.println("Opcion Incorrecta: teclea una opcion del 1 al 6");
            opcion = leer.nextInt();
        }

        return opcion;
    }
}

