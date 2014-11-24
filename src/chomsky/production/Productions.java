package chomsky.production;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;


public class Productions {

	protected  Map<NonTerminal, Set<Production>> productions;
	
	public Productions(){
		this.productions = new HashMap<NonTerminal, Set<Production>>();
	}
	

	public boolean contains(NonTerminal t, Symbole symbole){
		for(Production p : this.productions.get(t)){
			if(p.contains(symbole))
				return true;
		}
		return false;
	}
		
	public boolean contains(NonTerminal t, NonTerminal t1, NonTerminal t2){
		for(Production p : this.productions.get(t)){
			if(p.contains(t1,t2))
				return true;
		}
		return false;
	}	

	public void add(NonTerminal t, Symbole symbole){
		Set<Production>lastSet = this.productions.get(t);
		
		if(lastSet == null){
			lastSet = new HashSet<Production>();
			
			lastSet.add(new SymboleProduction(symbole));
			this.productions.put(t, lastSet);
		} else {
			lastSet.add(new SymboleProduction(symbole));
			this.productions.put(t, lastSet);
		}
	}
		
	public void add(NonTerminal t, NonTerminal t1, NonTerminal t2){
		Set<Production>lastSet = this.productions.get(t);
		
		if(lastSet == null){
			lastSet = new HashSet<Production>();
			
			lastSet.add(new NonTerminalProduction(t1,t2));
			this.productions.put(t, lastSet);
		} else {
			lastSet.add(new NonTerminalProduction(t1,t2));
			this.productions.put(t, lastSet);
		}
	}
	
	public String toString(){
		return "Not implemented";
	}
	
}
