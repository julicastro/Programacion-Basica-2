package FuerzasArmadas;

public abstract class Vehiculo {

	private Integer numero;
	private String modelo;
	private Integer velocidad;
	
	

	public Vehiculo(Integer numero, String modelo) {
		
		this.numero = numero;
		this.modelo = modelo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}
	
}
