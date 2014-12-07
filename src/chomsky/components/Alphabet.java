package chomsky.components;

import java.util.HashSet;
import java.util.Set;

/**
 * Class that represents an alphabet of a grammar. An alphabet is a set of final
 * symbols
 */

public class Alphabet {

	private Set<Symbol> symboles;

	/**
	 * Create a new empty alphabet
	 */
	public Alphabet() {
		symboles = new HashSet<Symbol>();
	}

	/**
	 * Create an alphabet containing all the symbol of the set
	 * 
	 * @param set
	 *            set of symbol to add to the alphabet
	 */
	public Alphabet(Set<Symbol> set) {
		symboles = set;
	}

	/**
	 * Add the symbol s to the alphabet
	 * 
	 * @param s
	 *            the symbol to add
	 */
	public void add(Symbol s) {
		symboles.add(s);
	}

	/**
	 * Return the set of all the symbol of the alphabet
	 * 
	 * @return the set of all the symbol of the alphabet
	 */
	public Set<Symbol> getSet() {
		return symboles;
	}

	/**
	 * Return the symbol that is represented by the char s
	 * 
	 * @param s
	 *            the char that represents the symbol to search
	 * @return the symbol if one is found, null otherwise
	 */
	public Symbol getSymbole(char s) {
		for (Symbol symboleToReturn : symboles) {
			if (s == symboleToReturn.getChar())
				return symboleToReturn;
		}
		return null;
	}

	/**
	 * Return true if and only if the symbol s is in the alphabet
	 * 
	 * @param s
	 *            the symbol to test
	 * @return true if and only if the symbol is in the alphabet
	 */
	public boolean contains(Symbol s) {

		return symboles.contains(s);
	}
}
