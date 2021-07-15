package FuerzasArmadas;

public class Anfibio extends Vehiculo {

	private Integer numero;
	private String modelo;
	private Integer velocidad;
	private Integer profundidad;

	public Anfibio(Integer numero, String modelo) {
		super(numero, modelo);
	}

	public Integer getVelocidad() {
		return this.velocidad;
	}

	public Integer getProfundidad() {
		return this.profundidad;
	}

}
