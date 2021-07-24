package marvel;

public class Batalla {
	
    private final Heroes heroe;
    private final Villanos villano;

    public Batalla(Heroes heroe, Villanos villano) {
        this.heroe = heroe;
        this.villano = villano;
    }

    public Personaje enfrentarHeroeContraVillano() {
        if (heroe.getPoder() < villano.getPoder()) {
            return villano;
        } else if (heroe.getPoder() > villano.getPoder()) {
            return heroe;
        }
        return null;
    }

    public Heroes getHeroe() {
        return heroe;
    }

    public Villanos getVillano() {
        return villano;
    }
}