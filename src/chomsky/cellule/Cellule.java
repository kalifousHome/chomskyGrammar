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
	public void add(NonTerminal n){
		nonTerminaux.add(n);
	}
	public boolean contains(NonTerminal n){
		return nonTerminaux.contains(n);
	}
	public boolean containsAll(Set<NonTerminal> n){
		return nonTerminaux.containsAll(n);
	}
	public Set<NonTerminal> getNonTerminaux(){
		return this.nonTerminaux;
	}
	public void addAll(Set<NonTerminal> n) {
		nonTerminaux.addAll(n);		
	}
}
