import es.medac.CuentaBancaria;
import es.medac.Persona;
import es.medac.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    

     @Test
    public void testGetNombre() {
        Persona titular1 = new Persona("Juan", "12345678A", 25);
        assertTrue(titular1.getNombre() == "Juan");  
        assertFalse(titular1.getNombre() != "Juan");
    }
    public void testGetDni() {
        Persona titular1 = new Persona("Juan", "12345678A", 25);
        assertTrue(titular1.getDni() == "12345678A");  
        assertFalse(titular1.getDni() != "12345678A");
    }
    public void testGetEdad() {
        Persona titular1 = new Persona("Juan", "12345678A", 25);
        assertTrue(titular1.getEdad() == 25);  
        assertFalse(titular1.getEdad() != 25);
    }
    public void testMayorEdad() {
        Persona titular1 = new Persona("Juan", "12345678A", 25);
        assertTrue(titular1.mayorEdad());
        Persona titular2 = new Persona("María", "87654321B", 13);
        assertFalse(titular2.mayorEdad());
        
    }
}


