package test_fonctionnel;

import personnages.*;


public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",5);
		Druide panoramix = new Druide("Panoramix",2);
		Soldat minus = new Soldat("Minus",6,Grade.SOLDAT);
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois obelix = new Gaulois("Obélix",15);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		
		minus.equiperEquipement(Equipement.BOUCLIER);
		minus.equiperEquipement(Equipement.CASQUE);
		minus.equiperEquipement(Equipement.PLASTRON);
		
		panoramix.fabriquerPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonix);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU… UN GAUGAU…");
		while(asterix.getForce()!=0 && minus.getForce()!=0){
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}
}

