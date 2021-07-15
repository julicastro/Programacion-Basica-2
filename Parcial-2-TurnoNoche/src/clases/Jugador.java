package clases;

public class Jugador extends Miembro{
	
	public Jugador(String nombre, String equipo, String apellido, Integer dni) {
		super(nombre, equipo, apellido, dni);

	}



	private Integer numeroCamiseta;
	private String posicion;
	
	

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}



	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}



	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Jugador";
	}

}
