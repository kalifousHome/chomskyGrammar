package chomsky.production;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

/**
 * Class that represents the right part of a NT -> NT NT production
 */

public class NonTerminalProduction implements Production {

	protected NonTerminal t1;
	protected NonTerminal t2;

	/**
	 * Create the right part NT -> t1 t2
	 * 
	 * @param t1
	 *            the first non terminal symbol
	 * @param t2
	 *            the second non terminal symbol
	 * @throws IllegalArgumentException
	 *             throws if one of non terminal symbol is null
	 */
	public NonTerminalProduction(NonTerminal t1, NonTerminal t2)
			throws IllegalArgumentException {
		if (t1 == null || t2 == null)
			throw (new IllegalArgumentException());
		this.t1 = t1;
		this.t2 = t2;
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
	public boolean contains(Symbol symbole) {
		return false;
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
	public boolean contains(NonTerminal t1, NonTerminal t2) {
		return this.t1.equals(t1) && this.t2.equals(t2);
	}

	/**
	 * Return the string representation of the production
	 * 
	 * @return the string representation of the production
	 */
	public String toString() {
		return "-> " + t1.toString() + t2.toString();
	}

	/**
	 * Returns a hash code value for the object
	 * 
	 * @return the hash code value for the object
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((t1 == null) ? 0 : t1.hashCode());
		result = prime * result + ((t2 == null) ? 0 : t2.hashCode());
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
		NonTerminalProduction other = (NonTerminalProduction) obj;
		if (!t1.equals(other.t1))
			return false;
		else if (!t2.equals(other.t2))
			return false;
		return true;
	}

}
