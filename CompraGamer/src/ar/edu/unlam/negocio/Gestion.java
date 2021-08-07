package ar.edu.unlam.negocio;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unlam.entidades.CPU;
import ar.edu.unlam.entidades.Componente;
import ar.edu.unlam.entidades.Fuente;
import ar.edu.unlam.entidades.Grafica;
import ar.edu.unlam.entidades.Mother;
import ar.edu.unlam.entidades.Ram;
import ar.edu.unlam.excepciones.ComponenteNoEncontradoException;

public class Gestion {

	private Map<String, Object> comp = new HashMap<>();

	public void agregarAlCarro(Componente c) throws ComponenteNoEncontradoException{
		if(c instanceof Grafica && !this.comp.containsKey("Grafica")) {
			this.comp.put("Grafica", c);
		}else if (c instanceof CPU && !this.comp.containsKey("CPU")) {
			this.comp.put("CPU", c);
		}else if (c instanceof Mother && !this.comp.containsKey("Mother")) {
			this.comp.put("Mother", c);
		}else if (c instanceof Ram && !this.comp.containsKey("Ram")) {
			this.comp.put("Ram", c);
		}else if (c instanceof Fuente && !this.comp.containsKey("Fuente")) {
			this.comp.put("Fuente", c);
		}else {
			throw new ComponenteNoEncontradoException();
		}
	}

	public Map<String, Object> getComp() {
		return comp;
	}

	public void setComp(Map<String, Object> comp) {
		this.comp = comp;
	}

}
