package ar.edu.unlam.entidades;

public class Mother extends Componente{

	private Integer mhzRamSoportada;
	
	public Mother(String nombre, String codigoProducto, Integer precio, Integer mhzRamSoportada) {
		super(nombre, codigoProducto, precio);
		this.setMhzRamSoportada(mhzRamSoportada);
	}

	public Integer getMhzRamSoportada() {
		return mhzRamSoportada;
	}

	public void setMhzRamSoportada(Integer mhzRamSoportada) {
		this.mhzRamSoportada = mhzRamSoportada;
	}
	
	
	
	

}
