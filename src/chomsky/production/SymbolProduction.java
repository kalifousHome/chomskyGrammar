package chomsky.production;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;


/**
 * Class that represents the right part of a NT -> F production
 */
public class SymbolProduction implements Production{

	protected Symbol symbole;

	/**
	 * Create the right part NT -> F
	 * 
	 * @param symbol
	 *            the symbol
	 * @throws IllegalArgumentException
	 *             throws if one of non terminal symbol is null
	 */
	public SymbolProduction(Symbol symbol) throws IllegalArgumentException{
		if(symbol==null)
			throw(new IllegalArgumentException());
		this.symbole = symbol;
	}

	/**
	 * Return true if the right part of the production is the symbol, otherwise
	 * false
	 * 
	 * @param symbole
	 *            the symbol to test
	 * @return true if the right part of the production is the symbol, otherwise
	 *         false
	 */
	public boolean contains(Symbol symbole){
		return this.symbole.equals(symbole);
	}

	/**
	 * Return true if the right part of the production is t1 t2, otherwise false
	 * 
	 * @param t1
	 *            the first non terminal symbol to test
	 * @param t2
	 *            the second non terminal symbol to test
	 * @return true if the right part of the production is t1 t2, otherwise
	 *         false
	 */
	public boolean contains(NonTerminal t1, NonTerminal t2){
		return false;
	}

	/**
	 * Return the string representation of the production
	 * 
	 * @return the string representation of the production
	 */
	public String toString(){
		return "-> "+this.symbole.toString();
	}

	/**
	 * Returns a hash code value for the object
	 * 
	 * @return the hash code value for the object
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbole == null) ? 0 : symbole.hashCode());
		return result;
	}

	/**
	 * Indicates whether some other object is "equal to" this one
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * 
	 * @return true if this object is the same as the obj argument, false
	 *         otherwise
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SymbolProduction other = (SymbolProduction) obj;
		 if (!symbole.equals(other.symbole))
			return false;
		return true;
	}
	
}
