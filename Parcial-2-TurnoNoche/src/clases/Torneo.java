package clases;

import java.util.HashSet;

import java.util.Set;

public class Torneo {

	private String nombre;
	private Set<Miembro> participantes;
	private Set<Partido> partidos;

	public Torneo(String nombre) {
		super();
		this.nombre = nombre;

		this.participantes = new HashSet<>();
		this.partidos = new HashSet<>();
	}

	public void crearPartido(Integer numeroPartido, String nombreEquipoLocal, String nombreEquipoVisitante) {

		
		Set<Jugador> nominaLocal = obtenerJugadoresDeUnEquipo(nombreEquipoLocal);
		Set<Jugador> nominaVistante = obtenerJugadoresDeUnEquipo(nombreEquipoVisitante);
		
				
		Partido partido = new Partido(numeroPartido, nominaLocal, nominaVistante);
		this.partidos.add(partido);

	}

	public Boolean registrarMiembro(Miembro miembro) {
		return this.participantes.add(miembro);

	}

	private Set<Jugador> obtenerJugadoresDeUnEquipo(String nombreEquipo) {

		Set<Jugador> jugadores = new HashSet<>();
		for (Miembro miembro : participantes) {
			if (miembro.getTipo().equals("Jugador") && miembro.getEquipo().equals(nombreEquipo))
				jugadores.add((Jugador) miembro);
		}
		return jugadores;
	}

	public void registrarGol(Integer numeroPartido, Integer numeroCamiseta, String tipoEquipo, Integer minuto)
			throws PartidoNoEncontradoException, JugadorNoEncontradoException {
		Partido partido = buscarPartidoPorNumero(numeroPartido);
		Jugador jugador = null;
		if (tipoEquipo.equals("Local"))
			jugador = buscarJugador(numeroCamiseta, partido.getLocal());

		if (tipoEquipo.equals("Visitante"))
			jugador = buscarJugador(numeroCamiseta, partido.getVisitante());

		partido.registrarGol(jugador, minuto);

	}

	private Jugador buscarJugador(Integer numeroCamiseta, Set<Jugador> plantel) throws JugadorNoEncontradoException {
		for (Jugador jugador : plantel) {
			if (jugador.getNumeroCamiseta().equals(numeroCamiseta))
				return jugador;
		}

		throw new JugadorNoEncontradoException();
	}

	private Partido buscarPartidoPorNumero(Integer numeroPartido) throws PartidoNoEncontradoException {

		for (Partido partido : this.partidos)
			if (partido.getNumeroPartido().equals(numeroPartido)) {
				return partido;
			}

		throw new PartidoNoEncontradoException();
	}

}