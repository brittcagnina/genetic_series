package app.genes;


public class Factorial extends AbstractFunction {
	
	public static void main(String[] args) {
		Factorial m = new Factorial(2, 1, 0, 0);
		m.print();
		System.out.println(m.evaluate(2));
	}
	
	public Factorial(int power, int multiple, int additional, int augmentation) {
		power(power);
		multiple(multiple);
		additional(additional);
		augmentation(augmentation);
	}
	
	@Override
    public double evaluate(int n) {
    	n = power(n, power());
        double fact = 1; // this  will be the result
        for (int i = 1; i <= (n * multiple()) + additional(); i++) {
            fact *= i;
        }
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
    	if(power() != 1) {
    		variable = variable + "^" + power();
    	}
    	if(multiple() != 1) {
    		variable = multiple() + variable;
    	}
    	if(additional() == 0) {
    		message += variable + "!";
    	} else {
    		message += "(" + variable + " + " + additional() + ")!";
    	}
    	if(augmentation() != 0) {
    		message += " + " + augmentation();
    	}
    	return message;
	}
    
}
