package chomsky.components;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

public class NonTerminalTest {

	@Test
	public void tostring() {
		String name = "rene";
		NonTerminal n = new NonTerminal(name);
		assertEquals(name,n.toString());
	}
	@Test
	public void equals() {
		
		String name1 = "rene";
		String name2 = "pierre";
		String name3 = null;
		
		NonTerminal n1 = new NonTerminal(name1);
		NonTerminal n2 = new NonTerminal(name2);
		NonTerminal n12 = new NonTerminal(name1);
		NonTerminal n3 = new NonTerminal(name3);
		Symbol s = new Symbol('s');
		
		assertEquals(n1,n1);
		assertEquals(n1,n12);
		assertFalse(n12.equals(n2));
		assertFalse(n1.equals(n2));
		assertFalse(n1.equals(null));
		assertFalse(n3.equals(n1));
		assertFalse(n3.equals(new NonTerminal("not_null")));
		
		assertFalse(n1.equals(s));
	}
}
