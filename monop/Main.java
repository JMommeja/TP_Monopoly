package monop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tour = 1 ;
		
	Plateau lePlateau = new Plateau() ;
		
	while (tour != 50) {
		Plateau.J_R.sedeplacer();
		Plateau.CaseChance05.effet(Plateau.J_R);
		tour ++ ;
		
	}
	
	
	}

}
