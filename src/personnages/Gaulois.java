package personnages;

public class Gaulois extends Personnage{
	private float potion;
	
	public Gaulois(String nom, int force) {
		super(nom,force);
	}
	
	public void boirePotion(int forcePotion) {
		
	}
	
	@Override
	protected String donnerAuteur() {
		return("Le gaulois "+getNom());
	}
	
	@Override
	
}
