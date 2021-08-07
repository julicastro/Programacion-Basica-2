package Colecciones;

public class Alumno implements Comparable <Alumno>{
	
	private String nombre; 
	private Integer edad;
	
	public Alumno(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	

}
