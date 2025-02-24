package calculadora;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Esta clase contiene los test de los métodos de la clase Producto
 * @see Producto
 * @author Andrea Amado Lain (Github: Andrie42)
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 */

class ProductoTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    /**
     * Test para probar el método productoReales() de la clase Producto.
     * Primero llama al método, introduciendo los parámetros a y b,
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban tres casos distintos.
     */
    @org.junit.jupiter.api.Test
    void productoReales() {
        Producto.productoReales(2.3, 3.9);
        assertEquals(8.97, 2.3 * 3.9, "Debe ser 8.97");

        Producto.productoReales(2147483647, 3.9);
        assertEquals(8375186223.3,2147483647*3.9, "El resultado debe ser 8375186223.3");

        Producto.productoReales(-4, 2.5);
        assertEquals(-10, -4 * 2.5, "Debe ser -10");
    }

    /**
     * Test para probar el método productoEntero() de la clase Producto.
     * Primero llama al método, introduciendo los parámetros a y b,
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban tres casos distintos.
     */
    @org.junit.jupiter.api.Test
    void productoEntero() {
        Producto.productoEntero(2, 3);
        assertEquals(6, 2 * 3, "Debe ser 6");

        Producto.productoEntero(-4, 2);
        assertEquals(-8, -4 * 2, "Debe ser -8");

        Producto.productoEntero(10, 3);
        assertEquals(30, 10 * 3, "Debe ser 30");
    }

    /**
     * Test para probar el método productoTres() de la clase Producto.
     * Primero llama al método, introduciendo los parámetros a, b y c,
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban tres casos distintos.
     */
    @org.junit.jupiter.api.Test
    void productoTres() {
        Producto.productoTres(2, 3, 5);
        assertEquals(30, 2 * 3 * 5, "Debe ser 30");

        Producto.productoTres(4, 5, 5);
        assertEquals(100, 4*5*5,"Debe ser 100");

        Producto.productoTres(5, -5, 5);
        assertEquals(-125, 5 * -5 * 5, "Debe ser -125");
    }

    /**
     * Test para probar el método potencia() de la clase Producto.
     * Primero llama al método, introduciendo los parámetros a y b,
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * <br>Se prueban dos casos distintos, incluído uno que dará error por exceso de longitud del int.
     */
    @org.junit.jupiter.api.Test
    void potencia() {
        Producto.potencia(2147483647, 2);
        assertEquals(4611686014132420609L, Math.pow(2147483647, 2), "El resultado sería 4611686014132420609," +
                "pero dará error por el exceso de longitud del int");
        Producto.potencia(5, 2);
        assertEquals(25, Math.pow(5, 2), "Debe ser 25");
    }



}
