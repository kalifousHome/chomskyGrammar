package chomsky.production;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

/**
 * Class that represents all the productions of a chomsky grammar
 */

public class Productions {

	protected Map<Production, Set<NonTerminal>> productions;

	/**
	 * Create a new empty set of productions
	 */
	public Productions() {
		this.productions = new HashMap<Production, Set<NonTerminal>>();
	}

	/**
	 * Add the t -> f production
	 * 
	 * @param t
	 *            the left non terminal symbol
	 * @param f
	 *            the right symbol
	 */
	public void add(NonTerminal t, Symbol f) {
		Production tmp = new SymbolProduction(f);
		Set<NonTerminal> lastSet = this.productions.get(tmp);

		if (lastSet == null) {
			lastSet = new HashSet<NonTerminal>();

			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		} else {
			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		}
	}

	/**
	 * Add the t -> t1 t2 production
	 * 
	 * @param t
	 *            the left non terminal symbol
	 * @param t1
	 *            the first right non terminal symbol
	 * @param t2
	 *            the second right non terminal symbol
	 */
	public void add(NonTerminal t, NonTerminal t1, NonTerminal t2) {
		Production tmp = new NonTerminalProduction(t1, t2);
		Set<NonTerminal> lastSet = this.productions.get(tmp);

		if (lastSet == null) {
			lastSet = new HashSet<NonTerminal>();

			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		} else {
			lastSet.add(t);
			this.productions.put(tmp, lastSet);
		}
	}

	/**
	 * return true if the production t -> f is in the productions, false
	 * otherwise
	 * 
	 * @param t
	 *            the left non terminal symbol
	 * @param f
	 *            the right symbol
	 * @return true if the production t -> f is in the productions, false
	 *         otherwise
	 */
	public boolean contains(NonTerminal t, Symbol f) {

		try {
			for (NonTerminal tmp : this.productions
					.get(new SymbolProduction(f))) {
				if (tmp != null) {
					if (tmp.equals(t))
						return true;
				} else if (tmp == null)
					return false;
			}
		} catch (NullPointerException e) {
		}
		return false;
	}

	/**
	 * return true if the production t -> t1 t2 is in the productions, false
	 * otherwise
	 * 
	 * @param t
	 *            the left non terminal symbol
	 * @param t1
	 *            the first right non terminal symbol
	 * @param t2
	 *            the second right non terminal symbol
	 * @return true if the production t -> f is in the productions, false
	 *         otherwise
	 */
	public boolean contains(NonTerminal t, NonTerminal t1, NonTerminal t2) {
		try {
			for (NonTerminal tmp : this.productions
					.get(new NonTerminalProduction(t1, t2))) {
				if (tmp.equals(t))
					return true;
			}
		} catch (NullPointerException e) {
		}
		return false;
	}

	/**
	 * Return the set of all possible left part (non terminal symbol) of the
	 * right part f
	 * 
	 * @param f
	 *            the symbol of the right part
	 * @return the set of all possible left part (non terminal symbol) of the
	 *         right part f
	 */
	public Set<NonTerminal> get(Symbol f) {
		return this.productions.get(new SymbolProduction(f));
	}

	/**
	 * Return the set of all possible left part (non terminal symbol) of all the
	 * right part of the set symbol
	 * 
	 * @param symbols
	 *            set of the symbol of the right part
	 * @return the set of all possible left part (non terminal symbol) of all
	 *         the right part of the set symbol
	 */
	public Set<NonTerminal> get(Set<Symbol> symbols) {
		Set<NonTerminal> tmp = new HashSet<NonTerminal>();

		for (Symbol s : symbols)
			tmp.addAll(this.get(s));

		return tmp;
	}

	/**
	 * Return the set of all possible left part (non terminal symbol) of the
	 * right part t1 t2
	 * 
	 * @param t1
	 *            the first right non terminal symbol
	 * @param t2
	 *            the second right non terminal symbol
	 * @return the set of all possible left part (non terminal symbol) of the
	 *         right part t1 t2
	 */
	public Set<NonTerminal> get(NonTerminal t1, NonTerminal t2) {
		return this.productions.get(new NonTerminalProduction(t1, t2));
	}

	/**
	 * Return the set of all possible left part (non terminal symbol) of all the
	 * right part of the two set
	 * 
	 * @param nonTerminaux
	 *            set of all 't1' right part
	 * @param nonTerminaux2
	 *            set of all 't2' right part
	 * @return the set of all possible left part (non terminal symbol) of all
	 *         the right part of the two set
	 */
	public Set<NonTerminal> get(Set<NonTerminal> nonTerminaux,
			Set<NonTerminal> nonTerminaux2) {
		Set<NonTerminal> tmp = new HashSet<NonTerminal>();

		for (NonTerminal X : nonTerminaux)
			for (NonTerminal Y : nonTerminaux2)
				if (this.get(X, Y) != null)
					tmp.addAll(this.get(X, Y));

		return tmp;
	}

}
