package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;
	
	public Personnage(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler (String phrase) {
		System.out.println("Le "+donnerAuteur()+" : « "+phrase+" ».");
	}
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		if(force!=0) {
			System.out.println("Le "+donnerAuteur()+" donne un grand coup de force "+force+" au "+adversaire.donnerAuteur());
			adversaire.recevoirCoup(force);
		}
	}
	
	public void recevoirCoup(int force_coup) {
		force=force-force_coup;
		if (force<=0) {
			force=0;
			parler("J'abondonne");
		}else {
			parler("AÏE !");
		}
		
	}
}