package chomsky.cellule;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import chomsky.cellule.Cell;
import chomsky.components.NonTerminal;

public class CelluleTest {


	@Test 
	public void contains() {
		
		NonTerminal n = new NonTerminal("Rene");
		Cell c = new Cell();
		
		assertFalse(c.contains(n));		
		c.add(n);
		assertTrue(c.contains(n));		
			
	}

	@Test 
	public void getNonTerminaux(){
		
		NonTerminal a = new NonTerminal("aaaa");
		NonTerminal b = new NonTerminal("bbbb");
		NonTerminal c = new NonTerminal("cccc");
		
		Set<NonTerminal> set_test= new HashSet<NonTerminal>();
		Set<NonTerminal> set = new HashSet<NonTerminal>() ;
		set.add(a);
		set.add(b);
		set.add(c);			
		
		Cell cel = new Cell();
		cel.add(a);
		cel.add(b);
		cel.add(c);		
		set_test= cel.getNonTerminaux();
		
		assertTrue(set_test.containsAll(set));
		assertTrue(set.containsAll(set_test));
			
	}
}
