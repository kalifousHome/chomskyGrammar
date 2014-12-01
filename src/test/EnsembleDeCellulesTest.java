package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.cellule.EnsembleDeCellules;
import chomsky.composantes.NonTerminal;

public class EnsembleDeCellulesTest {

	
	@Test
	public void add() {
		
		int i=1,l=1;
		NonTerminal n = new NonTerminal("RENE");
		EnsembleDeCellules e= new EnsembleDeCellules (l,  i);
	
		assertFalse(e.contains(0, 0, n));
		e.add(l, i, n);
		assertTrue(e.contains(0,0, n));
		
	}
	

}
