package Colecciones;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Institucion {

	String nombre;
	private Set <Alumno> alumnos = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre()));
		
	
	public Institucion(String n) {
		this.nombre = n;
	}
	
	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public void mostrarListaOrdenadaPorNombre(){
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getEdad());
		}
	}
	
	public void mostrarOrdenadosPorEdad(){
	
		this.alumnos = new TreeSet<>((a, b) -> a.getEdad().compareTo(b.getEdad()));
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getEdad() + " " + alumno.getEdad());
		}
	}
}
