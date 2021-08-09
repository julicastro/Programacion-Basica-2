package NoHomeros;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private Integer edad;

	public Persona(String nombre, Integer edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
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
	public int compareTo(Persona otra) {
		return this.nombre.compareTo(otra.nombre);
	}
	
	public String compararClientes(Persona p2) {
		if(this.edad.compareTo(p2.edad)==0) return this.getNombre()+ "es mayor que" + p2.getNombre() ;
		if(this.edad.compareTo(p2.edad)==1) return p2.getNombre()+ "es mayor que" + this.getNombre() ;
		return null;			
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	

}

