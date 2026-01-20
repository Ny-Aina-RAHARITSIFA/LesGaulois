package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats=new Soldat [80];
	private int nbSoldats=0;
	
	public Camp(Soldat commandant) {
		this.commandant=commandant;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if(nbSoldats==soldats.length) {
			commandant.parler("Désolé Ballondebaudrus notre camp est complet !");
		}
		else {
			soldats[nbSoldats]=soldat;
			nbSoldats++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par "+commandant.getNom());
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par "+commandant.getNom()+" contient les soldats :");
		for(int i =0;i<nbSoldats;i++) {
			System.out.println("- "+soldats[i].getNom());
		}
	}
	
	public void changerCommandant(Soldat soldat) {
		if (soldat.getGrade()==Grade.CENTURION) {
			commandant = soldat;
			soldat.parler("Moi "+soldat.getNom()+" je prends la direction du camp romain. ");
		}
		else {
			soldat.parler(" Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
		}
	}
}
