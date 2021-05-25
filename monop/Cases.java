package monop;

public abstract class Cases 
{	
	int numcase ;

	public abstract void effet(Joueur joueur);

	
	public int getNumcase() {
		return numcase;
	}

	public void setNumcase(int numcase) {
		this.numcase = numcase;
	}
	
	public Cases (int numcase) 
	{
		this.numcase = numcase ;
	}
	
	public void passage() {
	}
}
