package FuerzasArmadas;

public class Terrestre extends Vehiculo {

	public Terrestre(Integer numero, String modelo) {
		super(numero, modelo);
	}

	private Integer velocidad;

	public Integer getVelocidad() {

		return this.velocidad;
	}

}
