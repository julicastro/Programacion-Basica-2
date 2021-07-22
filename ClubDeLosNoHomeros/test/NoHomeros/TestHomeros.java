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
		Cliente c1 = new Cliente("Julian", 25);
		Cliente c2 = new Cliente("Julian", 25);
		assertEquals(c1.getNombre(), c2.getNombre());
	}
	
	@Test
	public void queSePuedaBuscarUnClientePorSuNombre() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Julian", 25);
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
	
	@Test
	public void queSePuedanOrdenarClientesAlfabeticamente() throws ClienteNoEncontradoException {
		Bar bar = new Bar("Bar de Homero");
		Cliente c1 = new Cliente("Ag", 15);
		Cliente c2 = new Cliente("Br", 11);
		Cliente c3 = new Cliente("Cr", 19);
		Cliente c4 = new Cliente("Dl", 22);
		Cliente c5 = new Cliente("Fp", 18);
		bar.abrir();
		bar.agregarClienteAlBar(c1);
		bar.agregarClienteAlBar(c2);
		bar.agregarClienteAlBar(c3);
		bar.agregarClienteAlBar(c4);
		bar.agregarClienteAlBar(c5);
		bar.ordenarClientesAlfabeticamente();
		
		assertEquals(c1,c1);
		
	}

	
	
	
	
	
	
	
	
	
}
