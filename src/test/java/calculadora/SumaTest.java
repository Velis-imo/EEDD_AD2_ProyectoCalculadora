package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    public Suma suma;

    @BeforeEach
    void setSuma()  {
        suma = new Suma();
    }

    @Test
    void suma2enteros() {
        Suma.suma2enteros(2.5,5);
        assertEquals(4,2+2, "la suma debe ser 4");
    }

    @Test
    void suma2reales() {
        Suma.suma2reales(2.5,2.5);
        assertEquals(5, 2.5 + 2.5, "La suma deberia ser 5");
    }

    @Test
    void suma3reales() {
        Suma.suma3reales(6,2, 2);
        assertEquals(6, 2+2+2, "la suma deberia ser 6" );
    }

    @Test
    void sumaAcumulativa() {

    }


    }
