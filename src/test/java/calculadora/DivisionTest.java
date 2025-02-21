package calculadora;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }



    @org.junit.jupiter.api.Test
    void procesarOpcion1() {
        Division.procesarOpcion1( 4, 0);
        assertEquals(0,4/2, "Espero que pete");
        //Espero que pete al dividir entre 0

        Division.procesarOpcion1(-9,3);
        assertEquals(-3,-9/3, "Debe ser -3");
        //Espero que el resultado sea -3 ya que un número es negativo
    }

    @org.junit.jupiter.api.Test
    void procesarOpcion2() {
        Division.procesarOpcion2( 4, 2);
        assertEquals(2,4/2, "Debe ser 2");
        //Sencillo y para toda la familia

        Division.procesarOpcion2(2.5, 1);
        assertEquals(0,2.5/1, "Espero que pete");
        //Al set int, debe petar al meter double
    }

    @org.junit.jupiter.api.Test
    void procesarOpcion3() {
        Division.procesarOpcion3(4);
        assertEquals(0.25,1/4, "Debe ser 0.25");
        //Sencillo y para toda la familia

        Division.procesarOpcion3(2.5);
        assertEquals(0.5,1/2.5, "Espero que pete");
        //Al ser int, debe petar al meter double
    }

    @org.junit.jupiter.api.Test
    void calcularRaiz4() {
        Division.calcularRaiz4(4);
        assertEquals(2,Math.sqrt(4), "Debe ser 2");
        //Sencillo y para toda la familia

        Division.calcularRaiz4(-9);
        assertEquals(-3,Math.sqrt(-9), "Espero que pete");
        //Al ser negativo, debe petar al hacer la raiz cuadrada

    }


}