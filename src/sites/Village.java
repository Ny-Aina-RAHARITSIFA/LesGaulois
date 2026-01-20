package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] gaulois=new Gaulois[4];
	private int nbGaulois=0;
	
	public Village(Gaulois chef) {
		this.chef=chef;
	}
	
	public Gaulois getChef() {
		return chef;
	}


	public void ajouterVillageois(Gaulois gauloi) {
		if(nbGaulois==gaulois.length) {
			chef.parler("Désolé "+gauloi.getNom()+" mon village est déjà bien rempli. ");
		}
		else {
			gaulois[nbGaulois]=gauloi;
			nbGaulois++;
			chef.parler(" Bienvenue "+gauloi.getNom()+" !");
		}
	}
}