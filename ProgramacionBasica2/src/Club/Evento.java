package Club;

import java.util.HashMap;
import java.util.Map;

public class Evento {

	private String nombre;
	private Integer numeroInscripcion;
	private TipoDeEvento tipoDeEvento;
	private Map<Integer, Participante> participantes;

	public Evento(String nombre, TipoDeEvento tipoDeEvento) {
		this.nombre = nombre;
		this.tipoDeEvento = tipoDeEvento;
		this.participantes = new HashMap<Integer, Participante>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumeroInscripcion() {
		return numeroInscripcion;
	}

	public void setNumeroInscripcion(Integer numeroInscripcion) {
		this.numeroInscripcion = numeroInscripcion;
	}

	public TipoDeEvento getTipoDeEvento() {
		return tipoDeEvento;
	}

	public void setTipoDeEvento(TipoDeEvento tipoDeEvento) {
		this.tipoDeEvento = tipoDeEvento;
	}

	public Map<Integer, Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Map<Integer, Participante> participantes) {
		this.participantes = participantes;
	}

	public Integer agregarDeportista(Participante participante) {
		participantes.put(numeroInscripcion, participante);
		return numeroInscripcion++;	
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
		Evento other = (Evento) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
	
}
