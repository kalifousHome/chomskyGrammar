package chomsky.production;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;


public class SymboleProduction implements Production{

	protected Symbole symbole;
	
	public SymboleProduction(Symbole symbole) throws IllegalArgumentException{
		if(symbole==null)
			throw(new IllegalArgumentException());
		this.symbole = symbole;
	}
	
	public boolean contains(Symbole symbole){
		return this.symbole.equals(symbole);
	}
	
	public boolean contains(NonTerminal t1, NonTerminal t2){
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbole == null) ? 0 : symbole.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SymboleProduction other = (SymboleProduction) obj;
		if (symbole == null) {
			if (other.symbole != null)
				return false;
		} else if (!symbole.equals(other.symbole))
			return false;
		return true;
	}
	
	public String toString(){
		return "not implemented";
	}
	
}
