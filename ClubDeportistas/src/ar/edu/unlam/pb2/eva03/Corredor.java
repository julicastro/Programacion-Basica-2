package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{

	private Integer kilometrosEntrenados;
	private Integer distanciaPreferida;

	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer kilometrosEntrenados) {
		this.kilometrosEntrenados= kilometrosEntrenados;	
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return this.kilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return this.distanciaPreferida;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numeroDeSocio;
	}

}
