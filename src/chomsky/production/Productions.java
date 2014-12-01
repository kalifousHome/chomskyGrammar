package chomsky.production;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;


public class Productions {

	protected  Map<Production, Set<NonTerminal>> productions;
	
	public Productions(){
		this.productions = new HashMap<Production, Set<NonTerminal>>();
	}
	

	public boolean contains(NonTerminal terminal, Symbole symbole){
		for(NonTerminal t : this.productions.get(new SymboleProduction(symbole))){
			if(t.equals(terminal))
				return true;
		}
		return false;
	}
		
	public boolean contains(NonTerminal terminal, NonTerminal t1, NonTerminal t2){
		for(NonTerminal t : this.productions.get(new NonTerminalProduction(t1,t2))){
			if(t.equals(terminal))
				return true;
		}
		return false;
	}	
	

	public Set<NonTerminal> get(Symbole symbole){
		return this.productions.get(new SymboleProduction(symbole));
	}

	public Set<NonTerminal> get(Set<Symbole> symboles) {
		Set<NonTerminal> tmp = new HashSet<NonTerminal>();
		
		for(Symbole s : symboles)
				tmp.addAll(this.get(s));
		
		return tmp;
	}
		
	public Set<NonTerminal> get(NonTerminal t1, NonTerminal t2){
		return this.productions.get(new NonTerminalProduction(t1,t2));
	}	

	public Set<NonTerminal> get(Set<NonTerminal> nonTerminaux, Set<NonTerminal> nonTerminaux2) {
		Set<NonTerminal> tmp = new HashSet<NonTerminal>();
		
		for(NonTerminal X : nonTerminaux)
			for(NonTerminal Y : nonTerminaux2)
				tmp.addAll(this.get(X,Y));
		
		return tmp;
	}

	public void add(NonTerminal t, Symbole symbole){
		Production tmp = new SymboleProduction(symbole);
		Set<NonTerminal>lastSet = this.productions.get(tmp);
		
		if(lastSet == null){
			lastSet = new HashSet<NonTerminal>();
			
			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		} else {
			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		}
	}
		
	public void add(NonTerminal t, NonTerminal t1, NonTerminal t2){
		Production tmp = new NonTerminalProduction(t1,t2);
		Set<NonTerminal>lastSet = this.productions.get(tmp);
		
		if(lastSet == null){
			lastSet = new HashSet<NonTerminal>();
			
			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		} else {
			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		}
	}
	
	public String toString(){
		return this.productions.toString();
	}
	
}
