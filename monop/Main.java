package monop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tour = 1 ;
		
	Plateau lePlateau = new Plateau() ;
		
	while (tour != 100) {
		
		Plateau.J_R.sedeplacer();
		Plateau.J_B.sedeplacer();
	
		Plateau.CaseChance5.effet(Plateau.J_R);
		Plateau.CaseChance5.effet(Plateau.J_B);
	
		Plateau.Case38.effet(Plateau.J_R);
		Plateau.Case38.effet(Plateau.J_B);
		
		Plateau.Case40.effet(Plateau.J_R);
		Plateau.Case40.effet(Plateau.J_B);
	
		tour ++ ;	
		
		}	
	}
}
