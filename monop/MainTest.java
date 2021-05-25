package monop;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class MainTest {

	Plateau test2 = new Plateau() ;
	Case_Go test = new Case_Go(0);
	CaseChance test3 = new CaseChance(5);
	Dés test4 = new Dés();
    
    
	@Test
	public void testargentGo() throws IllegalStateException {
		
		test.effet(Plateau.J_R);
		//test premier tour de plateau.
		assertEquals(700,Plateau.J_R.argent) ;
		
		Plateau.J_B.argent = 60000 ; 
		//test faux
	//	assertEquals(700,Plateau.J_B.argent) ;
		
	}
	public void testargentChance() throws IllegalStateException {
		
		test3.effet(Plateau.J_R);
		//Il tombe sur une carte chance-200 
		assertEquals(300,Plateau.J_R.argent) ;
	}
	public void testdé() throws IllegalStateException {
		for (int i = 0; i < 50; i++) {
			int	x = test4.dés();
			assertTrue(x <= 12);
		}
	}
}
