package chomsky.cellule;

import java.util.HashSet;
import java.util.Set;

import chomsky.components.NonTerminal;

/**
 * Class that represents a cell of the array used by the CYK algorithm Each cell
 * contains zero, one or many non terminal symbol
 */

public class Cell {

	private Set<NonTerminal> nonTerminaux;

	/**
	 * Create a new cell
	 */
	public Cell() {
		nonTerminaux = new HashSet<NonTerminal>();
	}

	/**
	 * Add a non terminal symbol to the cell
	 * 
	 * @param n
	 *            the non terminal symbol to add
	 */
	public void add(NonTerminal n) {
		nonTerminaux.add(n);
	}

	/**
	 * Add all the non terminal symbol of the set n to the cell
	 * 
	 * @param n
	 *            the non terminal symbol set to add
	 */
	public void addAll(Set<NonTerminal> n) {
		nonTerminaux.addAll(n);
	}

	/**
	 * Return true if and only if the cell contains the non terminal symbol n
	 * 
	 * @param n
	 *            the non terminal symbol to test
	 * @return true if and only if the cell contains n
	 */
	public boolean contains(NonTerminal n) {
		return nonTerminaux.contains(n);
	}

	/**
	 * Return true if and only if the cell contains all the non terminal symbol
	 * of the set n
	 * 
	 * @param n
	 *            the set of non terminal symbol to test
	 * @return true if and only if the cell contains all the symbols of n
	 */
	public boolean containsAll(Set<NonTerminal> n) {
		return nonTerminaux.containsAll(n);
	}

	/**
	 * Return the set of all the symbols contained by the cell
	 * 
	 * @return the set of all the symbols contained by the cell
	 */
	public Set<NonTerminal> getNonTerminaux() {
		return this.nonTerminaux;
	}
}
