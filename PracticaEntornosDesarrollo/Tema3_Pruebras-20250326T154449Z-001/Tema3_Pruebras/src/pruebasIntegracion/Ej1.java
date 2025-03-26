package pruebasIntegracion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tema3_ejerciciosIntegracion.Ej1_BaseDeDatos;
import tema3_ejerciciosIntegracion.Ej1_ServicioUsuarios;

class Ej1 {
	
	

	@Test
	void conexionUsuarioCorrect() {
		Ej1_BaseDeDatos baseDeDatos = new Ej1_BaseDeDatos();
		assertTrue(baseDeDatos.conectar(), "La conexión con la base de datos debería ser existosa");
	}
	
	@Test
	void registrarYVerificarUsuario() {
		Ej1_BaseDeDatos baseDeDatos = new Ej1_BaseDeDatos();
		Ej1_ServicioUsuarios servicioUsuarios = new Ej1_ServicioUsuarios(baseDeDatos);
		
		String usuario = "Carlos";
		servicioUsuarios.registrarUsuario(usuario);
		
		assertTrue(servicioUsuarios.usuarioRegistrado(usuario), "El usuario debería estar registrado en la base de datos");
	}

}
