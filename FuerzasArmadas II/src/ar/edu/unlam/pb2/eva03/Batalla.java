package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	private String nombre;
	
	
	public Batalla(String nombre,TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.latitud=latitud;
		this.longitud=longitud;
		this.vehiculosEnLaBatalla=new HashSet<Vehiculo>();
	}

	
	public void agregarvehiculo(Vehiculo nuevo) {
		vehiculosEnLaBatalla.add(nuevo);
	}
	
	

	public Double getLatitud() {
		return latitud;
	}


	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}


	public Double getLongitud() {
		return longitud;
	}


	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public TipoDeBatalla getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	

	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}



	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
