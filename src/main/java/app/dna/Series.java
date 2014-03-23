package app.dna;

import app.genes.AbstractFunction;

public class Series {
	
	public Denominator denominator;
	
	public Numerator numerator;
	
	private int n;
	
	private boolean valid = false;
	
	public Series(Numerator numerator, Denominator denominator, int n) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.n = n;

		//Check to see if series is valid
		if(!this.denominator.hasZero()) {
			this.valid = true;
		}
	}
	
	public double eval() {
		double sum = 0;
		for(int i = 0; i < n; i++) {
			double num = 0;
			double denom = 0;
			for(AbstractFunction f : numerator.numerator) {
				//System.err.println(" num " + f.evaluate(i));
				num += f.evaluate(i);
			}
			for(AbstractFunction f : denominator.denominator) {
				//System.err.println(" denom " + f.evaluate(i));
				denom += f.evaluate(i);
			}
			sum += num/denom;
		}
		return sum;
	}
	
	public Series multiply(Series s) {
		return new Series(new Numerator(), new Denominator(), 0);
	}
	
	public Series reduce() {
		return new Series(new Numerator(), new Denominator(), 0);
	}
	
	public String toString() {
		String num = "";
		String denom = "";
		
		for(AbstractFunction f : numerator.numerator) {
			num += "(" + f.getString() + ")";
		}
		for(AbstractFunction f : denominator.denominator) {
			denom += "(" + f.getString() + ")";
		}
		return "\n" + num + "\n----\n" + denom + "\n";
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	public boolean isValid() {
		return valid;
	}
	
}
