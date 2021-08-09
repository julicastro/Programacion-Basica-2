package NoHomeros;

import static java.util.Comparator.comparing;

import java.util.TreeSet;

public class Bar {

	private String nombre;
	private TreeSet<Persona> clientes = new TreeSet<>(comparing(Persona::getNombre));
	private Boolean abierto = false;

	public Bar(String nombre) {
		this.setNombre(nombre);
		this.clientes = new TreeSet<Persona>();
	}

	public void abrirBar() {
		this.setAbierto(true);
	}

	public void cerrarBar() {
		if (this.clientes.isEmpty())
			this.setAbierto(false);
	}

	public Integer getCantidadDePersonasPresentes() {
		return this.clientes.size();
	}

	public Boolean agregarCliente(Persona cliente) {
		Boolean agrego = false;
		if (this.abierto == true && !this.clientes.contains(cliente)) {
			this.clientes.add(cliente);
			agrego = true;
		} else {
			agrego = false;
		}
		return agrego;
	}

	public Boolean quitarCliente(Persona cliente) {
		Boolean quito = false;
		if (this.abierto == true) {
			this.clientes.remove(cliente);
			quito = true;
		} else {
			quito = false;
		}
		return quito;
	}

	public Persona buscarCliente(String nombre) {
		Persona clienteABuscar = new Persona(nombre, null);
		for (Persona p : clientes) {
			if (p.equals(clienteABuscar)) {
				return p;
			}
		}
		return null;
	}

	public void ordenarClientesAlfabeticamente() {
		for (Persona p : this.clientes) {
			System.out.println("Paciente -> " + p.getNombre() + ", dni -> " + p.getEdad());
		}
	}

	public TreeSet<Persona> presentarClientesPorEdad() {
		OrdenPorEdad orden = new OrdenPorEdad();
		TreeSet<Persona> ordenados = new TreeSet<Persona>(orden);
		ordenados.addAll(clientes);
		if (this.abierto)
			return ordenados;
		else
			return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Persona> getClientes() {
		return clientes;
	}

	public void setClientes(TreeSet<Persona> clientes) {
		this.clientes = clientes;
	}

	public Boolean getAbierto() {
		return abierto;
	}

	public void setAbierto(Boolean abierto) {
		this.abierto = abierto;
	}

	/*--------------------------------------------------------------*/

}
