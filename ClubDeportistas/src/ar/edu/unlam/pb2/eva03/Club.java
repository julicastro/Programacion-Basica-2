package ar.edu.unlam.pb2.eva03;

import java.util.HashMap; 
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.setNombre(nombre);
		socios = new HashSet<>();
		competencias = new HashMap<String, Evento>();
	}

	public void agregarDeportista(Deportista nuevoDeportista) {
		socios.add(nuevoDeportista);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadSocios() {
		// TODO Auto-generated method stub
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipoEvento, String nombre) {
		Evento nuevoEvento = new Evento(tipoEvento, nombre);
		competencias.put(nombre, nuevoEvento);
	}

	private Evento getEvento(String nombreEvento) {
		return this.competencias.get(nombreEvento);
	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista nombre) throws NoEstaPreparado {
		Evento evento = getEvento(nombreEvento);

		switch (evento.getTipoEvento()) {
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
		case CARRERA_5K:
			if (nombre instanceof ICorredor) {
				return evento.agregarDeportistaAlEvento(nombre);
			} else
				throw new NoEstaPreparado();

		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
		case CARRERA_NATACION_EN_PICINA:
			if (nombre instanceof INadador) {
				return evento.agregarDeportistaAlEvento(nombre);
			} else
				throw new NoEstaPreparado();

		case TRIATLON_IRONMAN:
		case TRIATLON_MEDIO:
		case TRIATLON_OLIMPICO:
		case TRIATLON_SHORT:
			if (nombre instanceof ICiclista && nombre instanceof ICorredor && nombre instanceof INadador) {
				return evento.agregarDeportistaAlEvento(nombre);
			} else
				throw new NoEstaPreparado();
		default:
			break;
		}

		return 0;
	}

}
