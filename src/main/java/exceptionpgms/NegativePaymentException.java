package exceptionpgms;

public class NegativePaymentException extends Exception {
	
	double payment;
	
	public NegativePaymentException (double payment) {
		this.payment = payment;
	}
	
	public String toString() {
		return "ERROR: Cannot take negative payment "+payment;
	}

}
