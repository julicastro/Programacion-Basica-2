package FuerzasArmadas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FuerzaArmada {

	private Set<Vehiculo> convoy = new HashSet <Vehiculo>();
	private Map<String, Batalla> batallas = new HashMap <String, Batalla>();
	
	
	
	public FuerzaArmada() {
		convoy = new TreeSet<Vehiculo>();
	}
	public void agregarVehiculo(Avion avion) {
		convoy.add(avion);
		
	}
	public void agregarVehiculo(Tanque tanque) {
		convoy.add(tanque);
		
	}
	public void agregarVehiculo(Submarino submarino) {
		convoy.add(submarino);
		
	}
	public void agregarVehiculo(Anfibio anfibio) {
		convoy.add(anfibio);
		
	}
	public void agregarVehiculo(HidroAvion hidroAvion) {
		convoy.add(hidroAvion);
	}
	
	public Object getCapacidadDeDefensa() {
		
		return convoy.size();
	}
	
	public Batalla getBatalla(String nombre) {
		return this.batallas.get(nombre);
	}
		
	public void crearBatalla(Batalla batalla) {
		this.batallas.put(batalla.getNombre(), batalla);
	}
	
	public void eliminarBatalla(String nombre) {
		this.batallas.remove(nombre);
	
	}
	
	public boolean enviarALaBatalla(String string, int i) {
		
		return false;
	}
	
	public void presentarBatalla() {
		// TODO Auto-generated method stub
		
	}


}