package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Camion extends Vehiculo implements Terrestre{

	private Double velocidad;
	
	public Camion(int identificador, String nombre) {
		super(identificador, nombre);
		this.velocidad=0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public void setVelocidad(Double d) {
		this.velocidad=d;
	}

}
