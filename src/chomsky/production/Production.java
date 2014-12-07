package chomsky.production;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

public interface Production {

	public  boolean contains(Symbol symbole);
		
	public boolean contains(NonTerminal t1, NonTerminal t2);
	
	public String toString();
	
	public int hashCode() ;

	public boolean equals(Object obj);
	
}
