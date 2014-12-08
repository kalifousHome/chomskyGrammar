package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;
import chomsky.production.SymbolProduction;

public class SymboleProductionTest {
	
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
		assertFalse(ps.equals(null));
		assertFalse(ps.equals(ps2));
		assertFalse(ps.equals(s));
		
	}@Test
	public void tostring(){
		Symbol s = new Symbol('s');
		SymbolProduction ps = new SymbolProduction(s);
		
		assertEquals(ps.toString(),"-> "+s.toString());
		
		
	}

}
