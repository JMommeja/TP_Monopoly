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
		}
		this.numcase = x ;
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

public Joueur(String nom ,int argent) {
	this.nom = nom ;
	this.argent = argent ;
}
}

