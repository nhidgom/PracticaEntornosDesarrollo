package pruebasIntegracion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tema3_ejerciciosIntegracion.Ej2_ServicioEnvio;
import tema3_ejerciciosIntegracion.Ej2_ServicioPedido;

class Ej2 {

	@Test
	void verificarPedido() {
		Ej2_ServicioEnvio servicioEnvio = new Ej2_ServicioEnvio();
		Ej2_ServicioPedido servicioPedido = new Ej2_ServicioPedido(servicioEnvio);
		
		String pedido = "Pedido 123";
		
		assertTrue(servicioPedido.crearYEnviarPedido(pedido), "El pedido debería de crearse y enviarse correctamente");
	}

}
