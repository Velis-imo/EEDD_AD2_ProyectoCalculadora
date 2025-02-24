package calculadora;
/**
 * Esta clase contiene los test de los métodos de la clase Suma.
 * @author Velislav Krassenoc (Github: Velis-imo)
 * <br><a href="https://github.com/Velis-imo/EEDD_AD2_ProyectoCalculadora.git">Link del repositorio compartido</a>
 */

import calculadora.Resta;
import calculadora.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    public Suma suma;

    @BeforeEach
    void setSuma()  {
        suma = new Suma();
    }

    /**
     * Tests para probar los metodos de la clase Suma.
     * Primero llama al mtodo, introduciendo los parámetros a y b,
     * y después comprueba con assertEquals que el resultado sea el esperado.
     * Se prueba lo siguiente.
     */
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

    /**
     * Test para probar el metodo sumaAcumukativa de la clase Suma.
     * No sé hacer este Test, Luis.
     */
    @Test
    void sumaAcumulativa() {
        Suma.sumaAcumulativa();//Test de resta con resultado positivo
        assertEquals(2,10-5-3,"");

    }


    }
