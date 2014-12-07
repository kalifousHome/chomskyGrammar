package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;
import chomsky.production.NonTerminalProduction;

public class NonTerminalProductionTest {

	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void constr() {
		
		NonTerminal non1 = new NonTerminal("nonterminal");

		NonTerminalProduction  n1 = new NonTerminalProduction(non1,null);
		NonTerminalProduction  n2 = new NonTerminalProduction(null,non1);
		NonTerminalProduction  n3 = new NonTerminalProduction(null,null);
	}
	@Test
	public void contains() {
		
		NonTerminal n1 = new NonTerminal("n1");
		NonTerminal n2 = new NonTerminal("n2");
		NonTerminalProduction  n = new NonTerminalProduction(n1,n2);
		
		assertTrue(n.contains(n1,n2));
		assertFalse(n.contains(n2,n1));
		assertFalse(n.contains(n1,null));
		assertFalse(n.contains(null,n2));
		assertFalse(n.contains(new Symbol('s')));
			
		
	}@Test
	public void equals() {
		
		NonTerminal non1 = new NonTerminal("n1");
		NonTerminal non2 = new NonTerminal("n2");
		NonTerminalProduction  n = new NonTerminalProduction(non1,non2);
		NonTerminalProduction  n2 = new NonTerminalProduction(non1,non2);
		NonTerminalProduction  n3 = new NonTerminalProduction(non2,non2);
		NonTerminalProduction  n4 = new NonTerminalProduction(non1,non2);
		NonTerminalProduction  n5 = new NonTerminalProduction(non1,non1);
		NonTerminalProduction  n6 = new NonTerminalProduction(non1,non2);
		
		assertEquals(n,n);
		assertEquals(n,n2);
		assertNotEquals(n,null);
		assertNotEquals(n2,null);
		assertNotEquals(n,non1);
		assertNotEquals(n2,non1);
		assertNotEquals(n3,n4);
		assertNotEquals(n5,n6);
		

	}@Test
	public void tostring() {
		
		NonTerminal n1 = new NonTerminal("n1");
		NonTerminal n2 = new NonTerminal("n2");
		NonTerminalProduction  n = new NonTerminalProduction(n1,n2);
		
		assertEquals(n.toString(),"-> "+n1.toString()+n2.toString());
			
		
	}

}
