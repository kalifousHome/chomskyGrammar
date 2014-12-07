package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import chomsky.components.Alphabet;
import chomsky.components.Symbol;

public class AlphabetTest {

	@Test
	public void getSet() {
		Symbol a = new Symbol('a');
		Symbol b = new Symbol('b'); 
		Set<Symbol> s = new HashSet<Symbol>();
		
		s.add(a);
		s.add(b);
		
		Alphabet  al= new Alphabet(s);
		Set<Symbol> ret = al.getSet();
		
		assertTrue(s.containsAll(ret));
		assertTrue(ret.containsAll(s));
		
	}
	@Test
	public void add() {
		
		Symbol s = new Symbol('a');
		Alphabet  al= new Alphabet(new HashSet<Symbol>());
		
		assertFalse( al.contains(s));
		
		al.add(s);
		
		assertTrue( al.contains(s));
	}
	@Test
	public void getSymbole() {
		
		char car1 = 'a';
		char car2 = 'b';
		Symbol s= new Symbol(car1);
		Alphabet  al= new Alphabet(new HashSet<Symbol>());
		
		al.add(s);
		
		assertNull(al.getSymbole(car2));
		assertNotNull(al.getSymbole(car1));
		assertEquals( s , al.getSymbole( s.getChar() ) );
		
		
	}

}
