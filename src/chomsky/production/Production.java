package chomsky.production;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

/**
 * Interface represent the right part of a production
 */

public interface Production {

	/**
	 * Return true if the right part of the production is the symbol, otherwise
	 * false
	 * 
	 * @param symbole
	 *            the symbol to test
	 * @return true if the right part of the production is the symbol, otherwise
	 *         false
	 */
	public boolean contains(Symbol symbole);

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
	public boolean contains(NonTerminal t1, NonTerminal t2);

	/**
	 * Return the string representation of the production
	 * 
	 * @return the string representation of the production
	 */
	public String toString();

	/**
	 * Returns a hash code value for the object
	 * 
	 * @return the hash code value for the object
	 */
	public int hashCode();

	/**
	 * Indicates whether some other object is "equal to" this one
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * 
	 * @return true if this object is the same as the obj argument, false
	 *         otherwise
	 */
	public boolean equals(Object obj);

}
