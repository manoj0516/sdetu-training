package introPgms;

public class SalCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a var to define career
		
		//Declare a variable
		String career;
		
		System.out.println("Program is starting");
		
		//Defined a variable
		career = "Software Developer";
		
		System.out.println("My career: "+career);
		
		//Declare and Define a variable
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as "+career+" at the rate of $"+rate+" per hour is $"+salary+" per year.");
		
		
	}

}
