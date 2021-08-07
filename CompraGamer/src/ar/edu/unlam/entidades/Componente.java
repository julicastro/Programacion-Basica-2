package ar.edu.unlam.entidades;

public abstract class Componente {

	private String nombre;
	private String codigoProducto;
	private Integer precio;
	
	public Componente(String nombre, String codigoProducto, Integer precio) {
		this.nombre = nombre;
		this.codigoProducto = codigoProducto;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProducto == null) ? 0 : codigoProducto.hashCode());
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
		Componente other = (Componente) obj;
		if (codigoProducto == null) {
			if (other.codigoProducto != null)
				return false;
		} else if (!codigoProducto.equals(other.codigoProducto))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
