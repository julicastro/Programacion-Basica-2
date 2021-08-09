package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico{
	
	private Double profundidad;
	private Double Velocidad;

	public Anfibio(int identificador, String nombre) {
		super(identificador, nombre);
		this.Velocidad=0.0;
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

	@Override
	public Double getVelocidad() {
		return this.Velocidad;
	}

	@Override
	public void setVelocidad(Double d) {
		this.Velocidad=d;
		
	}

}
