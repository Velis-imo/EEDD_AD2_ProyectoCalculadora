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
    void suma2Enteros() {
        Suma.suma2Enteros(2,5);
        assertEquals(4,2+2, "la suma debe ser 4");
    }

    @Test
    void suma2Reales() {
        Suma.suma2Reales(2.5,2.5);
        assertEquals(5, 2.5 + 2.5, "La suma deberia ser 5");
    }

    @Test
    void suma3Reales() {
        Suma.suma3Reales(6,2, 2);
        assertEquals(6, 2+2+2, "la suma deberia ser 6" );
    }

    @Test
    void sumaAcumulativa() {

    }


    }
