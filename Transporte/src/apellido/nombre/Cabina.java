package apellido.nombre;

import java.util.HashMap;

import java.util.Map;

public class Cabina {
	
	/*
	 * Fornato del Contador de vehiculo ejemplo
	 * Clave valor
	 * Moto    6
	 * AutoBus 3
	 * Moto    2
	 *  
	 */
	private Map <String, Integer> contadorDeVehiculos;
	private Integer numero;
	
	/*
	 * 
	 */
	private Double tarifaCoche;
	private Double tarifaMoto;
	private Double tarifaAutoBus;


	/* recaudacion total de todos los vehiculos que pasaron por dicha cabina*/
	private Double recaudacion;
	
	public Cabina(Integer numero) {
		this.numero=numero;
		this.recaudacion=0.0;
		this.tarifaAutoBus=200.0;
		this.tarifaCoche=100.0;
		this.tarifaMoto=50.0;
	
		//Completar la inicializacion de los atributos restantes
		
	}

	
	
	/*
	 * Este metodo realiza el cobro y acumula la recaudacion de la cabina en funcion al tipo de auto
	 * Tambien contabiliza la cantidad de vehiculo ejemplo si es moto aumenta en uno el contador de moto
	 */
	public  void pagar (Vehiculo vehiculo)  {
		 

	}		
	

	
	/*
	 * incrementa el contadorDeVehiculo 
	 */
	private  void  contarVehiculo (Vehiculo vehiculo) {
		
	}
	
}
