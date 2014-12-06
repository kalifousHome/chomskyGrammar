package chomsky.production;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;


public class NonTerminalProduction implements Production{

	protected NonTerminal t1;
	protected NonTerminal t2;
	
	public NonTerminalProduction(NonTerminal t1, NonTerminal t2) throws IllegalArgumentException{
		if(t1 == null || t2 == null)
			throw(new IllegalArgumentException());
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public boolean contains(Symbole symbole){
		return false;
	}
	
	public boolean contains(NonTerminal t1, NonTerminal t2){
		return this.t1.equals(t1) && this.t2.equals(t2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((t1 == null) ? 0 : t1.hashCode());
		result = prime * result + ((t2 == null) ? 0 : t2.hashCode());
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
		NonTerminalProduction other = (NonTerminalProduction) obj;
		if (!t1.equals(other.t1))
			return false;
		else if (!t2.equals(other.t2))
			return false;
		return true;
	}
	
	public String toString(){
		return "-> "+t1.toString()+t2.toString();
	}

}
