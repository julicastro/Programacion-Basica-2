package NoHomeros;

import static org.junit.Assert.*;

import org.junit.Test;

import Excepciones.ClienteNoEncontradoException;

public class TestHomeros {

	@Test
	public void queNoDejeIngresarClientesSiElBarEstaCerrado() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Julian", 25);
		assertFalse(bar.agregarClienteAlBar(c1));
	}

	@Test
	public void quePermitaCerrarElBarSoloSiEsteEstaVacio() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Julian", 25);
		bar.abrir();
		bar.agregarClienteAlBar(c1);
		bar.cerrar();
		assertTrue(bar.getEstaAbierto());
	}
	
	@Test
	public void queNoHayaDosClientesIguales() {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Julian", 25);
		Cliente c2 = new Cliente("Julian", 25);
		assertEquals(c1.getNombre(), c2.getNombre());
	}
	
	@Test
	public void queSePuedaBuscarUnClientePorSuNombre() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Julian", 25);
		Cliente c2 = new Cliente("Julian", 25);
		bar.abrir();
		bar.agregarClienteAlBar(c1);
		assertTrue(bar.buscarCliente("Julian"));
	}
	
	@Test
	public void queNoPuedanIngresarDosClientesConElMismoNombre() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Julian", 25);
		Cliente c2 = new Cliente("Julian", 44);
		bar.abrir();
		bar.agregarClienteAlBar(c1);
		assertFalse(bar.agregarClienteAlBar(c2));
	}
	
	@Test
	public void queSePuedaEliminarUnCliente() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Julian", 25);
		bar.abrir();
		bar.agregarClienteAlBar(c1);
		assertTrue(bar.quitarCliente(c1));

	}
	
	
	
}
