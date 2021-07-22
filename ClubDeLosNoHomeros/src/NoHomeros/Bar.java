package NoHomeros;

import java.util.*;

import Excepciones.ClienteNoEncontradoException;

public class Bar {

	private String nombre;
	private LinkedList <Cliente> clientes = new LinkedList<>(); 
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
			seAgrego = false;
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
					seElimino = true;
					break;
				}
			}
		}
		return seElimino;
	}
	
	public void ordenarClientesAlfabeticamente() {
		for (Cliente c : clientes) {
			System.out.println("Nombre = " + c.getNombre() + ", Edad = " + c.getEdad());
		}
	}
	
	public void ordenarAlfabeticamente() {
		for (Cliente c : clientes) {
			System.out.println(c.getNombre());
		}
	}
	
	/*
	public LinkedList <Cliente> ordenarClientesPorEdad() {
		return Collections.sort((List<T>) this.clientes); 

	}
	*/	
	
	// Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstaAbierto() {
		return estaAbierto;
	}

	public void setEstaAbierto(Boolean estaAbierto) {
		this.estaAbierto = estaAbierto;
	}

	public void setClientes(LinkedList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public LinkedList<Cliente> getClientes() {
		return clientes;
	}

	

}
