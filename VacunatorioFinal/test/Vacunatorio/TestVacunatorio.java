package Vacunatorio;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class TestVacunatorio {

	@Test
	public void queSePuedaAgregarPrimeraDosis() throws NoCovidVaccineException, NoMoreVaccineException {
		Vacunatorio vacunatorio = new Vacunatorio("Vacunatorio Messi");
		Paciente paciente1 = new Paciente("Julian Castro", 39347169);
		Set<Paciente> pacientes = new HashSet<>();
		pacientes.add(paciente1);
		vacunatorio.setPacientes(pacientes);
		assertTrue(vacunatorio.darVacunaAPaciente(paciente1, Vacuna.COVID_PRIMERA_DOSIS));
	}

	@Test(expected = NoCovidVaccineException.class)
	public void queSalteExcepcionSiQuierePonerseLaSegundaDosisYNoTieneLaPrimera()
			throws NoCovidVaccineException, NoMoreVaccineException {
		Vacunatorio vacunatorio = new Vacunatorio("Vacunatorio Messi");
		Paciente paciente1 = new Paciente("Julian Castro", 39347169);
		Set<Paciente> pacientes = new HashSet<>();
		pacientes.add(paciente1);
		vacunatorio.setPacientes(pacientes);
		vacunatorio.darVacunaAPaciente(paciente1, Vacuna.COVID_SEGUNDA_DOSIS);
	}

	@Test(expected = NoMoreVaccineException.class)
	public void queSalteExcepcionSiQuierePonerseDosVacunasDistintas()
			throws NoCovidVaccineException, NoMoreVaccineException {
		Vacunatorio vacunatorio = new Vacunatorio("Vacunatorio Messi");
		Paciente paciente1 = new Paciente("Julian Castro", 39347169);
		Set<Vacuna> vacunas = new HashSet<>();
		vacunas.add(Vacuna.HEPATITIS);
		vacunas.add(Vacuna.RUBEOLA);
		paciente1.setVacunas(vacunas);
		Set<Paciente> pacientes = new HashSet<>();
		pacientes.add(paciente1);
		vacunatorio.setPacientes(pacientes);
		vacunatorio.darVacunaAPaciente(paciente1, Vacuna.COVID_PRIMERA_DOSIS);
	}

	@Test
	public void queNoSePuedaPonerLaVacunaDeHepatitisSiYaTuvoLaEnfermedad()
			throws NoCovidVaccineException, NoMoreVaccineException {
		Vacunatorio vacunatorio = new Vacunatorio("Vacunatorio Messi");
		Paciente paciente1 = new Paciente("Julian Castro", 39347169);
		Set<Enfermedad> enfermedades = new HashSet<>();
		enfermedades.add(Enfermedad.HEPATITIS);
		paciente1.setEnfermedadesContraidas(enfermedades);
		Set<Paciente> pacientes = new HashSet<>();
		pacientes.add(paciente1);
		vacunatorio.setPacientes(pacientes);
		assertFalse(vacunatorio.darVacunaAPaciente(paciente1, Vacuna.HEPATITIS));
	}

	@Test
	public void queNoSePuedaPonerLaVacunaDeLaRubeolaSiYaTuvoLaEnfermedad()
			throws NoCovidVaccineException, NoMoreVaccineException {
		Vacunatorio vacunatorio = new Vacunatorio("Vacunatorio Messi");
		Paciente paciente1 = new Paciente("Julian Castro", 39347169);
		Set<Enfermedad> enfermedades = new HashSet<>();
		enfermedades.add(Enfermedad.RUBEOLA);
		paciente1.setEnfermedadesContraidas(enfermedades);
		Set<Paciente> pacientes = new HashSet<>();
		pacientes.add(paciente1);
		vacunatorio.setPacientes(pacientes);
		assertFalse(vacunatorio.darVacunaAPaciente(paciente1, Vacuna.RUBEOLA));
	}

	@Test
	public void queSeOrdenePorDniYPorNombre() throws NoCovidVaccineException, NoMoreVaccineException {
		Vacunatorio vacunatorio = new Vacunatorio("Vacunatorio Messi");
		Paciente p1 = new Paciente("Julian", 91234);
		Paciente p2 = new Paciente("Lionel", 81234);
		Paciente p3 = new Paciente("Angel", 71234);
		Paciente p4 = new Paciente("Rodrigo", 61234);
		Paciente p5 = new Paciente("Leandro", 51234);
		Set<Paciente> pacientes = new HashSet<>();
		pacientes.add(p1);
		pacientes.add(p2);
		pacientes.add(p3);
		pacientes.add(p4);
		pacientes.add(p5);

		for (Paciente paciente : pacientes) {
			vacunatorio.darVacunaAPaciente(paciente, Vacuna.COVID_PRIMERA_DOSIS);
		}

		Paciente[] arrayPacientes = new Paciente[pacientes.size()];
		vacunatorio.getPacientesVacunados().toArray(arrayPacientes);
		assertTrue(arrayPacientes[0].getDni() == 91234);
		assertTrue(arrayPacientes[1].getDni() == 81234);
		assertTrue(arrayPacientes[2].getDni() == 71234);
		assertTrue(arrayPacientes[3].getDni() == 61234);
		assertTrue(arrayPacientes[4].getDni() == 51234);

	}

}
