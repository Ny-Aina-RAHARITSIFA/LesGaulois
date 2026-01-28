package personnages;

public class Gaulois extends Personnage{
	private float forcePotion;
	
	public Gaulois(String nom, int force) {
		super(nom,force);
	}
	
	@Override
	protected String donnerAuteur() {
		return("gaulois "+getNom());
	}
	
	public void boirePotion(int potion) {
		forcePotion=potion;
	}
	
	@Override
	public void frapper(Personnage adversaire) {
		 if(this.getForce()>0) {
			 int nouvelleForce = (int)(this.getForce()*forcePotion);
			 System.out.println("Le "+donnerAuteur()+" donne un grand coup de force "+nouvelleForce+" au "+adversaire.donnerAuteur()+".");
			 adversaire.recevoirCoup(nouvelleForce);
			 if(forcePotion>1) {
				 forcePotion=(float) (forcePotion-0.5);
			 }
		}	
	}	
}
