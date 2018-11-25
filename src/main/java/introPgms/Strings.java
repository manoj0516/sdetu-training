package introPgms;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains("Rings")) {
			
			System.out.println("Found word : "+wordChoice);
			
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String ssn = "123456789";
		
		//Print the initials plus last four digits
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(ssn.substring(5));

	}

}
