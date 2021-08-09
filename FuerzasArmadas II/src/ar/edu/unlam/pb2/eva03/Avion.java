package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Avion extends Vehiculo implements Volador {

	private Double Altura;
	
	public Avion(int identificador, String nombre) {
		super(identificador, nombre);
		this.Altura=0.0;
	}

	@Override
	public Double getAltura() {
		return this.Altura;
	}

	@Override
	public void setAltura(Double d) {
		this.Altura=d;
	}



	
	
}
