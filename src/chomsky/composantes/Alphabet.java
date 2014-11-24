package chomsky.composantes;

import java.util.Set;

public class Alphabet {

	/**
	 * @param args
	 */
	private Set<Symbole> symboles;
	
	public Alphabet(Set<Symbole> set ) {
		symboles = set ;
	}
	protected void add(Symbole s){
		
		symboles.add(s);
	}
	protected Set<Symbole> getSet(){
		return symboles;
	}
	protected Symbole getSymbole( char s){
		
		for (Symbole symboleToReturn :  symboles){
			if( s == symboleToReturn.getChar())
				return symboleToReturn;
		}		
		return null;
	}
}
