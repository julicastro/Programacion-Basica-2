package Vacunatorio;

import java.util.HashSet;
import java.util.Set;

public class Paciente {

	private String nombre;
	private Integer dni;
	private Set <Vacuna> vacunas = new HashSet<>();
	private Set <Enfermedad> enfermedadesContraidas = new HashSet<>();
	
	public Paciente(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Set<Vacuna> getVacunas() {
		return vacunas;
	}

	public void setVacunas(Set<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public Set<Enfermedad> getEnfermedadesContraidas() {
		return enfermedadesContraidas;
	}

	public void setEnfermedadesContraidas(Set<Enfermedad> enfermedadesContraidas) {
		this.enfermedadesContraidas = enfermedadesContraidas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Paciente other = (Paciente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	public void agregarVacuna(Vacuna vacuna) {
		this.vacunas.add(vacuna);	
	}

	
	
	
	
	
	
	
}
