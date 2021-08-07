package proyecto;

public class Lider extends Personaje implements PoderDuplicable{

	private String nombre;
	
	public Lider(Integer poder, Color color, String nombre) {
		super(poder, color);
		this.setNombre(nombre);
	}

	@Override
	public void duplicarPoder() {
		this.setPoder(this.getPoder()*2);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
