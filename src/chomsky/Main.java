package chomsky;

import chomsky.components.NonTerminal;
import chomsky.components.Symbol;

public class Main {

	public static void main(String[] args) {

		/* Create the symbol of the alphabet */
		Symbol a = new Symbol('a');
		Symbol b = new Symbol('b');

		/* Create the non terminal symbol of the grammar */
		NonTerminal S = new NonTerminal("S");
		NonTerminal A = new NonTerminal("A");
		NonTerminal B = new NonTerminal("B");

		/* Create a new chomsky grammar */
		ChomskyGrammar cg = new ChomskyGrammar();

		/* Add the symbol to its alphabet */
		cg.addSymbolToAlphabet(a);
		cg.addSymbolToAlphabet(b);

		/* Add the non terminal symbols to the grammar */
		cg.addNonTerminalSymbol(A);
		cg.addNonTerminalSymbol(B);

		/* set the axiom (automatically add to the non terminal symbols) */
		cg.setAxiom(S);

		/* Add the productions to the grammar */
		cg.addProduction(A, a);
		cg.addProduction(A, S, S);
		cg.addProduction(B, b);
		cg.addProduction(B, S, S);
		cg.addProduction(S, A, A);
		cg.addProduction(S, B, B);

		/* Test the accept function */
		System.out.println("should be false : " + cg.accept("baba"));
		System.out.println("should be true : " + cg.accept("aa"));
		System.out.println("should be true : " + cg.accept("bb"));
		System.out.println("should be true : " + cg.accept("aabbaabb"));
		System.out.println("should be false : " + cg.accept("aabbaa"));
		System.out.println("should be false : " + cg.accept("aabbaabbbb"));
	}

}
