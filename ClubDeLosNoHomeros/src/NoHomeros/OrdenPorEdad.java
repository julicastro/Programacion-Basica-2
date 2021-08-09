package NoHomeros;

import java.util.Comparator;

public class OrdenPorEdad implements Comparator<Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		return (p1.getEdad().compareTo(p2.getEdad()));
	}

}
