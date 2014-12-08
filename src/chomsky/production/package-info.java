/**
 * classes that represents the production of a chomsky grammar.
 * 
 * The classes that inherits Production class represent the right part of a production.
 * 
 * A production can be (NT for non terminal and F for final) :
 * NT -> F or NT -> NT NT
 * 
 * So two classes inherit Production :
 * - SymbolProduction for the NT -> F productions
 * - NonTerminalProduction for the  NT -> NT NT productions
 * 
 * The left part ( always NT ) is represented in the class Productions by the values of a map.
 * This map contains right parts of productions. 
 */

package chomsky.production;