package chomsky;

import java.util.Set;

import chomsky.cellule.EnsembleDeCellules;
import chomsky.composantes.Alphabet;
import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;
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
	
	protected Symbole[] stringToSymbole(String word){
		int stringLength = word.length();
		
		Symbole[] symboles = new Symbole[stringLength];
		
		char[] letters = new char[stringLength];
		word.getChars(0, stringLength, letters, 0);
		
		for(int i = 0 ; i < stringLength ; i++)
			symboles[i] = this.alphabet.getSymbole(letters[i]);
		
		return symboles;
	}
	
	
	public boolean acceptAvecDecalage(String word){
		Symbole[] a = stringToSymbole(word);
		int n = word.length();
		EnsembleDeCellules cells = new EnsembleDeCellules(n, n);
		
		/*Cette première boucle est testée et fonctionne*/
		for(int i = 0 ; i < n ; i++)
			for(NonTerminal X : this.nonTerminaux)
				if(this.productions.contains(X, a[i]))
					cells.add(0, i, X);
		
		/*Il y a des problèmes de décalage d'indice par rapport au sujet*/
		for(int l = 1 ; l < n ; l++){
			for(int i = 0 ; i < n-l+1 ; i++){
				for(int m = 0 ; m < l-1 ; m++){

					for(NonTerminal X : this.nonTerminaux){
						for(NonTerminal Y : cells.getNonTerminaux(m, i)){
							for(NonTerminal Z : cells.getNonTerminaux(l-m, i+m)){
								
								if(this.productions.contains(X, Y, Z)){
									cells.add(l, i, X);
								}
								
							}
						}
					}
					
				}
			}
		}
			
		return cells.contains(n-1, 0, S);
	}
	
	
	
	
	public boolean accept(String word){
		Symbole[] a = stringToSymbole(word);
		int n = word.length();
		EnsembleDeCellules cells = new EnsembleDeCellules(n+1, n+1);
		
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
