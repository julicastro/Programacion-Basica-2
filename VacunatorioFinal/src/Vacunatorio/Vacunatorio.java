package Vacunatorio;

import static java.util.Comparator.comparing;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Vacunatorio {

	private String nombre;
	private Set<Paciente> pacientes = new HashSet<>();
	private Set<Paciente> pacientesVacunados = new TreeSet<>(comparing(Paciente::getDni).reversed());

	public boolean darVacunaAPaciente(Paciente paciente, Vacuna vacuna)
			throws NoMoreVaccineException, NoCovidVaccineException {
		boolean tieneMasDeDosVacunasDistintas = paciente.getVacunas().size() > 1
				&& paciente.getVacunas().contains(Vacuna.HEPATITIS)
				&& paciente.getVacunas().contains(Vacuna.RUBEOLA);
		if (tieneMasDeDosVacunasDistintas) {
			throw new NoMoreVaccineException();
		} else {
			if (vacuna == Vacuna.COVID_SEGUNDA_DOSIS
					&& !paciente.getVacunas().contains(Vacuna.COVID_PRIMERA_DOSIS)) {
				throw new NoCovidVaccineException();
			}
		}
		if ((vacuna == Vacuna.HEPATITIS && paciente.getEnfermedadesContraidas().contains(Enfermedad.HEPATITIS))
				|| (vacuna == Vacuna.RUBEOLA && paciente.getEnfermedadesContraidas().contains(Enfermedad.RUBEOLA))) {
			return false;
		} else {
			paciente.agregarVacuna(vacuna);
			pacientesVacunados.add(paciente);
			return true;
		}
	}
	
	public void mostrarPacientesVacunados() {
		for (Paciente paciente : pacientesVacunados) {
			System.out.println("Paciente -> " + paciente.getNombre() + ", dni -> " + paciente.getDni() );
		}
	}
	
	public Vacunatorio(String string) {
		this.setNombre(string);
	}
	
	public void agregarPaciente(Paciente p) {
		this.pacientes.add(p);
	}
	
	public Set<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(Set<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Paciente> getPacientesVacunados() {
		return pacientesVacunados;
	}

	public void setPacientesVacunados(Set<Paciente> pacientesVacunados) {
		this.pacientesVacunados = pacientesVacunados;
	}
	
	
	

}





