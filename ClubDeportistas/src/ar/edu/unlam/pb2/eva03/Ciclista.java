package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista{

	private String tipoBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, String tipoBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoBicicleta=tipoBicicleta;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numeroDeSocio;
	}

	public String getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return this.tipoBicicleta;
	}

}
