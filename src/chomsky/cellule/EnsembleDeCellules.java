package chomsky.cellule;

import chomsky.composantes.NonTerminal;

public class EnsembleDeCellules {

	private Cellule[][] tableauDeuxCellules;

	public EnsembleDeCellules(int l, int i){
		tableauDeuxCellules = new Cellule[l][i];
			
	}
	public void add(int l ,int i, NonTerminal n){
	
		 tableauDeuxCellules[l][i]=new Cellule();
		 tableauDeuxCellules[l][i].add(n);
		
	}
	public boolean contains(int l, int i,NonTerminal n)
	{
		return   tableauDeuxCellules[l][i].contains(n);
	}
}
