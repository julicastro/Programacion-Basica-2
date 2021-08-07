package proyecto;

import java.util.ArrayList;
import java.util.List;

public class Juego {

	private List<Personaje> equipo1 = new ArrayList<>();
	private List<Personaje> equipo2 = new ArrayList<>();
	private List<Partida> partidas = new ArrayList();
	
	
	public void agregar(String equipo, Personaje personaje) {
		if (equipo.equalsIgnoreCase("1")) {
			if (this.equipo1.size() < 4) {
				this.equipo1.add(personaje);
			}
		} else if (equipo.equalsIgnoreCase("2")) {
			if (this.equipo2.size() < 4) {
				this.equipo2.add(personaje);
			}
		}
	}

	public void crearPartida() throws NoHaySuficientesPersonajesException {
		if (this.equipo1.size() == 4 && this.equipo2.size() == 4) {	
			for (int i = 0; i < this.equipo1.size(); i++) {
				for (int j = 0; j < equipo2.size(); j++) {
					Partida partidaNueva = new Partida(this.equipo1.get(1), this.equipo2.get(j));
					this.partidas.add(partidaNueva);
				}		
			}
		}else {
			throw new NoHaySuficientesPersonajesException();
		}
	}
	
	public void ejecutarPartidas() {
		
	}
	
	
	
	

}
