package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Producto implements Vendible, Alquilable{
	
	private Double precioAlquiler;
	private Double precioVenta;
	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private ArrayList<String> actores;
	private Integer edadMinimaParaAlquilar;

	public Pelicula(Integer codigo, String descripcion, Genero genero,
			Integer anoDeEstreno, String director) {
		super(codigo, descripcion);
		this.genero = genero;
		this.anoDeEstreno = anoDeEstreno;
		this.director = director;
		actores = new ArrayList<String>();
		this.edadMinimaParaAlquilar = 0;
	}

	public void agregarActor(String nombreActor) {
		actores.add(nombreActor);
	}

	@Override
	public Double getPrecioVenta() {
		return this.precioVenta;
	}

	@Override
	public Double getPrecioAlquiler() {
		return this.precioAlquiler;
	}
	
	@Override
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	public Boolean actua(String nombre) {
		for(String actor: actores) {
			if(actor.equals(nombre)) {
				return true;
			}
		}
		return false;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public ArrayList<String> getActores() {
		return actores;
	}

	public void setActores(ArrayList<String> actores) {
		this.actores = actores;
	}
	
	public void setEdadMinimaParaAlquilar(Integer edadMinimaParaAlquilar) {
		this.edadMinimaParaAlquilar = edadMinimaParaAlquilar;
	}
	
	public Integer getEdadMinimaParaAlquilar() {
		return this.edadMinimaParaAlquilar;
	}
}
