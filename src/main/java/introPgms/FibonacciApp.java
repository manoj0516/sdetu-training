package introPgms;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(fib(6));

	}
	
	// Recursive method
	public static int fib(int n) {
		
		if (n==0) {
			
			return 0;
		}
		else if (n==1) {
			
			return 1;
		}
		
		return fib(n-1) + fib (n-2);
		
	}

}
