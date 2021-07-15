package Club;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Club {

	private String nombre;
	private Map<String, Evento> eventos;
	private Set<Participante> participantes;

	public Club(String nombre, Map<String, Evento> participantes, Set participante) {
		this.nombre = nombre;
		this.participantes = new HashSet<Participante>();
		this.eventos = new HashMap<String, Evento>();
	}

	private void crearEvento(Evento evento) {
		this.eventos.put(evento.getNombre(), evento);
	}

	private Evento getEvento(String nombre) {
		return this.eventos.get(nombre);
	}

	private void agregarParticipanteAEvento(String nombreDelParticipante, Participante participante) {
		
		
		
		
		
		
	}

}
