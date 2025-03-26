package cajaBlanca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


/*
2. Prueba de Cobertura de Decisiones (Ramas)

Evalúa si todas las ramas de las estructuras de control (if, else, switch) 
han sido ejecutadas al menos una vez.
 */

public class NumeroParTest {
    @Test
    void testEsPar() {
        NumeroPar numero = new NumeroPar();
        
        assertEquals("Par", numero.esPar(4));   // Evalúa la rama del if
        assertEquals("Impar", numero.esPar(3)); // Evalúa la rama del else
    }
}
