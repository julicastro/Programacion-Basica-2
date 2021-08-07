package proyecto;

public class Partida {

	private Personaje p1;
	private Personaje p2;

	public Partida(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Personaje jugarLaPartida() {
		if (this.p1.getPoder() > this.p2.getPoder()) {
			return p1;
		} else if (this.p1.getPoder() < this.p2.getPoder()) {
			return p2;
		}
		return null;
	}

	public Personaje getP1() {
		return p1;
	}

	public void setP1(Personaje p1) {
		this.p1 = p1;
	}

	public Personaje getP2() {
		return p2;
	}

	public void setP2(Personaje p2) {
		this.p2 = p2;
	}

}
