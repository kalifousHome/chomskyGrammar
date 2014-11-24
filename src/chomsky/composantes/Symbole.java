package chomsky.composantes;

public class Symbole {

	private char name;
	/**
	 * @param name 
	 **/
	
	Symbole(char name){
		this.name = name;
	}
	public String toString()
	{
		return ""+name;
	}
	public boolean equals(){
		return true;
	}
}
