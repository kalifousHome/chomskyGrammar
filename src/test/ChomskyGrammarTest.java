package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import chomsky.ChomskyGrammar;
import chomsky.components.Alphabet;
import chomsky.components.NonTerminal;
import chomsky.components.Symbol;
import chomsky.production.Productions;

public class ChomskyGrammarTest extends ChomskyGrammar{
	
		@Test
		public void testChomskyGrammarCreation(){
			NonTerminal axiom = new NonTerminal("S");
			NonTerminal nt = new NonTerminal("N");
			Symbol a = new Symbol('a');
			
			ChomskyGrammar cg1 = new ChomskyGrammar();			
			cg1.addNonTerminalSymbol(nt);
			cg1.addProduction(nt, a);
			cg1.addProduction(nt, nt, nt);
			cg1.addSymbolToAlphabet(a);
			cg1.setAxiom(axiom);
			
			
			Alphabet alpha = new Alphabet();
			alpha.add(a);
			Set<NonTerminal> nonTerminaux = new HashSet<NonTerminal>();
			nonTerminaux.add(nt);
			nonTerminaux.add(axiom);
			Productions productions = new Productions();
			productions.add(nt, a);
			productions.add(nt, nt, nt);
			ChomskyGrammar cg2 = new ChomskyGrammar(alpha, productions, nonTerminaux, axiom);
			
			
			assertEquals(cg1,cg2);
		}
		
		@Test
		public void testStringToSymbole(){
			Symbol a = new Symbol('a');
			Symbol b = new Symbol('b');
			Symbol c = new Symbol('c');
			
			this.addSymbolToAlphabet(a);
			this.addSymbolToAlphabet(b);
			this.addSymbolToAlphabet(c);
			
			Symbol[] symbols = this.stringToSymbole(new String("abca"));
			assertEquals(symbols[0],a);
			assertEquals(symbols[1],b);
			assertEquals(symbols[2],c);
			assertEquals(symbols[3],a);
			
			symbols = this.stringToSymbole(new String("abda"));
			assertEquals(symbols[0],a);
			assertEquals(symbols[1],b);
			assertNull(symbols[2]);
			assertEquals(symbols[3],a);
			
		}
		
		@Test
		public void testAccept(){

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

			assertFalse(cg.accept("baba"));
			assertTrue(cg.accept("aa"));
			assertTrue(cg.accept("bb"));
			assertTrue(cg.accept("aabbaabb"));
			assertFalse(cg.accept("aabbaa"));
			assertFalse(cg.accept("aabbaabbbb"));
			assertFalse(cg.accept("cc"));
			
		}

}
