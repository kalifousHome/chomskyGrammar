package chomsky.cellule;

import java.util.HashSet;
import java.util.Set;

import chomsky.composantes.NonTerminal;

public class Cellule {

	/**
	 * @param args
	 */
	private Set<NonTerminal> nonTerminaux;
	
	public Cellule() {
		nonTerminaux = new HashSet<NonTerminal>();
	}
	protected void add(NonTerminal n){
		nonTerminaux.add(n);
	}
	protected boolean contains(NonTerminal n){
		return nonTerminaux.contains(n);
	}
	protected Set<NonTerminal> getNonTerminaux(){
		return this.nonTerminaux;
	}
}
