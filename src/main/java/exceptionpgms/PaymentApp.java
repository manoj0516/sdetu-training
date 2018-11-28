package exceptionpgms;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double payment =0;
	do {		
		//1. Ask user input
		System.out.println("Enter payment amount: ");
		
		//2. Store into payment variable from keyboard
		Scanner input = new Scanner (System.in);
		
		//3. Handle exceptions appropriately
		try {
				payment = input.nextDouble();
				if (payment<0) {
					//User defined Exception ****************************************************
					throw new NegativePaymentException(payment);
					//User defined Exception ****************************************************
				}
		}catch(NegativePaymentException e){
			
			System.out.println(e.toString());
			
		}
	}while(payment<0);
	
		//4. Print confirmation
	System.out.println("Your payment accepted "+payment);
	System.out.println("Thank YOU *****!!!!!!");

	}

}
