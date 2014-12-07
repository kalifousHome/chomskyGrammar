package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;
import chomsky.production.SymboleProduction;

public class SymboleProductionTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void constr() {
		SymboleProduction ps = new SymboleProduction(null);
	}
	@Test
	public void contains(){
		Symbol s = new Symbol('s');
		SymboleProduction ps = new SymboleProduction(s);
		assertTrue(ps.contains(s));
		assertFalse( ps.contains(new NonTerminal("a") ,new NonTerminal("b") ) );
		
	}
	@Test
	public void equals(){
		Symbol s = new Symbol('s');
		Symbol s2 = new Symbol('p');
		SymboleProduction ps = new SymboleProduction(s);
		SymboleProduction ps2 = new SymboleProduction(s2);
		SymboleProduction ps12 = new SymboleProduction(s);
		
		assertEquals(ps,ps);
		assertEquals(ps,ps12);
		assertNotEquals(ps,null);
		assertNotEquals(ps,ps2);
		assertNotEquals(ps,s);
		
	}@Test
	public void tostring(){
		Symbol s = new Symbol('s');
		SymboleProduction ps = new SymboleProduction(s);
		
		assertEquals(ps.toString(),"-> "+s.toString());
		
		
	}

}
