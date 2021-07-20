package clases;

import java.util.Set;
import java.util.TreeSet;

public class Partido {
	
	private Set<Jugador> local;
	private Set<Jugador> visitante;
	private Integer numeroPartido;
	private Set <Gol> goles;

	public Partido(Integer numeroPartido,  Set<Jugador> nominaLocal, Set<Jugador> nominaVistante) {
		this.local=nominaLocal;
		this.visitante=nominaVistante;
		this.numeroPartido=numeroPartido;
		this.goles=new TreeSet <> ();
		
	}

	public Set<Jugador> getLocal() {
		return local;
	}

	public void setLocal(Set<Jugador> local) {
		this.local = local;
	}

	public Set<Jugador> getVisitante() {
		return visitante;
	}

	public void setVisitante(Set<Jugador> visitante) {
		this.visitante = visitante;
	}

	public Integer getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(Integer numeroPartido) {
		this.numeroPartido = numeroPartido;
	}

	public void registrarGol(Jugador jugador, Integer minuto) {

		Gol gol = new Gol(jugador, minuto);
		this.goles.add(gol);
		
	}

	public Set<Gol> getGoles() {
		return goles;
	}

	public void setGoles(Set<Gol> goles) {
		this.goles = goles;
	}
	
	
	
	public String obtenerEquipoGanador() {
		Integer golesEquipoLocal=0;
		Integer golesEquipoVisitante=0;
		String ganador="Empate";
		for(Gol gol :this.goles) {
			String equipo =enQueEquipoEstaElJugador(gol.getJugador());
			if (equipo.equals("local"))
				golesEquipoLocal++;
			if (equipo.equals("visitante"))
				golesEquipoVisitante++;
		}
			
					
		if (golesEquipoLocal>golesEquipoVisitante)
					ganador= "Local";
		else 
			ganador ="visitante";
		
		return ganador;
					
		
	}

	private String enQueEquipoEstaElJugador(Jugador jugador) {
		
		String  equipo="";
		
		for( Jugador jugador2 : this.local)
			if (jugador2.equals(jugador)) {
				equipo="local";
				break;
			}
		for( Jugador jugador2 : this.visitante)
			if (jugador2.equals(jugador)) {
				equipo="visitante";
				break;
			}
		
		
		return equipo;
	}
	
	
	
	
	
	

}
