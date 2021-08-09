package ar.edu.unlam.pb2.eva03;

public class Vehiculo {

	private String nombre;
	private int identificador;
	
	
	public Vehiculo(int identificador, String nombre) {
		this.identificador=identificador;
		this.nombre=nombre;
	}
	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getIdentificador() {
		return identificador;
	}


	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identificador;
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
		Vehiculo other = (Vehiculo) obj;
		if (identificador != other.identificador)
			return false;
		return true;
	}

	
	
	
	
	
	
	
}
