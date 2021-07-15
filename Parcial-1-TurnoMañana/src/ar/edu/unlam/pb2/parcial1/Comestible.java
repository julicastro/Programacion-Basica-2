package ar.edu.unlam.pb2.parcial1;

public class Comestible extends Producto implements Vendible{
	
	private Double precioVenta;
	
	public Comestible(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.precioVenta = 0.0;
	}

	@Override
	public Double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.precioVenta;
	}

	@Override
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
		
	}

}
