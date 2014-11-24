package chomsky.cellule;

import java.util.Set;

import chomsky.composantes.NonTerminal;

public class Cellule {

	/**
	 * @param args
	 */
	private Set<NonTerminal> nonTerminaux;
	
	public Cellule() {

	}
	protected void add(NonTerminal n){
		nonTerminaux.add(n);
	}
	protected boolean contains(NonTerminal n){
		return nonTerminaux.contains(n);
	}
}
