package exceptionpgms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pgm starts****");
		doMath(12,0);
		System.out.println("Pgm ends");

	}
	
	public static void doMath(int a, int b) {
		
		answer(a,b);
	}
	
	public static double answer (int x, int y) {
		return x/y;
	}

}
