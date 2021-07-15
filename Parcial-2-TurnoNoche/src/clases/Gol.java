package clases;

public class Gol implements Comparable <Gol> {

	private Jugador jugador;
	private Integer minuto;

	public Gol(Jugador jugador, Integer minuto) {
		this.jugador=jugador;
		this.minuto=minuto;
	}

	@Override
	public int compareTo(Gol o) {
		// TODO Auto-generated method stub
		return this.minuto.compareTo(o.minuto);
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	
	
}
