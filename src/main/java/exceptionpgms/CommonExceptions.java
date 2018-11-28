package exceptionpgms;

public class CommonExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 0;
		
		
		
	try {	
		int c = a/b;
		System.out.println(c);
	}catch (ArithmeticException e) {
		System.out.println("Cannot divide by zero");
		System.out.println(e.toString());	
	}
	
	String states[] = {"CA", "FL", "NY", "TX"};
	
	for (int i =0 ; i<=states.length;i++) {
		
		try {
			System.out.println(states[i]);
		}catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println("Array Index outside of domain");
			System.out.println(e.toString());
			
		}
		finally {
			System.out.println("Iterating through array "+i);
		}
	}
				

	}

}
