package customexceptiondemo;

public class InsufficientBalanceException extends Exception {

	
	private static final long serialVersionUID = 1L;

	/**
	 * This will create InsufficientBalanceException object without error message
	 */
	public InsufficientBalanceException() {
		super();
	}
	
	/**
	 * This will create InsufficientBalanceException object with error message
	 */
	public InsufficientBalanceException(String errMsg) {
		super(errMsg);
	}
}
