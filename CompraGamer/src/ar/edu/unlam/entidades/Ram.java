package ar.edu.unlam.entidades;

public class Ram extends Componente{

	private Integer mhz;
	
	public Ram(String nombre, String codigoProducto, Integer precio, Integer mhz) {
		super(nombre, codigoProducto, precio);
		this.setMhz(mhz);
	}

	public Integer getMhz() {
		return mhz;
	}

	public void setMhz(Integer mhz) {
		this.mhz = mhz;
	}
	
	
	

}
