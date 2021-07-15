package FuerzasArmadas;

public class HidroAvion extends Vehiculo{

	private Integer altitud;
	private Integer profundidad;
	private double altura;

	public HidroAvion(Integer numero, String modelo) {
		super(numero, modelo);
	}

	public Integer getAltitud() {
		return this.altitud;
	}

	public Integer getProfundidad() {
		return this.profundidad;
	}

	public double getAltura() {
		return this.altura;
	}

	

}
