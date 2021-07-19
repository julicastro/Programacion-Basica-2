package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{

	private String estiloPreferido;

	public Nadador(Integer numeroDeSocio, String nombre, String estiloPreferido) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido=estiloPreferido;
		
	}

	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return this.estiloPreferido;
	}

	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numeroDeSocio;
	}

}
