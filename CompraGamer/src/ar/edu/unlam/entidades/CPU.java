package ar.edu.unlam.entidades;

import ar.edu.unlam.interfaces.Overclockeable;

public class CPU extends Componente implements Overclockeable{

	private Double ghz;
		
	public CPU(String nombre, String codigoProducto, Integer precio, Double ghz) {
		super(nombre, codigoProducto, precio);
		this.setGhz(ghz);
	}

	public Double getGhz() {
		return ghz;
	}

	public void setGhz(Double ghz) {
		this.ghz = ghz;
	}

	@Override
	public void duplicarVelocidad() {
		this.setGhz(getGhz()*2);;
	}
	
	
	
	

}
