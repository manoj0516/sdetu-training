package introPgms;

public class NumbersCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting number calculation");
		
		int numA = 10;
		int numB = 20;
		
		//This will print name no parameters and no return type
		printName();
		
		//This will print result adding two numbers and no return type
		addNumbers(numA,numB);
		
		//This will return multiplication of two numbers
		int product = multiplyNumbers(numA,numB);
		
		System.out.println("The multiplication of two numbers is "+product);
		

	}

	static void printName() {
		
		System.out.println("This is John");
		
	}
	
	static void addNumbers(int numA, int numB) {
		
		int sum = numA + numB;
		System.out.println("This sum of numbers is "+sum);
	}
	
	static int multiplyNumbers(int numA, int numB) {
		
		return numA * numB;
		
	}
}
