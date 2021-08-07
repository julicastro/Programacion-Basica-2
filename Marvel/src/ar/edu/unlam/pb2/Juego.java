package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    List<Batalla> batallas = new ArrayList<>();
    private final ArrayList<Heroes> heroes;
    private final ArrayList<Villanos> villanos;
    private List<Heroes> heroesGanadores = new ArrayList<>();
    private List<Villanos> villanosGanadores = new ArrayList<>();

    public Juego(ArrayList<Heroes> heroes, ArrayList<Villanos> villanos) {
        this.heroes = heroes;
        this.villanos = villanos;
    }

    public void armarBatallas() throws CantidadDeVillanosYHeroesIncorrectos {
        if (heroes.size() != villanos.size()) throw new CantidadDeVillanosYHeroesIncorrectos();
        for (int i = 0; i < heroes.size(); i++) {
            Batalla batalla = new Batalla(heroes.get(i), villanos.get(i));
            batallas.add(batalla);
        }
    }

    public void agregarVillano(Villanos villano) {
        villanos.add(villano);
    }

    public void agregarHeroes(Heroes heroe) {
        heroes.add(heroe);
    }

    public void enfrentarVillanosContraHeroes() throws NoSeCrearonLasBatallasException {
        if (batallas.size() == 0) throw new NoSeCrearonLasBatallasException();
        for (Batalla b : batallas) {
            if (b.enfrentarHeroeContraVillano() instanceof Heroes) {
                heroesGanadores.add((Heroes) b.enfrentarHeroeContraVillano());
            } else if (b.enfrentarHeroeContraVillano() instanceof Villanos) {
                villanosGanadores.add((Villanos) b.enfrentarHeroeContraVillano());
            }
        }
    }
    
    public String determinarGanadorDelJuego() throws WorldDestroyedException {
    	String ganador = "villanos";
    	if(this.heroesGanadores.size() > this.villanosGanadores.size()) {
    		ganador = "Heroes";
    	}else if(this.heroesGanadores.size() == this.villanosGanadores.size()) {
    		ganador = "empate";
    	}else {
    		throw new WorldDestroyedException();
    	}
    	return ganador;
    }
    


}

