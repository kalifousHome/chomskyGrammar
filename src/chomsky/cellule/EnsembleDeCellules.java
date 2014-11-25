package chomsky.cellule;

import java.util.Set;

import chomsky.composantes.NonTerminal;

public class EnsembleDeCellules {

	private Cellule[][] tableauDeuxCellules;

	public EnsembleDeCellules(int l, int i) {
		tableauDeuxCellules = new Cellule[l][i];

		for (int l2 = 0; l2 < l; l2++)
			for (int i2 = 0; i2 < i; i2++)
				tableauDeuxCellules[l2][i2] = new Cellule();

	}

	public void add(int l, int i, NonTerminal n) {
		tableauDeuxCellules[l][i].add(n);

	}

	public boolean contains(int l, int i, NonTerminal n) {
		return tableauDeuxCellules[l][i].contains(n);
	}

	public Set<NonTerminal> getNonTerminaux(int l, int i) {
		return this.tableauDeuxCellules[l][i].getNonTerminaux();
	}
}
