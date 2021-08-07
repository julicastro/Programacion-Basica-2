package Colecciones;

import java.util.Comparator;

public class CompararPorEdad implements Comparator <Alumno>{

	@Override
	public int compare(Alumno o, Alumno o2) {
		return (o.getEdad() > o2.getEdad())?1:(o.getEdad() == o2.getEdad())?0:-1;
		
	}

	
	
	
	
}
