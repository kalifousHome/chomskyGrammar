package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import chomsky.cellule.CellArray;
import chomsky.components.NonTerminal;

public class EnsembleDeCellulesTest {

	
	@Test
	public void add() {
		
		NonTerminal n = new NonTerminal("RENE");
		CellArray e= new CellArray (1,  1);
	
		assertFalse(e.contains(1, 1, n));
		e.add(1, 1, n);
		assertTrue(e.contains(1,1, n));
		
	}	
	@Test
	public void addAll() {
		
		NonTerminal a = new NonTerminal("AAAA");
		NonTerminal b = new NonTerminal("BBBB");
		NonTerminal c = new NonTerminal("CCCC");
		Set<NonTerminal> set = new HashSet<NonTerminal>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		CellArray e= new CellArray (1,  1);
	
		assertFalse(e.containsAll(1, 1,set));
		e.addAll(1, 1, set);
		assertTrue(e.containsAll(1, 1, set));
		
	}
	@Test
	public void getNonTerminaux(){
		
		NonTerminal a = new NonTerminal("AAAA");
		NonTerminal b = new NonTerminal("BBBB");
		NonTerminal c = new NonTerminal("CCCC");
		Set<NonTerminal> set = new HashSet<NonTerminal>();
		set.add(a);
		set.add(b);
		set.add(c);
		
		CellArray e= new CellArray (1,  1);
		e.addAll(1, 1, set);
		assertTrue(set.containsAll( e.getNonTerminaux(1, 1)));
		
	}
	

}
