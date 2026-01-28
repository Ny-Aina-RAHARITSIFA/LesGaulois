package personnages;

public class Soldat extends Romain{
	private Grade grade;
	private Equipement[] equipements = new Equipement[3];
	private int indice;
	
	public Soldat (String nom, int force, Grade grade) {
		super(nom,force);
		this.grade=grade;
	}
	
	public Grade getGrade() {
		return grade;
	}
	
	public void equiperEquipement(Equipement equipement) {
		boolean trouve = false;
		for (int i = 0;i<indice && !trouve;i++) {
			if(equipements[i]==equipement) {
				trouve = true;
			}
		}
		if(!trouve && indice<equipements.length) {
			equipements[indice] = equipement;
			System.out.println(grade+ donnerAuteur()+ " s'équipe avec "+equipement+".");
			indice ++;
		}
	}
	
	@Override
	public void recevoirCoup(int force_coup) {
		for(int i =0;i<equipements.length;i++) {
			if(equipements[i]!=null) {
				System.out.println(equipements[i]+" absorbe "+equipements[i].getDefense()+" du coup.");
				force_coup-=equipements[i].getDefense();
			}
		}
		if(force_coup>=0) {
			force=force-force_coup;
			if (force<=0) {
				force=0;
				parler("J'abondonne");
			}else {
				parler("AÏE !");
			}
		}
	}
}
