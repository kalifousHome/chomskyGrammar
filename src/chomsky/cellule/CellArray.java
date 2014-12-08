package chomsky.cellule;

import java.util.Set;

import chomsky.components.NonTerminal;

/**
 * Class that represents the array used by the CYK algorithm
 * This class manage the difference of the indices between algorithm and java array
 */

public class CellArray {

	private Cell[][] tableauDeuxCellules;

	/**
	 * Create an array of cells of two dimension
	 * 
	 * @param l
	 *            the first dimension
	 * @param i
	 *            the second dimension
	 */
	public CellArray(int l, int i) {
		tableauDeuxCellules = new Cell[l][i];

		for (int l2 = 0; l2 < l; l2++)
			for (int i2 = 0; i2 < i; i2++)
				tableauDeuxCellules[l2][i2] = new Cell();

	}

	/**
	 * Add the non terminal symbol n to cell[l][i]
	 * 
	 * @param l
	 *            the first dimension
	 * @param i
	 *            the second dimension
	 * @param n
	 *            the non terminal symbol to add
	 */
	public void add(int l, int i, NonTerminal n) {
		tableauDeuxCellules[l-1][i-1].add(n);
	}

	/**
	 * Add all the non terminal symbol of the set to the cell[l][i]
	 * 
	 * @param l
	 *            the first dimension
	 * @param i
	 *            the second dimension
	 * @param n
	 *            the set of non terminal symbol to add
	 */
	public void addAll(int l, int i, Set<NonTerminal> n) {
		tableauDeuxCellules[l-1][i-1].addAll(n);
	}

	/**
	 * Return true if and only if the cell[l][i] contains the non terminal
	 * symbol n
	 * 
	 * @param l
	 *            the first dimension
	 * @param i
	 *            the second dimension
	 * @param n
	 *            the non terminal symbol to test
	 * @return true if and only if the cell contains the non terminal symbol
	 */
	public boolean contains(int l, int i, NonTerminal n) {
		return tableauDeuxCellules[l-1][i-1].contains(n);
	}

	/**
	 * Return true if and only if the cell[l][i] contains all the non terminal
	 * symbol of the set n
	 * 
	 * @param l
	 *            the first dimension
	 * @param i
	 *            the second dimension
	 * @param n
	 *            the set of non terminal symbol to test
	 * @return true if and only if the cell contains all the non terminal symbol
	 *         of the set
	 */
	public boolean containsAll(int l, int i, Set<NonTerminal> n) {
		return tableauDeuxCellules[l-1][i-1].containsAll(n);
	}

	/**
	 * Return the set of all the symbols contained by the cell[l][i]
	 * 
	 * @param l
	 *            the first dimension
	 * @param i
	 *            the second dimension
	 * @return the set of all the symbols contained by the cell[l][i]
	 */
	public Set<NonTerminal> getNonTerminaux(int l, int i) {
		return this.tableauDeuxCellules[l-1][i-1].getNonTerminaux();
	}

}
