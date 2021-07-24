package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MarvelTest {

	@Test
	public void queSePuedanEnfrentarHeroeYVillano() {
		Heroes h1 = new Heroes("Thor", 200);
		Villanos v1 = new Villanos("Loki", 190);		
		Batalla batalla = new Batalla(h1, v1);
		assertEquals(batalla.enfrentarHeroeContraVillano(), h1);
	}

	@Test
	public void darGemaAUnHeroeOVillanoParaQueLeAumenteElPoder(){
		Heroes h1 = new Heroes("Thor", 170);
		Villanos v1 = new Villanos("Loki", 250);
		h1.setGema(Gemas.ALMA);
		Batalla batalla = new Batalla(h1, v1);
		assertEquals(batalla.enfrentarHeroeContraVillano(), h1);
	}
	
	@Test(expected = CantidadDeVillanosYHeroesIncorrectos.class)
	public void queNoPuedanHaberMasHeroesQueVillanos() throws CantidadDeVillanosYHeroesIncorrectos {
		Heroes h1 = new Heroes("Thor", 170);
		Heroes h2 = new Heroes("Messi", 10000000);
		Villanos v1 = new Villanos("Loki", 250);
		h2.setGema(Gemas.REALIDAD);
		ArrayList<Heroes> hereoes = new ArrayList<>();
		hereoes.add(h1);
		hereoes.add(h2);
		ArrayList<Villanos> villanos  = new ArrayList<>();
		villanos.add(v1);
		Juego juego = new Juego(hereoes, villanos);
		juego.armarBatallas();
	}
	
	@Test
	public void siAmbosTienenElMismoPoderDevuelveNull() {
		Heroes h1 = new Heroes("Thor", 250);
		Villanos v1 = new Villanos("Loki", 250);
		Batalla batalla = new Batalla(h1, v1);
		assertNull(batalla.enfrentarHeroeContraVillano());
		
	}
	
	
	
	

}
