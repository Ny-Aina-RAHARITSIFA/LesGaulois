package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats=new Soldat [3];
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
}
