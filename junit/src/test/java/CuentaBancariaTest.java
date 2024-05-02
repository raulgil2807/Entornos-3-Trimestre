
import es.medac.CuentaBancaria;
import es.medac.Persona;
import es.medac.Main;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    CuentaBancaria cuentabancaria = new CuentaBancaria("AEA245678901234");

    @Test
    public void testAgregarTitular() {
        Persona titular1 = new Persona("Juan", "12345678A", 25);
        assertTrue(titular1.mayorEdad());
        Persona titular2 = new Persona("María", "87654321B", 17); 
        assertFalse(titular2.mayorEdad());
        Persona titular3 = new Persona("Juanito", "123456767A", 18);
        assertTrue(titular3.mayorEdad());
    }

    @Test
    public void testRetirarSaldo(String dniTitular, double cantidad) {
        Persona titular1 = new Persona("Juan", "12345678A", 25);
        assertTrue(titular1.getDni() == "12345678A");
        assertFalse(titular1.getDni() != "12345678A");
        



    }
    
}

