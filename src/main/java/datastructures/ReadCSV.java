package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String[]> data = new ArrayList<String []>();
		
		String filename = "/Users/NIS1677m1/eclipse-workspace/mavenJavaProjArti1/src/main/java/files/accounts.csv";
		String dataRow;
		 
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
		
		
		for(String account[]:data) {
			System.out.print("[");
			for(String field:account) {
				System.out.print(field+" ");
			}
			System.out.println("]");
		}
		
	}

}
