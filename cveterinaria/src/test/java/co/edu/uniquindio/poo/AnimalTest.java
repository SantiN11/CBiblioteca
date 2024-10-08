/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class AnimalTest {

    @Test
    public void testPerro() {
        Perro perro = new Perro("Roco", 3, 12.5, "Husky", "Santi");
        assertEquals("Labrador", perro.getRaza());
        assertEquals("Juan", perro.getDueño());
        assertEquals(3, perro.edad);
        assertEquals(12.5, perro.peso);
    }

    @Test
    public void testGato() {
        Gato gato = new Gato("Niña", 2, 4.0, "Gris y amarillo");
        assertEquals("Gris", gato.getColorPelaje());
        assertEquals(2, gato.edad);
        assertEquals(4.0, gato.peso);
    }

    @Test
    public void testAguila() {
        Aguila aguila = new Aguila("Águila Calva ", 5, 6.0, 2.1);
        assertEquals(2.1, aguila.getEnvergaduraAlas());
        assertEquals(5, aguila.edad);
        assertEquals(6.0, aguila.peso);
    }

    @Test
    public void testLeon() {
        Leon leon = new Leon("Simba", 7, 190.0, "Grande");
        assertEquals("Grande", leon.getMelena());
        assertEquals(7, leon.edad);
        assertEquals(190.0, leon.peso);
    }
}
