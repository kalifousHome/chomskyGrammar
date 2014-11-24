package chomsky.production;

import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;

public interface Production {

	public  boolean contains(Symbole symbole);
		
	public boolean contains(NonTerminal t1, NonTerminal t2);
	
	public String toString();
	
	public int hashCode() ;

	public boolean equals(Object obj);
	
}
