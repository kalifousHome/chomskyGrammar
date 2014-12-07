package chomsky.production;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;


public class SymboleProduction implements Production{

	protected Symbol symbole;
	
	public SymboleProduction(Symbol symbole) throws IllegalArgumentException{
		if(symbole==null)
			throw(new IllegalArgumentException());
		this.symbole = symbole;
	}
	
	public boolean contains(Symbol symbole){
		return this.symbole.equals(symbole);
	}
	
	public boolean contains(NonTerminal t1, NonTerminal t2){
		return false;
	}
	
	public String toString(){
		return "-> "+this.symbole.toString();
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbole == null) ? 0 : symbole.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SymboleProduction other = (SymboleProduction) obj;
		 if (!symbole.equals(other.symbole))
			return false;
		return true;
	}
	
}
