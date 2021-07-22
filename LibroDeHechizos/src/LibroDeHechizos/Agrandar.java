package LibroDeHechizos;

public class Agrandar extends Hechizo {

	private String conjuro;
	
	public Agrandar(String conjuro) {
		super(conjuro);
		// TODO Auto-generated constructor stub
	}
	
	public void aplicarHechizo(Hechizable hechizable) {
		hechizable.setAgramdado();
		
	}

	public String getConjuro() {
		return conjuro;
	}

	public void setConjuro(String conjuro) {
		this.conjuro = conjuro;
	}
	
}
