package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

public class SymboleTest {

	@Test
	public void getChar() {
		char car1= 'a';
		
		Symbol s = new Symbol (car1);
				
		assertEquals(car1,s.getChar());
	}

	@Test
	public void equals() {
	
		char car1= 'a';
		char car2= 'b';

		Symbol s1 = new Symbol (car1);
		Symbol s12 = new Symbol (car1);
		Symbol s2 = new Symbol (car2);
		
		assertEquals(s1,s1);
		assertEquals(s1,s12);
		assertFalse(s1.equals(null));
		assertFalse(s1.equals(new NonTerminal("non_terminal")));
		assertFalse(s1.equals(s2));
	
	}@Test
	public void tostring() {
	
		char car1= 'a';
		
		Symbol s1 = new Symbol (car1);
		
		assertEquals(s1.toString(),""+car1);
		
	
	}

}
