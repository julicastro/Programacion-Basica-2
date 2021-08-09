package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}

	public void agregarVehiculo(Vehiculo v) {
		this.convoy.add(v);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String s, TipoDeBatalla tipo, Double la, Double lo) {
		batallas.put(s, new Batalla(s, tipo, la, lo));
	}

	public Batalla getBatalla(String string) {

		return batallas.get(string);
	}

	public Vehiculo buscarvehiculo(int i) {
		for (Vehiculo x : convoy) {
			if ((x.getIdentificador().equals(i))==true) {
				return x;
			} 
		}
		return null;
	}
	
	
	
	public boolean enviarALaBatalla(String string, int i) throws VehiculoInexistente, VehiculoIncompatible {
		Boolean estado = false;
		Batalla batalla = batallas.get(string);// identifica
		TipoDeBatalla tipo = batalla.getTipo();
		Vehiculo vehiculo=null;
		
		if(buscarvehiculo(i)!=null) {
			vehiculo=buscarvehiculo(i);
		}
		else {
			throw new VehiculoInexistente("Vehiculo inexistente");
		}


		switch (tipo) {
		case TERRESTRE:
			if (vehiculo instanceof Terrestre) {
				batalla.agregarvehiculo(vehiculo);
				estado = true;
			} else {
				throw new VehiculoIncompatible("No es un vehiculo terrestre");
			}
			break;
		case NAVAL:
			if (vehiculo instanceof Acuatico) {
				batalla.agregarvehiculo(vehiculo);
				estado = true;
			} else {
				throw new VehiculoIncompatible("No es un vehiculo acuatico");
			}
			break;
		case AEREA:
			if (vehiculo instanceof Volador) {
				batalla.agregarvehiculo(vehiculo);
				estado = true;
			} else {
				throw new VehiculoIncompatible("No es un vehiculo volador");
			}
			break;
		}
		return estado;
	}

}
