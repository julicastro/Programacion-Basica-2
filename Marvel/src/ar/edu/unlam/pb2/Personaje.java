package ar.edu.unlam.pb2;

public abstract class Personaje{
    String nombre;
    Integer poder;
    Gemas gema;

    public Personaje(String nombre, Integer poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoder() {
        if (gema != null) {
            if (gema == Gemas.TIEMPO || gema == Gemas.MENTE ||  gema == Gemas.PODER) {
                return poder*3;
            } else {
                return poder*2;
            }
        }
        return poder;
    }

    public void setPoder(Integer poder) {
        this.poder = poder;
    }

    public void setGema(Gemas gema) {
        this.gema = gema;
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
		Personaje other = (Personaje) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

    
    
    
    
    
    
}
