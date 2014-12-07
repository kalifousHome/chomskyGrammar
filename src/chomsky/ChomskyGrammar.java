package chomsky;

import java.util.Set;

import chomsky.cellule.CellArray;
import chomsky.components.Alphabet;
import chomsky.components.NonTerminal;
import chomsky.components.Symbol;
import chomsky.production.Productions;

public class ChomskyGrammar {

	Alphabet alphabet;
	Productions productions;
	Set<NonTerminal> nonTerminaux;
	NonTerminal S;
	
	
	/*TODO : faire un constructeur vide et des fonctions pour remplir l'objet*/
	public ChomskyGrammar(Alphabet alphabet, Productions productions, Set<NonTerminal> nonTerminaux, NonTerminal S){
		this.alphabet = alphabet;
		this.productions = productions;
		this.nonTerminaux = nonTerminaux;
		this.S = S;
	}
	
	protected Symbol[] stringToSymbole(String word){
		int stringLength = word.length();
		
		Symbol[] symboles = new Symbol[stringLength];
		
		char[] letters = new char[stringLength];
		word.getChars(0, stringLength, letters, 0);
		
		for(int i = 0 ; i < stringLength ; i++)
			symboles[i] = this.alphabet.getSymbole(letters[i]);
		
		return symboles;
	}
	
	
    /*TODO : changer les indices dans Ens.Cell. au lieu de l'algo*/ 	
	public boolean accept(String word){
		Symbol[] a = stringToSymbole(word);
		int n = word.length();
		CellArray cells = new CellArray(n+1, n+1);
		
		for(int i = 1 ; i <= n ; i++)
			for(NonTerminal X : this.nonTerminaux)
				if(this.productions.contains(X, a[i-1]))
					cells.add(1, i, X);
		
		for(int l = 2 ; l <= n ; l++){
			for(int i = 1 ; i <= n-l+1 ; i++){
				for(int m = 1 ; m <= l-1 ; m++){
					
					cells.addAll(l, i, this.productions.get(cells.getNonTerminaux(m, i), cells.getNonTerminaux(l-m, i+m)));
					
				}
			}
		}
			
		return cells.contains(n, 1, S);
	}
	
}
