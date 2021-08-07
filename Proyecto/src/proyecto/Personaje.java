package proyecto;

public class Personaje {

	private Integer poder; 
	private Color color;
	
	public Personaje(Integer poder, Color color) {
		this.poder = poder;
		this.color = color;
	}
	
	public Integer getPoder() {
		return poder;
	}
	public void setPoder(Integer poder) {
		this.poder = poder;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((poder == null) ? 0 : poder.hashCode());
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
		Personaje other = (Personaje) obj;
		if (color != other.color)
			return false;
		if (poder == null) {
			if (other.poder != null)
				return false;
		} else if (!poder.equals(other.poder))
			return false;
		return true;
	} 
	
	
	
	
	
	
	
}
