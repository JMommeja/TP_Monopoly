package monop;


public class Joueur extends Dés {
	
	int numcase ;
	String nom ;
	int argent ;

	public void sedeplacer() 
	{
		int x = 0 ;
		x = dés();
		this.numcase += x ;
		if (numcase >= 40) 
		{
		this.numcase =(numcase-40) ;
		checkCaseGo();
		}
		System.out.println(nom + " est case " + numcase ) ;
	}
	public void checkCaseGo() 
	{	
			this.argent += 300 ;	
			System.out.println(this.nom + " a gagner 200 $, il possede " +this.argent);
	}
public static void AfficherStat(Joueur joueur) 
{
	System.out.println(joueur.nom + " posséde " +joueur.argent);
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getArgent() {
	return argent;
}

public void setArgent(int argent) {
	this.argent = argent;
}

public Joueur(String nom ,int argent, int numcase) {
	this.nom = nom ;
	this.argent = argent ;
	this.numcase = numcase;
}
}

