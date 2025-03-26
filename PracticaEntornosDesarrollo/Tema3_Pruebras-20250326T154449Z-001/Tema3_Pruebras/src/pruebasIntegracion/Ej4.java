package pruebasIntegracion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tema3_ejerciciosIntegracion.Ej4_ServicioOrdenes;
import tema3_ejerciciosIntegracion.Ej4_ServicioPagos;

class Ej4 {

	@Test
	void procesarOrdenValido() {

		Ej4_ServicioPagos servicioPagos = new Ej4_ServicioPagos(1500.15);
		Ej4_ServicioOrdenes servicioOrdenes = new Ej4_ServicioOrdenes(servicioPagos);

		double motoOrden = 450.50;

		assertTrue(servicioOrdenes.procesarOrden(motoOrden), "La orden debería procesarse exitosamente");

	}

	@Test
	void procesarOrdenInvalido() {

		Ej4_ServicioPagos servicioPagos = new Ej4_ServicioPagos(150.15);
		Ej4_ServicioOrdenes servicioOrdenes = new Ej4_ServicioOrdenes(servicioPagos);

		double motoOrdenInvalido = -450.50;

		assertFalse(servicioOrdenes.procesarOrden(motoOrdenInvalido),
				"No se debería procesar una orden con monto inválido");

	}
	
	@Test
    void saldoInsuficiente() {
        
        Ej4_ServicioPagos servicioPagos = new Ej4_ServicioPagos(300.0);

        Ej4_ServicioOrdenes servicioOrdenes = new Ej4_ServicioOrdenes(servicioPagos);

        double montoOrden = 500.0;

        assertFalse(servicioOrdenes.procesarOrden(montoOrden), "La orden no debería procesarse por saldo insuficiente");
    }

}
