package test;

import static org.junit.Assert.*;
import org.junit.Test;

import chomsky.composantes.NonTerminal;

public class NonTerminalTest {


	@Test
	public void equals() {
		NonTerminal a = new NonTerminal("aaaa");
		NonTerminal b = new NonTerminal("aaaa");
		NonTerminal c = new NonTerminal("cccc");
		assertFalse(a.equals(c));
		assertEquals(a,b);		
	}

}
