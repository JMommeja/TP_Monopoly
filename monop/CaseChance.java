package monop;


public class CaseChance extends Cases_spécial{
	
	public CaseChance(int numcase) {
		super(numcase);
	}
	
	
	public void effet(Joueur joueur) {
		if(joueur.numcase==this.numcase) {
			joueur.argent-=200;
			System.out.println(joueur.nom + " a perdu 200$ il a " +joueur.argent);
		}
	}
}
