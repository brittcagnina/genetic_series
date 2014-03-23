package app;

import app.dna.Denominator;
import app.dna.Numerator;
import app.dna.Series;
import app.genes.Constant;
import app.genes.Polynomial;

public class Main {

	private double value = 3.1415;
	
	//Number of different GenerticSeries at any given time
	private int types = 5;
	
	//Number of selected GeneticSeries allowed to mutate at each generation
	private int selection = 4;
	
	//The terminating value for series summation
	private int n = 1;
	
	//Number of generational mutations
	private int iterations = 1000;
	
	public static void main(String[] args) {
		Main m = new Main();
		m.evolve();
		
		Numerator n = new Numerator();
		n.numerator.add(new Constant(1));
		
		Denominator d = new Denominator();
		d.denominator.add(new Polynomial(2, 1, 1, 0));
		d.denominator.add(new Polynomial(2, 1, 1, 0));
		
		Series s = new Series(n, d, 100);
		if(s.isValid()) {
			s.print();
			System.out.println(s.eval());	
		} else {
			System.err.println("**This Series Does Not Seem Valid**");
		}
		
	}
	
	public void evolve() {
		initMessage();
	}
	
	public void initMessage() {
		System.out.println(".::Evolution of Genetic Series for " + value + " has begun::.");
		System.out.println();
		System.out.println("*Parameters*");
		System.out.println("Species per generation: " + types);
		System.out.println("Selection per generation: " + selection);
		System.out.println("Number of generations: " + iterations);
		System.out.println("n = " + n);
		System.out.println();
		System.out.println("-------");
		System.out.println();
	}
	
}
