package monop;


public class Joueur extends Dés {
	
	int numcase ;
	String nom ;
	int argent ;

	public void sedeplacer() 
	{
		int x = 0 ;
		x = dés();
		if (numcase + x > 40) 
		{
		x =	(numcase-40)-x ;
		numcase = 0 ;
		checkCaseGo();
		}
		this.numcase = x ;
		
		System.out.println(nom + " est case " + numcase ) ;
	}
	public void checkCaseGo() 
	{	
			this.argent += 300 ;	
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

