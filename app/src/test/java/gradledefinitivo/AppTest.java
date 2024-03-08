/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradledefinitivo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App(null);
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
 
     @Test
    void testEliminarLibro() {
        //inicioMap
        Map<String, String> gestorDeLibros = new HashMap<>();
        gestorDeLibros.put("Patrick rothfus ", "Name of wind");
        App app = new App(gestorDeLibros);

        //assertNotNull(gestorDeLibros.get("Patrick rothfus"));

        //elimianmos 
        Map<String, String> resultado = app.eliminarLibro("Patrick rothfus", "Name of wind");

        //verifiamos que sea null y pilamos el hashmap el key A
        assertEquals(null, resultado.get("Patrick rothfus"));
    }
}
