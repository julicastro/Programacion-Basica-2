package Club;

public abstract class Participante {

	private String nombre;
	private Integer codigo;
	private String disiplina;
	
	public Participante(String nombre, Integer codigo, String disiplina) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.disiplina = disiplina;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDisiplina() {
		return disiplina;
	}

	public void setDisiplina(String disiplina) {
		this.disiplina = disiplina;
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
		Participante other = (Participante) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", codigo=" + codigo + ", disiplina=" + disiplina + "]";
	}
	
	
	
	
	
	
}
