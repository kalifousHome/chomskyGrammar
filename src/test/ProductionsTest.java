package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;
import chomsky.production.NonTerminalProduction;
import chomsky.production.Productions;
import chomsky.production.SymboleProduction;

public class ProductionsTest {

	@Test
	public void get1() {

		/* test 1 get(Symbole symbole) */
		Productions p = new Productions();

		Symbole s1 = new Symbole('s');
		Symbole s2 = new Symbole('c');

		Set<NonTerminal> nt1 = new HashSet<NonTerminal>();

		NonTerminal n1 = new NonTerminal("S");
		NonTerminal n2 = new NonTerminal("Q");

		nt1.add(n1);
		nt1.add(n2);

		p.add(n1, s1);
		p.add(n2, s1);

		Set<NonTerminal> ret1 = p.get(s1);

		assertTrue(nt1.containsAll(ret1));
		assertTrue(ret1.containsAll(nt1));

		/* test 2 get(Set<Symbole> symboles) */
		NonTerminal n3 = new NonTerminal("R");
		NonTerminal n4 = new NonTerminal("V");
		nt1.add(n3);
		nt1.add(n4);

		p.add(n3, s2);
		p.add(n4, s2);

		Set<Symbole> sb = new HashSet<Symbole>();
		sb.add(s1);
		sb.add(s2);

		Set<NonTerminal> ret2 = p.get(sb);

		assertTrue(nt1.containsAll(ret2));
		assertTrue(ret2.containsAll(nt1));

	}

	@Test
	public void add() {

		/* test de add(NonTerminal t, Symbole symbole) */

		/* test 1 get(Symbole symbole) */
		Productions p = new Productions();

		Symbole s1 = new Symbole('s');
		NonTerminal n1 = new NonTerminal("S");

		assertFalse(p.contains(n1, s1));
		p.add(n1, s1);
		assertTrue(p.contains(n1, s1));
		/* test add(NonTerminal t, NonTerminal t1, NonTerminal t2) */
		Productions p2 = new Productions();

		NonTerminal n12 = new NonTerminal("S");
		NonTerminal n2 = new NonTerminal("P");
		NonTerminal n3 = new NonTerminal("Q");

		assertFalse(p2.contains(n12, n2, n3));
		p2.add(n12, n2, n3);
		assertTrue(p2.contains(n12, n2, n3));

	}

	@Test
	public void get2() {
		
		/* test get(NonTerminal t1, NonTerminal t2) */
		Productions p = new Productions();
		
		Set<NonTerminal>test = new HashSet<NonTerminal>();

		NonTerminal n1= new NonTerminal("S");
		NonTerminal n12= new NonTerminal("S");		
		NonTerminal n2 = new NonTerminal("P");
		NonTerminal n3 = new NonTerminal("Q");
		test.add(n1);
		test.add(n12);
		p.add(n1, n2, n3);
		p.add(n12, n2, n3);
		Set<NonTerminal>ret =p.get(n2,n3);
		assertTrue(ret.containsAll(test));
		assertTrue(test.containsAll(ret));
	}
	@Test
	public void get3(){	/*
		 * test get(Set<NonTerminal> nonTerminaux, Set<NonTerminal>
		 * nonTerminaux2)
		 */
		Productions p2 = new Productions();

		NonTerminal nx = new NonTerminal("x");
		NonTerminal nxx = new NonTerminal("xx");
		NonTerminal ny = new NonTerminal("y");
		NonTerminal nz = new NonTerminal("z");
		NonTerminal nu = new NonTerminal("u");
		NonTerminal nv = new NonTerminal("v");
		
		Set<NonTerminal>na = new HashSet<NonTerminal>();
		na.add(ny);
		na.add(nu);
		
		Set<NonTerminal>nb = new HashSet<NonTerminal>();
		nb.add(nz);
		nb.add(nv);
		
		Set<NonTerminal>testf = new HashSet<NonTerminal>();
		testf.add(nx);
		testf.add(nxx);
		
		p2.add(nx, ny, nz);
		p2.add(nxx, nu, nv);
		Set<NonTerminal>retf = p2.get(na, nb);
		assertTrue(retf.containsAll(testf));
		assertTrue(testf.containsAll(retf));
		
	}
}
