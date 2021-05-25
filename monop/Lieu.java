package monop;

import java.util.Scanner; 

public class Lieu extends Propriétés {

	String Couleur ; 
	int NbMaison ;
	int NbHotel ;
	
	public Lieu(int numcase, int prix, int loyer , boolean hypotheque , String Couleur , int NbMaison , int NbHotel , boolean Acheter , String Possesseur , String nom ) {
		super(numcase, prix , loyer , hypotheque , Acheter , Possesseur , nom );
		this.Couleur = Couleur ;
		this.NbMaison = NbMaison ;
		this.NbHotel = NbHotel ;
		this.Acheter = Acheter ;
		this.Possesseur = Possesseur ;
		this.nom = nom ;
	}
	public void effet(Joueur joueur) { 
		//on regarde que le joueur est sur la bonne case
		if(joueur.numcase==this.numcase) {
			//Si oui, on recharge si la case ou est ce trouve est deja acheter 
			if (this.Acheter == false)
			{
				Scanner myObj = new Scanner(System.in);  
				System.out.printf(joueur.nom +" " + this.nom + " est en vente au prix de " + this.prix + " Acheter ( true  / false ? )");
			    Boolean rep = myObj.nextBoolean(); 
			    System.out.println(rep);
			    //L'utilisation doit entrer true ou false pour acheter ou non le batiment
			    if (rep == true || joueur.argent > this.prix) 
			    {
			    	joueur.argent = joueur.argent - this.prix ;
			    	this.Possesseur = joueur.nom ;
			    	this.Acheter = true ;
			    	System.out.println("Vous avez acheter" + this.nom) ;
			    }
			    else
			    {
			    	//Si il refuse ou n'a pas d'argent
			    	System.out.println("La prochaine fois peut etre ! ");
			    }
			}
			if (this.Acheter == true)
				//Si la case est deja acheter 
		    {
		    	if (this.Possesseur == joueur.nom)
		    		//On regarde qui possede la case, si c'est lui il ne se passe rien, autrement il doit payer le loyer
		    		{
			   	System.out.println(joueur.nom + " vous etes chez vous " + this.nom);
		    		}
		    	else if (joueur.argent > this.loyer)
		    		//il paye le loyer si il a de l'argent
		    	{
		    		joueur.argent-=this.loyer;
					System.out.println(" vous payez le loyer de " + this.Possesseur + " de la case " + this.nom + " d'un montant de " + this.loyer  );
				}
		    	else 
		    	{
		    		//A faire, si il n'a pas d'argent
		    		System.out.println("Vous devez hypothequer, vous n'avez pas assez d'argent pour payer le loyer.");
		    	}
		    }
		}
	}
}
