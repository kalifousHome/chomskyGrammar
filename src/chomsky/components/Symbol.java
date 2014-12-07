package chomsky.components;

/**
 * Class that represents a terminal symbol of a grammar
 */

public class Symbol {

	private char name;

	/**
	 * Create the terminal symbol 'name'
	 * 
	 * @param name
	 *            the name of the terminal symbol
	 */
	public Symbol(char name) {
		this.name = name;
	}

	/**
	 * Return the name of the symbol into a char
	 * 
	 * @return the name of the symbol into a char
	 */
	public char getChar() {
		return name;
	}

	/**
	 * Return the name of the symbol into a String
	 * 
	 * @return the name of the symbol into a String
	 */
	public String toString() {
		return "" + name;
	}

	/**
	 * Returns a hash code value for the object
	 * 
	 * @return the hash code value for the object
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + name;
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
		Symbol other = (Symbol) obj;
		if (name != other.name)
			return false;
		return true;
	}
}
