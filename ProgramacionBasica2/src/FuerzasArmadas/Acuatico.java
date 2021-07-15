package FuerzasArmadas;

public class Acuatico extends Vehiculo{

	public Acuatico(Integer numero, String modelo) {
		super(numero, modelo);
	}

	private Integer profundidad;

	public Integer getProfundidad() {
		
		return this.profundidad;
	}

}
