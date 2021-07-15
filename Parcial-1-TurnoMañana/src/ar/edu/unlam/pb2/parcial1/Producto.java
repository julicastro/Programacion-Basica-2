package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Producto {
	private Integer codigo;
	private String descripcion;
	private Estado estadoActual;
	private Cliente quienPoseeElProducto;
	
	public Producto(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.estadoActual = Estado.DISPONIBLE;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Cliente getQuienPoseeElProducto() {
		return this.quienPoseeElProducto;
	}
	
	public void setQuienPoseeElProducto(Cliente quienPoseeElProducto) {
		this.quienPoseeElProducto = quienPoseeElProducto;
	}

	public Estado getEstadoActual() {
		return this.estadoActual;
	}

	public void setEstadoActual(Estado estadoActual) {
		this.estadoActual = estadoActual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
