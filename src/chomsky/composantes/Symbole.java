package chomsky.composantes;

public class Symbole {

	private char name;
	/**
	 * @param name 
	 **/
	
	public Symbole(char name){
		this.name = name;
	}
	public char getChar(){
		return name;
	}
	public String toString()
	{
		return ""+name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + name;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Symbole other = (Symbole) obj;
		if (name != other.name)
			return false;
		return true;
	}
}
