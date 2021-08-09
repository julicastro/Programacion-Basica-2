package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;
	
	public Submarino(int identificador, String nombre) {
		super(identificador, nombre);
		this.profundidad=0.0;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public void setProfundidad(Double d) {
		this.profundidad=d;
	}

}
