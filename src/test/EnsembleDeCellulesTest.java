package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import chomsky.cellule.EnsembleDeCellules;
import chomsky.composantes.NonTerminal;

public class EnsembleDeCellulesTest {

	
	@Test
	public void add() {
		
		int i=1,l=1;
		NonTerminal n = new NonTerminal("RENE");
		EnsembleDeCellules e= new EnsembleDeCellules (l,  i);
	
		assertFalse(e.contains(0, 0, n));
		e.add(l-1, i-1, n);
		assertTrue(e.contains(0,0, n));
		
	}	
	@Test
	public void addAll() {
		
		int i=1,l=1;
		NonTerminal a = new NonTerminal("AAAA");
		NonTerminal b = new NonTerminal("BBBB");
		NonTerminal c = new NonTerminal("CCCC");
		Set<NonTerminal> set = new HashSet<NonTerminal>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		EnsembleDeCellules e= new EnsembleDeCellules (l,  i);
	
		assertFalse(e.containsAll(0, 0,set));
		e.addAll(l-1, i-1, set);
		assertTrue(e.containsAll(0,0, set));
		
	}
	@Test
	public void getNonTerminaux(){
		
		int i=1,l=1;
		NonTerminal a = new NonTerminal("AAAA");
		NonTerminal b = new NonTerminal("BBBB");
		NonTerminal c = new NonTerminal("CCCC");
		Set<NonTerminal> set = new HashSet<NonTerminal>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		EnsembleDeCellules e= new EnsembleDeCellules (l,  i);
		e.addAll(l-1, i-1, set);
		assertTrue(set.containsAll( e.getNonTerminaux(0, 0)));
		
	}
	

}
