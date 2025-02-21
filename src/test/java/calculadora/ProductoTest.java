package calculadora;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Esta clase contiene los test de los métodos de la clase Producto
 * @author Andrea Amado Lain (Github: Andrie42)
 * Link del repositorio compartido: https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git
 */

class ProductoTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    /**
     * Test para probar el metodo productoReales() de la clase Producto.
     * Se prueban dos casos distintos.
     */
    @org.junit.jupiter.api.Test
    void productoReales() {
        Producto.productoReales(2, 3);
        assertEquals(6, 2 * 3, "Debe ser 6");


        Producto.productoReales(-4, 2.5);
        assertEquals(-10, -4 * 2.5, "Debe ser -10");
    }

    /**
     * Test para probar el metodo productoEntero() de la clase Producto.
     * Se prueban dos casos distintos.
     */
    @org.junit.jupiter.api.Test
    void productoEntero() {
        Producto.productoEntero(2, 3);
        assertEquals(6, 2 * 3, "Debe ser 6");


        Producto.productoEntero(10, 3);
        assertEquals(30, 10 * 3, "Debe ser 30");
    }

    /**
     * Test para probar el metodo productoTres() de la clase Producto.
     * Se prueban dos casos distintos.
     */
    @org.junit.jupiter.api.Test
    void productoTres() {
        Producto.productoTres(2, 3, 5);
        assertEquals(30, 2 * 3 * 5, "Debe ser 30");


        Producto.productoTres(5, -5, 5);
        assertEquals(-125, 5 * -5 * 5, "Debe ser -125");
    }

    /**
     * Test para probar el metodo potencia() de la clase Producto.
     * Se prueban dos casos distintos.
     */
    @org.junit.jupiter.api.Test
    void potencia() {
        Producto.potencia(2, 3);
        assertEquals(8, Math.pow(2, 3), "Debe ser 8");


        Producto.potencia(5, 2);
        assertEquals(25, Math.pow(5, 2), "Debe ser 25");
    }



}
