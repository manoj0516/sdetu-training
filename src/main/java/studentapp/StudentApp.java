package studentapp;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student ("Mahesh Kumar", "123456789");
		student1.enroll(new String []{"Math","Physics","Chemistry"});
		student1.enrolledCourses();
		student1.payingFees(6000);
		student1.checkBalance();
		
		Student student2 = new Student ("Mukesh", "123456791");
	
	}

}

class Student{
	
	
	//Instance Variables or properties
	
	private static int iD=1000;
	private String name;
	private String email;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String studentID;
	private String course[] = new String[3];
	private double payment;
	private double balanceFees;
	private static final double semesterFees=5000;
	
	
	
	//Constructor
	Student(String name, String SSN){
		
		this.name = name;
		this.SSN = SSN;
		iD++;
		setUniqueStudentID();
		
		
	}
	
	private void setUniqueStudentID()	{
		int random = (int) (Math.random()*1000);
		studentID = iD+ "" + random + SSN.substring(4,9);
		System.out.println("Your Student ID Number: "+studentID);
		showEmail();
	}
	
	
	public void showEmail() {
		this.email = ""+this.name.replaceAll(" ","_")+"@testmail.com";
		System.out.println("Your Email: "+email);
		
	}
	
	public void enroll(String course[]) {
		System.out.println("Enrolling courses");
		this.course = course;
	}
	public void enrolledCourses () {
		for (int i=0;i<course.length;i++)
			{
			System.out.print(course[i]+",");
			}
		System.out.println("");
	}
	
	public void payingFees(double payment) {
		
		this.payment = payment;
	}
	
	public void checkBalance() {
		if(semesterFees==payment) {
			System.out.println("Fees paid in full no due");
		}
		else if (payment<semesterFees) {
			balanceFees = semesterFees-payment;
			System.out.println("Partial Fees paid and remaining balance is: "+balanceFees);
			
		}
		else {
			balanceFees = payment-semesterFees;
			System.out.println("Overpaid Fees eligible for refund: "+balanceFees);
		}
		
	}
}
