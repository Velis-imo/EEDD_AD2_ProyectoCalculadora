package calculadora;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void productoReales() {
        Producto.productoReales(2,3);
        assertEquals(6,2*3, "Debe ser 6");

        Producto.productoReales(-4,2.5);
        assertEquals(-10,-4*2.5, "Debe ser -10");
    }

    @org.junit.jupiter.api.Test
    void productoEntero() {
        Producto.productoEntero(2,3);
        assertEquals(6,2*3, "Debe ser 6");

        Producto.productoEntero(10,3);
        assertEquals(30,10*3, "Debe ser 30");
    }

    @org.junit.jupiter.api.Test
    void productotres() {
        Producto.productoTres(2,3, 5);
        assertEquals(30,2*3*5, "Debe ser 30");

        Producto.productoTres(5,-5, 5);
        assertEquals(-125,5*-5*5, "Debe ser -125");
    }

    @org.junit.jupiter.api.Test
    void potencia() {
        Producto.potencia(2,3);
        assertEquals(8,Math.pow(2,3), "Debe ser 8");

        Producto.potencia(5,2);
        assertEquals(25,Math.pow(5,2), "Debe ser 25");
    }


}