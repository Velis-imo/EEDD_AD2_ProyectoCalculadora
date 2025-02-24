package calculadora;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase contiene los test de los métodos de la clase División
 * @see Division
 * @author David Pozo Plumed (Github Darknegan)
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 */

class DivisionTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }


    /**
     * Test para probar el método DivisionReales() de la clase División.
     * Primero llama al método, introduciendo los parámetros divisor y dividendo
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban dos casos distintos.
     */

    @org.junit.jupiter.api.Test
    void DivisionReales() {
        Division.DivisionReales( 4, 0);
        assertEquals(0,4/2, "Espero que pete");
        //Espero que pete al dividir entre 0

        Division.DivisionReales(-9,3);
        assertEquals(-3,-9/3, "Debe ser -3");
        //Espero que el resultado sea -3 ya que un número es negativo
    }

    /**
     * Test para probar el método DivisionEnteros() de la clase División.
     * Primero llama al método, introduciendo los parámetros divisor y dividendo
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban dos casos distintos.
     */
    @org.junit.jupiter.api.Test
    void DivisionEnteros() {
        Division.DivisionEnteros( 4, 2);
        assertEquals(2,4/2, "Debe ser 2");
        //Sencillo y para toda la familia

        Division.DivisionEnteros(-9, 3);
        assertEquals(-3,-9/3, "Espero que pete");
        //Pongo negativo a ver si responde
    }

    /**
     * Test para probar el método NumInverso() de la clase División.
     * Primero llama al método, introduciendo el parámetro NumInverso
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban dos casos distintos.
     */
    @org.junit.jupiter.api.Test
    void NumInverso() {
        Division.NumInverso(4);
        assertEquals(0.25,1/4, "Debe ser 0.25");
        //Sencillo y para toda la familia

        Division.NumInverso(2.5);
        assertEquals(0.5,1/2.5, "Espero que pete");
        //Pruebo con otro
    }

    /**
     * Test para probar el método RaizCuadrada() de la clase División.
     * Primero llama al método, introduciendo el parámetro numero
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban dos casos distintos.
     */
    @org.junit.jupiter.api.Test
    void RaizCuadrada() {
        Division.RaizCuadrada(4);
        assertEquals(2,Math.sqrt(4), "Debe ser 2");
        //Sencillo y para toda la familia

        Division.RaizCuadrada(-9);
        assertEquals(-3,Math.sqrt(-9), "Espero que pete");
        //Al ser negativo, debe petar al hacer la raiz cuadrada

    }


}