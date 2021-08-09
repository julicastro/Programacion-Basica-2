package apellido.nombre;

import java.util.HashSet;
import java.util.Set;

public class Telepase extends Cabina {

/*
 * Atribito donde se almacentodos los tags habilitados para el telepase
 * No se permiten tags duplicados ( 2 tags son iguales cuando tienen el mismo id)
 */
	private Set<Tag> tags;

	public Telepase(Integer numero) {

		
		
		
		//siempre al momento de crear un telepase se crea el tag 1 con 200 pesos de carga 
		Tag tagInicial =new Tag (1);
		tagInicial.setSaldo(200.0);
		this.cargarTag(tagInicial);
	}

	public Boolean cargarTag(Tag tag) {
		
	}

	
	/*
	 * Este metodo es pago automatico y en estas cabinas solamente estan habilitados los autobuses
	 * Al momento de pasar un autobus se descuenta el importe del tag asociado al autobus y se incrementa la recaudacion de la cabina 
	 * y tambien se tiene que incrementar el contador de AutoBus 
	 * 
	 * Validaciones
	 * 1) en caso que el tag no este registrado lanza una TagNoEncontradoException
	 * 2) en caso que el vehiculo que ingreso al telepase no es un AutoBus lanza una  VehiculoNoPermitidoExceptions
	 * 3) en caso que el importe que tiene el tag no alcanza para pagar el peaje laza una SaldoInsuficienteError
	 * 
	 */
	public void pagarAutomatico(Vehiculo vehiculo)	{
	}


	//Metodo no obligatorio
	private void pagarConTelePase(Vehiculo vehiculo) throws SaldoInsuficienteError, TagNoEncontradoException {

	}
//Verifica que si existe el tag
	public Boolean verifcarExiste(Tag tag) throws TagNoEncontradoException {
		// No Se Puede modificar el comportamiento de  este metodo
		//Los tags son iguales cuando tiene el mismo id 
		
		for (Tag tagLeido : tags) {
			if (tagLeido.equals(tag))
				return Boolean.TRUE;
		}

		throw new TagNoEncontradoException();
	}

}
