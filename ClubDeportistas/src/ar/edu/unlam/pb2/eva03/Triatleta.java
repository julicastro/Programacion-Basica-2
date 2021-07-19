package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	private String distanciaPreferida;
	private TipoDeBicicleta tipo;
	private Integer kilometrosEntrenados;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
		this.tipo=tipo;
	}

	public Object getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.tipo;
	}

	public Integer getNumeroDeSocio() {
		return this.numeroDeSocio;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer kilometrosEntrenados) {
		this.kilometrosEntrenados= kilometrosEntrenados;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.kilometrosEntrenados;
	}

	

}
