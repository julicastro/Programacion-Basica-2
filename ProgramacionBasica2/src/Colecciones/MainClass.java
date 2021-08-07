package Colecciones;

public class MainClass {

	public static void main (String[]args) {
		
		Alumno a1 = new Alumno ("Julian", 25);
		Alumno a2 = new Alumno ("Alfredo", 16);
		Alumno a3 = new Alumno ("Zanella", 17);
		Alumno a4 = new Alumno ("Pablo", 22);
		Alumno a5 = new Alumno ("Ernelio", 27);
		Alumno a6 = new Alumno ("Carlos", 15);
		Alumno a7 = new Alumno ("Baltazar", 17);
		
		Institucion in = new Institucion("La casa");
		
		in.agregarAlumno(a1);
		in.agregarAlumno(a2);
		in.agregarAlumno(a3);
		in.agregarAlumno(a4);
		in.agregarAlumno(a5);
		in.agregarAlumno(a6);
		in.agregarAlumno(a7);
	
		in.mostrarListaOrdenadaPorNombre();
		
		in.mostrarOrdenadosPorEdad();
		
		
	}
	
}
