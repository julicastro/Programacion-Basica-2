package clases;

public abstract class Miembro {

	private String nombre;
	private String equipo;
	private String apellido;
	
	public Miembro(String nombre, String equipo, String apellido, Integer dni) {
		
		this.nombre = nombre;
		this.equipo = equipo;
		this.apellido = apellido;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	private Integer dni;
	
	public abstract String getTipo();
	
	
	
	
}
