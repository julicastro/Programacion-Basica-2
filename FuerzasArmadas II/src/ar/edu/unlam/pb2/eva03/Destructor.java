package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Destructor extends Vehiculo implements Acuatico {

	private Double Profundidad;

	public Destructor(int identificador, String nombre) {
		super(identificador, nombre);
		this.Profundidad = 0.0;

	}

	@Override
	public Double getProfundidad() {
		return this.Profundidad;
	}

	@Override
	public void setProfundidad(Double d) {
		this.Profundidad = d;
	}

}
