package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This will read phone number from file
		//Valid Phone Number
		//10 digits
		//Area cannot start in 0 or 9
		//There can be 911
		
		String filename = "/Users/NIS1677m1/eclipse-workspace/mavenJavaProjArti1/src/main/java/files/PhoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum = br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: File not found exception");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Could not read file");
			e.printStackTrace();
		}
		
		try {
			if(phoneNum.length()!=10) {
				
				throw new TenDigitException(phoneNum);
			}
			
			if(phoneNum.substring(0,1).equals("0") || phoneNum.substring(0,1).equals("9")) {
				
				throw new AreaCodeException(phoneNum);
			}
			
			for(int n=0;n<phoneNum.length()-2;n++) {
				if(phoneNum.substring(n,(n+1)).equals("9")) {
					if(phoneNum.substring(n+1,(n+3)).equals("11"))
						throw new EmergencyException(phoneNum);
				}
				
			}
			System.out.println(phoneNum);
		}
		catch (TenDigitException e) {
			System.out.println("ERROR: Phone number is not ten digits");	
			System.out.println(e.toString());
		}catch (AreaCodeException e) {
			System.out.println("ERROR: Phone number has invalid area code");	
			System.out.println(e.toString());
		}catch (EmergencyException e) {
			System.out.println("ERROR: Invalid 911 sequence found");
			System.out.println(e.toString());
		}
	}
} // END OF PhoneNumberApp class *****************************************************************

		class TenDigitException extends Exception {
			String num;
			TenDigitException(String num){
				this.num=num;
			}
			public String toString() {
				return ("Ten digits Exception "+num);
			}
			
		}

			class AreaCodeException extends Exception{
				String num;
				AreaCodeException(String num){
					this.num=num;
				}
				public String toString() {
					return ("Area code exception "+num);
				}
	
			}

			class EmergencyException extends Exception{
				String num;
				EmergencyException(String num){
					this.num=num;
				}
				public String toString() {
					return ("Emergency exception "+num);
				}
	
					
	}


