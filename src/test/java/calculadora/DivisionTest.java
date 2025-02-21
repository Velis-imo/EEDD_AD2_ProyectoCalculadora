package calculadora;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }



    @org.junit.jupiter.api.Test
    void procesarOpcion1() {
        Division.procesarOpcion1(double 4, double 2);
        assertEquals(6,2*3, "Debe ser 6");

        Producto.productoEntero(10,3);
        assertEquals(30,10*3, "Debe ser 30");
    }

    @org.junit.jupiter.api.Test
    void procesarOpcion2() {
    }

    @org.junit.jupiter.api.Test
    void procesarOpcion3() {
    }

    @org.junit.jupiter.api.Test
    void calcularRaiz4() {
    }

    @org.junit.jupiter.api.Test
    void pintarMenu() {
    }
}