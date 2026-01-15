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
	
	public void frapper(Romain romain) {
		System.out.println(donnerAuteur()+" envoie un grand coup dans la mâchoire de "+romain.getNom());
		romain.recevoirCoup(force/3);
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