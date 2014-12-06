package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import chomsky.composantes.Alphabet;
import chomsky.composantes.Symbole;

public class AlphabetTest {

	@Test
	public void getSet() {
		Symbole a = new Symbole('a');
		Symbole b = new Symbole('b'); 
		Set<Symbole> s = new HashSet<Symbole>();
		
		s.add(a);
		s.add(b);
		
		Alphabet  al= new Alphabet(s);
		Set<Symbole> ret = al.getSet();
		
		assertTrue(s.containsAll(ret));
		assertTrue(ret.containsAll(s));
		
	}
	@Test
	public void add() {
		
		Symbole s = new Symbole('a');
		Alphabet  al= new Alphabet(new HashSet<Symbole>());
		
		assertFalse( al.contains(s));
		
		al.add(s);
		
		assertTrue( al.contains(s));
	}
	@Test
	public void getSymbole() {
		
		char car1 = 'a';
		char car2 = 'b';
		Symbole s= new Symbole(car1);
		Alphabet  al= new Alphabet(new HashSet<Symbole>());
		
		al.add(s);
		
		assertNull(al.getSymbole(car2));
		assertNotNull(al.getSymbole(car1));
		assertEquals( s , al.getSymbole( s.getChar() ) );
		
		
	}

}
