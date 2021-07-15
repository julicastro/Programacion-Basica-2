package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Producto implements Alquilable{
	
	private TipoDeConsola tipo;
	private Double precioAlquiler;
	private Integer edadMinimaParaAlquilar;
	
	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipo) {
		super(codigo, descripcion);
		this.tipo = tipo;
		this.edadMinimaParaAlquilar = 0;
	}

	public TipoDeConsola getTipo() {
		return this.tipo;
	}
	


	@Override
	public Double getPrecioAlquiler() {
		return this.precioAlquiler;
	}

	@Override
	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	public void setEdadMinimaParaAlquilar(Integer edadMinimaParaAlquilar) {
		this.edadMinimaParaAlquilar = edadMinimaParaAlquilar;
	}
	
	public Integer getEdadMinimaParaAlquilar() {
		return this.edadMinimaParaAlquilar;
	}

}
