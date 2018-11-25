package introPgms;

public class FactorialApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(factorial(3));

	}
	
	// Recursive method
		public static int factorial(int n) {
			
			if (n==0) {
				
				return 1;
			}
			else if (n==1) {
				
				return 1;
			}
			
			return n * factorial(n-1);
			
		}

}
