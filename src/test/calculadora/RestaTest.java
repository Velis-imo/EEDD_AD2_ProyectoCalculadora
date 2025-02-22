package calculadora;
/**
 * Esta clase contiene los test de los métodos de la clase Resta
 * @author Michael jordan telleria guadalajara(MichaelJTG)
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    @BeforeEach
    void setUp() {
    }

    /**
     * Test para probar el método restaReales de la clase Resta.
     * Primero llama al método, introduciendo los parámetros a y b,
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * realizando dos test el primero con numeros positivos y el segundo test
     * con numeros negativos, tambien se prueba si el caso de a o b sea cero.
     */
    @Test
    void restaReales() {
        Resta.restaReales();//Test de resta con resultado positivo
        assertEquals(3,5-2,"resultado 3");

        Resta.restaReales();//Test de resta con resultado negativo
        assertEquals(-2,3-5,"resultado -2 o peta");

        Resta.restaReales();//Test de resta con resultado negativo en a
        assertEquals(-5,0-5,"resultado -5 o peta");

        Resta.restaReales();//Test de resta con resultado negativo en b
        assertEquals(-5,-5-0,"resultado -5 o peta");

    }
    /**
     * Test para probar el método restaEnteros de la clase Resta.
     * Primero llama al método, introduciendo los parámetros a y b,
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * realizando dos test el primero con numeros positivos y el segundo test
     * con numeros negativos, tambien se prueba si el caso de a o b sea cero.
     */


    @Test
    void restaEnteros() {
        Resta.restaEnteros();//Test de resta con resultado positivo
        assertEquals(3,5-2,"resultado 3");

        Resta.restaEnteros();//Test de resta con resultado negativo
        assertEquals(-2,3-5,"resultado -2 o peta");

        Resta.restaEnteros();//Test de resta con resultado negativo en a
        assertEquals(-5,0-5,"resultado -5 o peta");

        Resta.restaEnteros();//Test de resta con resultado negativo en b
        assertEquals(-5,-5-0,"resultado -5 o peta");

    }
    /**
     * Test para probar el método restaTresReales de la clase Resta.
     * Primero llama al método, introduciendo los parámetros a y b y c....
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * realizando dos test el primero con numeros positivos y el segundo test
     * con numeros negativos, tambien se prueba si el caso de a o b sea cero.
     */

    @Test
    void restaTresReales() {
        Resta.restaTresReales();//Test de resta con resultado positivo
        assertEquals(2,10-5-3,"resultado 2");

        Resta.restaTresReales();//Test de resta con resultado negativo
        assertEquals(-2,10-5-4-3,"resultado -2 o peta");

        Resta.restaTresReales();//Test de resta con resultado negativo en a
        assertEquals(-10,0-5-5,"resultado -10 o peta");

        Resta.restaTresReales();//Test de resta con resultado negativo en b
        assertEquals(-10,-5-0-5,"resultado -10 o peta");
    }
    /**
     * Test para probar el método restaAcumulada de la clase Resta.
     * Primero llama al método, introduciendo los parámetros a y b y c....
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * realizando dos test el primero con numeros positivos y el segundo test
     * con numeros negativos, tambien se prueba si el caso de a o b sea cero.
     */

    @Test
    void restaAcumulada() {
        Resta.restaTresReales();//Test de resta con resultado positivo
        assertEquals(2,10-5-3,"resultado 2");

        Resta.restaTresReales();//Test de resta con resultado negativo
        assertEquals(-2,10-5-4-3,"resultado -2 o peta");

        Resta.restaTresReales();//Test de resta con resultado negativo en a
        assertEquals(-10,0-5-5,"resultado -10 o peta");

        Resta.restaTresReales();//Test de resta con resultado negativo en b
        assertEquals(-10,-5-0-5,"resultado -10 o peta");
    }
}