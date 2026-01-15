package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] gaulois=new Gaulois[50];
	private int nbGaulois=0;
	
	public Village(Gaulois chef) {
		this.chef=chef;
	}
	
	public Gaulois getChef() {
		return chef;
	}
}
