package ar.edu.unlam.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private Integer dni;
	private Double dinero;
	private List<Componente> componentes = new ArrayList<>();

	public Cliente(String nombre, Integer dni, Double dinero) {
		this.nombre = nombre;
		this.dni = dni;
		this.dinero = dinero;
	}

	public void comprar(Componente componente) {
		if (componente.getPrecio() <= this.dinero) {
			this.componentes.add(componente);
		}
	}

	public void mostrarCompra() {
		for (int i = 0; i < this.componentes.size(); i++) {
			if (this.componentes.get(i) != null) {
				System.out.println("Componentes: " + this.componentes.get(i));
			}

		}
	}

	// Getter & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Double getDinero() {
		return dinero;
	}

	public void setDinero(Double dinero) {
		this.dinero = dinero;
	}

	public List<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}

	// @Override

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", dinero=" + dinero + ", componentes=" + componentes
				+ "]";
	}

}
