package monop;

public class Propriétés extends Cases
{
	public Propriétés(int numcase, int prix , int loyer , Boolean hypotheque ,Boolean Acheter , String nom ,String Possesseur  )
	{
		super(numcase);
		this.prix  = prix ;
		this.loyer  = loyer ;
		this.hypotheque = hypotheque ;
		this.Acheter = Acheter ; 
		this.nom = nom ;
		this.Possesseur = Possesseur ; 
	}
	
	int prix ;
	int loyer ;
	Boolean hypotheque ; 
	Boolean Acheter ; 
	String nom ; 
	String Possesseur ;
	

	public void effet(Joueur joueur) {
			//a faire
	}
}
