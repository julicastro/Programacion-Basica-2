package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Acuatico, Volador {

	private Double altura;
	private Double Profundidad;
	
	public HidroAvion(int identificador, String nombre) {
		super(identificador, nombre);
		this.altura=0.0;
		this.Profundidad=0.0;
	}

	@Override
	public Double getAltura() {
		return this.Altura;
	}

	@Override
	public void setAltura(Double d) {
		this.altura=d;
	}

	@Override
	public Double getProfundidad() {
		return this.Profundidad;
	}

	@Override
	public void setProfundidad(Double d) {
		this.Profundidad=d;
	}

}
