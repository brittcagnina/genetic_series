package app.dna;

import java.util.LinkedList;

import app.genes.AbstractFunction;

public class Numerator {
	
	public LinkedList<AbstractFunction> numerator;
	
	public Numerator() {
		numerator = new LinkedList<AbstractFunction>();
	}

	public int getSize() {
		return numerator.size();
	}
	
}
