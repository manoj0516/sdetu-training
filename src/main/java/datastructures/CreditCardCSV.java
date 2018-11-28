package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String[]> data = new ArrayList<String []>();
		
		String filename = "/Users/NIS1677m1/eclipse-workspace/mavenJavaProjArti1/src/main/java/files/creditcard.csv";
		String dataRow;
		double balance=0, amount=0;
		
		try {
			//Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			//Read the file as long as it's not empty
			while((dataRow = br.readLine())!=null) {
			//Parse the data by commas
				String line[] = dataRow.split(",");
				data.add(line);
				
			}
			//Close the file resources
			br.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: File not found exception "+filename);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		for(String transactions[]:data) {
			
			String date = transactions[0];

			String type = transactions[1];

			String vendor = transactions[2];

			amount = Double.parseDouble(transactions[3]);

			System.out.print(date + " " + type + " " + vendor + " " + amount);
			System.out.println("");
			
			if(type.equalsIgnoreCase("credit")) {

				//System.out.println("Add to bank");

				balance += amount;

				}

				else if(type.equalsIgnoreCase("debit")) {

				//System.out.println("Subtract from balance");

				balance -= amount;

				}

				else {

				System.out.println("Some other transaction");

				}

				
		}	
		
		System.out.println(" " + balance + "\n");
		
		//Check the balance

		if(balance > 0) {

		System.out.println("Your balance is : " + balance);

		System.out.println("You are charged 10% fee of balance " + balance * .10);

		System.out.println("Your new balance is : " + (balance+balance*.10));

		}

		else if(balance < 0) {

		System.out.println("Thanks for your payment");

		System.out.println("You have a payment pending of : -" + balance);

		}

		else {

		System.out.println("Thanks for your payment");

		}

	}

}
