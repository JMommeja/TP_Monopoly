package monop;

import java.util.Random;

public class Dés 
{
	public int dés() 
	{
		
		    Random r = new Random();
		  
			String doubles = " ";
	        int premierjet = r.nextInt(6);
	        int secondjet = r.nextInt(6);
	        premierjet+= 1;
	        secondjet+= 1;

	        int sommedesdes = premierjet + secondjet;
	        
	        if (premierjet == secondjet)
	       	{
	        	doubles = "V" ;
	        }
	        return sommedesdes ; 
	        
	}
}
