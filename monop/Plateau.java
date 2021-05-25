package monop;
import java.util.ArrayList;

public class Plateau 
{
	public ArrayList<Cases> cases ;
	public ArrayList<CaseChance> caseChance ;
	public ArrayList<Joueur> joueur ;
	public static Joueur J_R;
	public static Joueur J_B;
	
	public static CaseChance CaseChance5;
	public static Case_Go Case_Go ;
	public static Lieu Case40 ;
	public static Lieu Case38 ;

public Plateau()
{
	 J_R = new Joueur ("Joueur_Rouge", 500, 1);
	 J_B = new Joueur ("Joueur_Bleu" , 500 ,1);
	 
	ArrayList<Cases> cases = new ArrayList<Cases>();
	
	Case_Go = new Case_Go(0);

	CaseChance5  = new CaseChance(5);

	Case38 = new Lieu(38,220,22,false,"Bleu-F",0,0,false,"Personne","Avenue des champs-Elysées");

	Case40 = new Lieu(40,220,22,false,"Bleu-F",0,0,false,"Personne","Rue de la paix");
	//int numcase, int prix, int loyer , boolean hypotheque , String Couleur , int NbMaison , int NbHotel , boolean Acheter , String Possesseur , String nom 
	
	cases.add(Case_Go);
	
	cases.add(CaseChance5);
	
	cases.add(Case38);
	
	cases.add(Case40);
	
}
}