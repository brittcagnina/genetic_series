package app.genes;

public abstract class AbstractFunction {

	private int power = 1;
	
	private int multiple = 1;
	
	private int additional = 0;
	
	private int augmentation = 0;
	
	public abstract double evaluate(int x);
	
	public abstract void print();
	
	public abstract String getString();
	
    public int power(int value, int power) {
    	int result = 1;
    	for(int i = 0; i < power; i++) {
    		result *= value;
    	}
    	return result;
    }
    
    public void power(int power) {
    	this.power = power;
    }
    
    public int power() {
    	return this.power;
    }    
    
    public void multiple(int multiple) {
    	this.multiple = multiple;
    }
    
    public int multiple() {
    	return this.multiple;
    }    
    
    public void additional(int additional) {
    	this.additional = additional;
    }
    
    public int additional() {
    	return additional;
    }    
    
    public void augmentation(int augmentation) {
    	this.augmentation = augmentation;
    }
    
    public int augmentation() {
    	return this.augmentation;
    }    
	
}
