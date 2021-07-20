package NoHomeros;

import java.util.*;

import Excepciones.ClienteNoEncontradoException;

public class Bar {

	private String nombre;
	private List <Cliente> clientes = new ArrayList<>(); 
	private Boolean estaAbierto = false;

	
	public Bar(String nombre) {
		this.nombre = nombre;
	}

	public void abrir() {
		if(this.estaAbierto==false) {
			this.estaAbierto = true;
		}
	}

	public void cerrar() {
		if(this.clientes.size()==0 && this.estaAbierto == true) {
			this.estaAbierto = false;
		}	
	}
	
	public Boolean agregarClienteAlBar(Cliente cliente) throws ClienteNoEncontradoException {
		Boolean seAgrego = false;
		Boolean encontro = buscarCliente(cliente.getNombre());
		if(this.estaAbierto==true && encontro == false) {
			this.clientes.add(cliente);
			seAgrego = true;
		}else {
			seAgrego = false; // ACA VA LA EXCEPCION
		}
		return seAgrego;
	}
	
	public Boolean buscarCliente(String nombreABuscar) throws ClienteNoEncontradoException {
		Boolean encontro = false;
		for (int i = 0; i < this.clientes.size(); i++) {
			if(this.clientes.get(i).getNombre().equals(nombreABuscar)) {
				encontro = true;
			}else {
				throw new ClienteNoEncontradoException();
			}
		}
		return encontro;
	}
	
	public Boolean quitarCliente(Cliente cliente) throws ClienteNoEncontradoException {
		Boolean seElimino = false;
		Boolean encontro = buscarCliente(cliente.getNombre());
		if(this.estaAbierto==true && encontro == true) {
			for (int i = 0; i < this.clientes.size(); i++) {
				if(this.clientes.get(i).equals(cliente)) {
					this.clientes.remove(i);
					break;
				}
			}
			seElimino = true;
		}
		return seElimino;
	}
	
	
	
	
	
	
	
	
	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Boolean getEstaAbierto() {
		return estaAbierto;
	}

	public void setEstaAbierto(Boolean estaAbierto) {
		this.estaAbierto = estaAbierto;
	}


}
