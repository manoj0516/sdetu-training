package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount();
		//acc1.name = "Joe";
		acc1.setName("Joe");
		acc1.accountNumber = "23546725";
		acc1.balance = 5000;
		System.out.println(acc1.toString());
		System.out.println(acc1.getName());
		
		acc1.setSsn("554326353");
		System.out.println(acc1.getSsn());
		
		acc1.setRate();
		acc1.increaseRate();
	
		BankAccount acc2 = new BankAccount("Checking Account");
		
		BankAccount acc3 = new BankAccount("Checking Account", 500);
		
		acc3.checkBalance();
		
		//Demo for Inheritance
		
		CDAccount cd1 = new CDAccount();
		cd1.interestRate = "4.5";
		cd1.balance = 3000;
		//cd1.name = "Dwayne";
		//Encapsulation setting name 
		cd1.setName("Dwayne");
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		
		acc1.deposit(1000);
		
		acc1.deposit(3000);
		
		acc1.deposit(5000);
		
		acc1.withdraw(5000);
		
		

	}

}
