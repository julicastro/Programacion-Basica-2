package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.Map;


import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	
	private TipoDeEvento tipoEvento;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	private String nombre;
	
	public Evento(TipoDeEvento tipoEvento, String nombre) {
		this.setTipoEvento(tipoEvento);
		this.setNombre(nombre);
		participantes= new HashMap<Integer, Deportista>();
		this.numeroDeInscripcion=0;
	}

	public TipoDeEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoDeEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer agregarDeportistaAlEvento(Deportista nuevoDeportista) {
		numeroDeInscripcion++;
		participantes.put(numeroDeInscripcion, nuevoDeportista);
		return numeroDeInscripcion;
		
	}

	
	
}
