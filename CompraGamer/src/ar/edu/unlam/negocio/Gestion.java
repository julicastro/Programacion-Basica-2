package ar.edu.unlam.negocio;

import java.util.*;
import ar.edu.unlam.entidades.Cliente;
import ar.edu.unlam.entidades.Componente;
import ar.edu.unlam.excepciones.ComponenteNoEncontradoException;

public class Gestion {

	private Set<Componente> stock = new HashSet<>();
	private List<Componente> carrito = new ArrayList<>();
	private Cliente cliente;

	public void agregarComponente(Componente componente) {
		this.stock.add(componente);
	}
	
	public void agregarAlCarro(Componente compAComprar) throws ComponenteNoEncontradoException {
		for (Componente c : stock) {
			if(c.equals(compAComprar)) {
				this.stock.remove(compAComprar);
				this.carrito.add(compAComprar);
				this.cliente.setComponentes(carrito);
			}
		}
	}

}
