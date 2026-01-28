package personnages;

public enum Equipement {
	CASQUE("Le casque",2), PLASTRON("Le plastron",3), 
	BOUCLIER("Le bouclier",3);
	
	private String chaine;
	private int forceAbsorbe;
	
	private Equipement(String chaine,int absorbe) {
		this.chaine=chaine;
		this.forceAbsorbe=absorbe;
	}
	
	public int getDefense() {
		return forceAbsorbe;
	}
	
	@Override
	public String toString() {
		return chaine;
	}
}
