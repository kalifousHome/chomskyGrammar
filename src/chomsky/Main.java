package chomsky;

import java.util.HashSet;
import java.util.Set;

import chomsky.composantes.Alphabet;
import chomsky.composantes.NonTerminal;
import chomsky.composantes.Symbole;
import chomsky.production.Productions;

public class Main {

	public static void main(String[] args) {
		
		Symbole a = new Symbole('a');
		Symbole b = new Symbole('b');
		
		Set<Symbole> set = new HashSet<Symbole>();
		set.add(a);
		set.add(b);	
		Alphabet alpha = new Alphabet(set);
		
		NonTerminal S = new NonTerminal("S");
		NonTerminal A = new NonTerminal("A");
		NonTerminal B = new NonTerminal("B");
		NonTerminal C = new NonTerminal("C");
		
		Set<NonTerminal> nonTerminaux = new HashSet<NonTerminal>();
		nonTerminaux.add(S);
		nonTerminaux.add(A);
		nonTerminaux.add(B);
		nonTerminaux.add(C);
		
		Productions productions = new Productions();
		productions.add(A, a);
		productions.add(A, C, C);
		productions.add(A, A, B);
		
		productions.add(B, b);
		productions.add(B, B, B);
		productions.add(B, C, A);
		
		productions.add(C, b);
		productions.add(C, B, A);
		productions.add(C, A, A);
		
		productions.add(S, A, B);
		productions.add(S, B, B);
		
		
		ChomskyGrammar cg = new ChomskyGrammar(alpha, productions, nonTerminaux, S);
		
		System.out.println(cg.accept("baba"));
	}

}
