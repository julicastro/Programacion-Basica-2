package FuerzasArmadas;

public class Avion extends Volador {
	
	private Integer numero;
	private String modelo;

	public Avion(Integer numero, String modelo) {
		super(numero, modelo);
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
	
	

	

}
