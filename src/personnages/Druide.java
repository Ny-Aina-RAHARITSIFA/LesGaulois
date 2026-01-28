package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	private int puissancePotion;
	private int nbDoses;
	private Random random;
	
	public Druide (String nom, int force) {
		super(nom,force);
		try {
			 random = SecureRandom.getInstanceStrong();
			} catch (Exception e) {
			 e.printStackTrace();
			}
	}
	
	public void fabriquerPotion(int Doses) {
		nbDoses=Doses;
		puissancePotion=random.nextInt(5)+2;
		this.parler("J'ai concocté "+nbDoses+" doses de potion magique. Elle a une force de "+ puissancePotion);
	}
	
	public void donnerPotion(Gaulois gaulois) {
		if(gaulois.getNom().equals("Obélix")) {
			this.parler(" Non, Obélix Non !... Et tu le sais très bien !");
		}
		else if(nbDoses<1) {
			this.parler(" Désolé "+gaulois.getNom()+" il n'y a plus une seule goutte de potion.");
		}
		else {
			this.parler("Tiens "+gaulois.getNom()+" un peu de potion magique.");
			gaulois.boirePotion(puissancePotion);
			nbDoses--;
		}
	}
}
