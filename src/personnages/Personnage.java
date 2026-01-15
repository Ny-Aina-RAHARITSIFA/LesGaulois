package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler (String phrase) {
		System.out.println(donnerAuteur()+" : « "+phrase+" ».");
	}
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage personnage) {
		System.out.println(donnerAuteur()+" donne un gros coup à "+personnage.getNom());
		personnage.recevoirCoup(force/3);
	}
	
	public void recevoirCoup(int force_coup) {
		force = force - force_coup;
		if (force<=0) {
			force=0;
			parler("J'abondonne");
		}else{
			parler("Aïe !");
		}
		
	}
}