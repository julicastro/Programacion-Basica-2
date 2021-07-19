package FuerzasArmadas;

public class Submarino extends Acuatico {
	
	
	private Integer numero;
	private String modelo;
	private Integer profundidad;

	public Submarino(Integer numero, String modelo) {
		super(numero, modelo);
	}


	public Integer getProfundidad() {
		return this.profundidad;
	}

}
