package cajaBlanca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
3. Prueba de Cobertura de Caminos Independientes

Este enfoque prueba todos los caminos lógicamente posibles en el código,
cubriendo múltiples combinaciones de condiciones.
 */
public class NumeroTest {
    @Test
    void testEvaluarNumero() {
        Numero numero = new Numero();
        
        assertEquals("Positivo", numero.evaluarNumero(5));  // Camino 1 (num > 0)
        assertEquals("Negativo", numero.evaluarNumero(-3)); // Camino 2 (num < 0)
        assertEquals("Cero", numero.evaluarNumero(0));      // Camino 3 (num == 0)
    }
}

