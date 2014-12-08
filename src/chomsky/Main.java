package chomsky;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

public class Main {

	public static void main(String[] args) {

		Symbol a = new Symbol('a');
		Symbol b = new Symbol('b');

		NonTerminal S = new NonTerminal("S");
		NonTerminal A = new NonTerminal("A");
		NonTerminal B = new NonTerminal("B");

		ChomskyGrammar cg = new ChomskyGrammar();

		cg.addSymbolToAlphabet(a);
		cg.addSymbolToAlphabet(b);

		cg.addNonTerminalSymbol(A);
		cg.addNonTerminalSymbol(B);

		cg.setAxiom(S);

		cg.addProduction(A, a);
		cg.addProduction(A, S, S);
		cg.addProduction(B, b);
		cg.addProduction(B, S, S);
		cg.addProduction(S, A, A);
		cg.addProduction(S, B, B);

		System.out.println("false = "+cg.accept("baba"));
		System.out.println("true = "+cg.accept("aa"));
		System.out.println("true = "+cg.accept("bb"));
		System.out.println("true = "+cg.accept("aabbaabb"));
		System.out.println("false = "+cg.accept("aabbaa"));
		System.out.println("false = "+cg.accept("aabbaabbbb"));
	}

}
