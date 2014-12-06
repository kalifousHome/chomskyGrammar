package test;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;

public class SymboleTest {

	@Test
	public void getChar() {
		char car1= 'a';
		
		Symbole s = new Symbole (car1);
				
		assertEquals(car1,s.getChar());
	}

	@Test
	public void equals() {
	
		char car1= 'a';
		char car2= 'b';

		Symbole s1 = new Symbole (car1);
		Symbole s12 = new Symbole (car1);
		Symbole s2 = new Symbole (car2);
		
		assertEquals(s1,s1);
		assertEquals(s1,s12);
		assertNotEquals(s1,null);
		assertNotEquals(s1,new NonTerminal("non_terminal"));
		assertNotEquals(s1,s2);
	
	}@Test
	public void tostring() {
	
		char car1= 'a';
		
		Symbole s1 = new Symbole (car1);
		
		assertEquals(s1.toString(),""+car1);
		
	
	}

}
