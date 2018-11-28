package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Define the File path we want to read
		String filename = "/Users/NIS1677m1/eclipse-workspace/mavenJavaProjArti1/src/main/java/files/File1.txt";
		String text=null;
		//2.Create the file(Object) in Java 
		
		File file = new File (filename);
		
		//3. Open the file 
		
		BufferedReader br;
		try {
			//3. Open the file 
			br = new BufferedReader(new FileReader(filename));
			//4. Read the file
			text = br.readLine();
			//5. Close the resources
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: File not found exception "+filename);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Could not read data from "+filename);
			e.printStackTrace();
		}finally {
			
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		
		

	}

}
