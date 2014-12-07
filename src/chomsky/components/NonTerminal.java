package chomsky.components;

/**
 * Class that represents a non terminal symbol of a grammar
 */

public class NonTerminal {

	protected String name;

	/**
	 * Create the non terminal symbol 'name'
	 * 
	 * @param name
	 *            the name of the non terminal symbol
	 */
	public NonTerminal(String name) {
		this.name = name;
	}

	/**
	 * Return the name of the symbol into a String
	 * 
	 * @return the name of the symbol into a String
	 */
	public String toString() {
		return this.name;
	}

	/**
	 * Returns a hash code value for the object
	 * 
	 * @return the hash code value for the object
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		NonTerminal other = (NonTerminal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
