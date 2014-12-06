package chomsky.composantes;

import static org.junit.Assert.*;

import org.junit.Test;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;

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
		Symbole s = new Symbole('s');
		assertEquals(n1,n1);
		assertEquals(n1,n12);
		assertNotEquals(n12,n2);
		assertNotEquals(n1,n2);
		assertNotEquals(n1,null);
		assertNotEquals(n3,n1);
		assertNotEquals(n1,s);
	}
}