package monop;

public class Case_Go extends Cases{

	public Case_Go(int numcase) {
		super(numcase);
	}
	

	public void effet(Joueur joueur) {
			joueur.argent+=200;
			System.out.println(joueur.nom + " a gagner 200$ il a " +joueur.argent);
	}
}
