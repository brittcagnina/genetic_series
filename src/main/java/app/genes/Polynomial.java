package app.genes;

public class Polynomial extends AbstractFunction {
	
	public static void main(String[] args) {
		Polynomial p = new Polynomial(1, 1, 0, 0);
		p.print();
		System.out.println(p.evaluate(2));
	}
	
	public Polynomial(int power, int multiple, int additional, int augmentation) {
		power(power);
		multiple(multiple);
		additional(additional);
		augmentation(augmentation);
	}
	
	@Override
    public double evaluate(int n) {
    	n = power(multiple() * n + additional(), power());
        double fact = n; // this  will be the result
        return fact + augmentation();
    }
    
	@Override
    public void print() {
    	System.out.println(getString());
    }

	@Override
	public String getString() {
    	String message = "";
    	String variable = "n";
    	if(multiple() != 1) {
    		variable = multiple() + variable;
    	}
    	if(additional() == 0) {
    		message += variable;
    	} else {
    		message += "(" + variable + " + " + additional() + ")";
    	}
    	if(power() != 1) {
    		message = message + "^" + power();
    	}
    	if(augmentation() != 0) {
    		message += " + " + augmentation();
    	}
    	return message;
	}
	
}
