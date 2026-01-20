package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix=new Gaulois("Vercingétorix",5);
		Village village=new Village(vercingetorix);
		Soldat minus = new Soldat("Minux",2,Grade.CENTURION);
		Camp camp = new Camp(minus);
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village");
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois asterix = new Gaulois("Astérix",5);
		Gaulois obelix = new Gaulois("Obélix",15);
		Gaulois prolix = new Gaulois("Prolix",2);
		Soldat brutus = new Soldat("Brutus",5,Grade.CENTURION);
		Soldat milexcus = new Soldat("Milexcus",2,Grade.SOLDAT);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus",2,Grade.TESSERARIUS);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus",3,Grade.OPTIO);
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
	}
}
