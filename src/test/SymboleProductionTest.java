package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;
import chomsky.production.SymbolProduction;

public class SymboleProductionTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void constr() {
		SymbolProduction ps = new SymbolProduction(null);
	}
	@Test
	public void contains(){
		Symbol s = new Symbol('s');
		SymbolProduction ps = new SymbolProduction(s);
		assertTrue(ps.contains(s));
		assertFalse( ps.contains(new NonTerminal("a") ,new NonTerminal("b") ) );
		
	}
	@Test
	public void equals(){
		Symbol s = new Symbol('s');
		Symbol s2 = new Symbol('p');
		SymbolProduction ps = new SymbolProduction(s);
		SymbolProduction ps2 = new SymbolProduction(s2);
		SymbolProduction ps12 = new SymbolProduction(s);
		
		assertEquals(ps,ps);
		assertEquals(ps,ps12);
		assertNotEquals(ps,null);
		assertNotEquals(ps,ps2);
		assertNotEquals(ps,s);
		
	}@Test
	public void tostring(){
		Symbol s = new Symbol('s');
		SymbolProduction ps = new SymbolProduction(s);
		
		assertEquals(ps.toString(),"-> "+s.toString());
		
		
	}

}
