package cajaBlanca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
1. Prueba de Cobertura de Sentencias 

Se verifica que todas las instrucciones del código se ejecuten al menos una vez. 
Es el nivel más básico de cobertura y garantiza que no haya líneas de código sin probar.
 */


public class CalculadoraTest {
    @Test
    void testSuma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(2, 3);
        assertEquals(5, resultado); // Se ejecuta la única sentencia del método suma
    }
}
