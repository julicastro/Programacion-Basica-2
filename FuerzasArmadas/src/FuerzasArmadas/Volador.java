package FuerzasArmadas;

public class Volador extends Vehiculo{

	public Volador(Integer numero, String modelo) {
		super(numero, modelo);
	}

	private Integer altura;

	public Integer getAltura() {
		return this.altura;
	}

}
