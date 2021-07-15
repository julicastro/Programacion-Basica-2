package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Videoclub {
	
	private String nombre;
	private ArrayList<Producto> productos;
	
	public Videoclub(String nombre) {
		this.setNombre(nombre);
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto nuevoProducto) {
		productos.add(nuevoProducto);
	}
	
	public Boolean vender(Producto aVender, Cliente actual) {
		Producto buscado = buscarProducto(aVender);
		
		if(buscado != null && buscado.getEstadoActual() == Estado.DISPONIBLE && buscado instanceof Vendible) {
			buscado.setEstadoActual(Estado.VENDIDO);
			buscado.setQuienPoseeElProducto(actual);
			return true;
		}
		
		return false;
	}
	
	public Producto buscarProducto(Producto aBuscar) {
		for(Producto actual: productos) {
			if(actual.getCodigo().equals(aBuscar.getCodigo())) {
				return actual;
			}
		}
		return null;
	}

	public Boolean alquilar(Producto aAlquilar, Cliente actual) {
		Producto buscado = buscarProducto(aAlquilar);
		
		if(buscado != null && buscado.getEstadoActual() == Estado.DISPONIBLE && buscado instanceof Alquilable) {
			if(((Alquilable)aAlquilar).getEdadMinimaParaAlquilar() <= actual.getEdad()) {
				buscado.setEstadoActual(Estado.ALQUILADO);
				buscado.setQuienPoseeElProducto(actual);
				return true;
			}
		}
		
		return false;
	}
	
	public Boolean devolver(Producto aDevolver) {
		Producto buscado = buscarProducto(aDevolver);
		
		if(buscado != null && buscado.getEstadoActual() == Estado.ALQUILADO && buscado instanceof Alquilable) {
			buscado.setEstadoActual(Estado.DISPONIBLE);
			buscado.setQuienPoseeElProducto(null);
			return true;
		}
		
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
