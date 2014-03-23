package app.dna;

import java.util.LinkedList;

import app.genes.AbstractFunction;

public class Denominator {

	public LinkedList<AbstractFunction> denominator;
	
	public Denominator() {
		denominator = new LinkedList<AbstractFunction>();
	}
	
	//Just checks the first few values
	public boolean hasZero() {
		boolean hasZero = false;
		for(AbstractFunction d : denominator) {
			for(int i = 0; i < 10; i++) {
				if(d.evaluate(i) == 0) {
					hasZero = true;
				}
			}
		}
		return hasZero;
	}

	public int getSize() {
		return denominator.size();
	}
	
}
