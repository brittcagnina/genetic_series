package app.genes;

public class Constant extends AbstractFunction {
	
	private int value;
	
	public static void main(String[] args) {
		Constant c = new Constant(2);
		c.print();
		System.out.println(c.evaluate(7));
	}
	
	public Constant(int value) {
		this.value = value;
	}
	
	@Override
    public double evaluate(int n) {
		return value;
    }
    
	@Override
    public void print() {
    	System.out.println(getString());
    }

	@Override
	public String getString() {
    	return value + "";
	}
	
}
