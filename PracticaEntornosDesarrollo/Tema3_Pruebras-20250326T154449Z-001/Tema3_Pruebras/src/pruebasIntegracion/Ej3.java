package pruebasIntegracion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tema3_ejerciciosIntegracion.Ej3_BaseDeDatosProductos;
import tema3_ejerciciosIntegracion.Ej3_GestorProductos;

class Ej3 {

	@Test
	void registrarProductoValido() {
		Ej3_BaseDeDatosProductos listaProductos = new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos gestorProductos = new Ej3_GestorProductos(listaProductos);
		
		String producto = "Producto1";
		
		assertTrue(gestorProductos.registrarProducto(producto), "El producto debería resgistrarse correctamente");
		assertTrue(gestorProductos.productoRegistrado(producto), "El producto debería estar en la base de datos");
	}
	
	@Test
	void registrarProductoInvalido() {
		Ej3_BaseDeDatosProductos listaProductos = new Ej3_BaseDeDatosProductos();
		Ej3_GestorProductos gestorProductos = new Ej3_GestorProductos(listaProductos);
		
		String producto = " ";
		
		assertTrue(gestorProductos.registrarProducto(producto), "El producto no debería resgistrarse");
		assertTrue(gestorProductos.productoRegistrado(producto), "El producto no debería estar en la base de datos");
	}

}
