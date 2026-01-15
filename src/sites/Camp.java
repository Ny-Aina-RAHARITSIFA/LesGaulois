package sites;

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
}
