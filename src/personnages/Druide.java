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
	
	public void fabriquerPotion(int nbDoses) {
		this.nbDoses=nbDoses;
		puissancePotion=random.nextInt(5)+2;
		parler("J'ai concocté "+nbDoses+" doses de potion magique. Elle a une force de "+ puissancePotion);
	}
	
	public void donnerPotion(Gaulois gaulois,Druide druide) {
		if (gaulois.getNom()=="Obélix") {
			druide.parler("Non, Obélix Non !... Et tu le sais très bien !");
		}
		else {
			druide.parler("Tiens "+gaulois.getNom()+" un peu de potion magique.");
		}
			
	}
}
