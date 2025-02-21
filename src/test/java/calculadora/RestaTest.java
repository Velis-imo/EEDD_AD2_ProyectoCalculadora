package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestaTest {

    @BeforeEach
    void setUp() {
    }



    @Test
    void menu() {
    }

    @Test
    void restaReales() {
        Resta.restaReales(2,3);
        assertEquals(6,2*3, "Debe ser 6");

        Producto.productoEntero(10,3);
        assertEquals(30,10*3, "Debe ser 30");
    }

    @Test
    void restaEnteros() {


    }

    @Test
    void restaTresReales() {
    }

    @Test
    void restaAcumulada() {
    }
}