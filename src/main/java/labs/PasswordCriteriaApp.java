package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCriteriaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Read the file
		String filename = "/Users/NIS1677m1/eclipse-workspace/mavenJavaProjArti1/src/main/java/files/PasswordCriteria.txt";
		
		File file = new File(filename);
		String passwordCriteria = null;
		String passwordsCriteria [] = new String [10];

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0;i<passwordsCriteria.length;i++)
			{	
				passwordsCriteria[i] = br.readLine();
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: File not found exception");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}
		
	for (int i=0;i<passwordsCriteria.length;i++) {
		
		passwordCriteria = passwordsCriteria[i];
		
		try {	
			
			if(passwordCriteria.matches("[a-zA-Z]*"))				
			{	
				throw new LettersException(passwordCriteria);
				
			}
			else if(passwordCriteria.matches("[a-zA-Z0-9]*")) {
				
				throw new SpecialCharactersException(passwordCriteria);
			}
			else if(passwordCriteria.matches("[a-zA-Z0-9@!#]*")){
				
			  System.out.println("Password matches criteria :"+passwordCriteria);
			}
			else {
				throw new DefaultPasswordCriteriaException(passwordCriteria);
			}
			
		}catch (LettersException e) {
			
			System.out.println("ERROR: Password has only letters, should have atleast one letter one number and one special character from these (@#!)");
			System.out.println(e.toString());
		}catch (SpecialCharactersException e) {
			
			System.out.println("ERROR: Password has only letters or numbers, should have atleast one letter one number and one special character from these (@#!)");
			System.out.println(e.toString());
		}catch (DefaultPasswordCriteriaException e) {
			
			System.out.println("ERROR: Password has special characters other than (!@#)\nShould have atleast one letter one number and one special character from these(@#!)");
			System.out.println(e.toString());
		}
	}			

	}

} // End of passwordCriteria app class


	class LettersException extends Exception {
		String passwordCriteria;
		LettersException(String passwordCriteria){
		this.passwordCriteria=passwordCriteria;
	}
	public String toString() {
		return ("Letters Exception "+passwordCriteria);
	}	
}
	
	
	class SpecialCharactersException extends Exception {
		String passwordCriteria;
		SpecialCharactersException(String passwordCriteria){
		this.passwordCriteria=passwordCriteria;
	}
	public String toString() {
		return ("Special Characters Exception "+passwordCriteria);
	}	
}
	class DefaultPasswordCriteriaException extends Exception {
		String passwordCriteria;
		DefaultPasswordCriteriaException(String passwordCriteria){
		this.passwordCriteria=passwordCriteria;
	}
	public String toString() {
		return ("Default Password Criteria Exception "+passwordCriteria);
	}	
}
	
