package oop;

public class BankAccount implements IRate{
	
	//Define variables
	
	String accountNumber;
	private final static String routingNumber="054671";
	private String name;
	private String ssn;
	String accountType;
	double balance=0;
	
	
	//1.Constructors are used to intialize object properties and they are run once per object
	//2.while we are creating an object - constructors are called implicitly.
	//3.Constructors are same as class name
	//4. They dont have return type
	
	BankAccount(){
		
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	
	BankAccount(String accountType){
		
		System.out.println("NEW ACCOUNT CREATED : "+accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		
		System.out.println("NEW ACCOUNT CREATED : "+accountType);
		System.out.println("Initial Deposit : "+initDeposit);	
		String msg = null;
		if(initDeposit<1000) {
			msg = "ERROR: Min deposit should be $1000";
		}
		else {
			msg = "Thanks for the inital deposit of : $ "+initDeposit;
		}
		System.out.println(msg);
		balance = balance + initDeposit;
	}
	

	
	
	//Define methods - that is actions
	
	
	//Encapsulation - Getters and Setters
	
	public void setName (String name) {
		this.name = "Mr." + name;
	}
	
	public String getName () {
		return name;
	}
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASEING RATE");
	}

	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");	
	}
	
	private void showActivity(String activity) {
		
		System.out.println("Your recent transaction:" + activity);
		System.out.println("NEW BALANCE: "+balance);
		
	}
	void checkBalance() {
		
		System.out.println("Balance :"+balance);
		
	}
	
	void getStatus() {
		
		
	}
	
	@Override
	public String toString() {
		
		return "[Name : " +name+ " .ACCOUNT # " +accountNumber+ " ROUTING # " +routingNumber + ".BALANCE: $" +balance+"]";
	}
	

}
