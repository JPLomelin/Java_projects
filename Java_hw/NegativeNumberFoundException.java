package sesion21;

@SuppressWarnings("serial")
public class NegativeNumberFoundException extends Exception {
	private double negativeNumber;
	
	public NegativeNumberFoundException(double n) {
		super("NegativeNumberFoundException");
		negativeNumber = n;
	}
	
	public String toString() {
		return getMessage() + "\nNegative number found: " + negativeNumber;
	}

	
	
	
	
}
