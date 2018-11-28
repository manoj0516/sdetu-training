package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Define the path we want to write
		String filename = "/Users/NIS1677m1/eclipse-workspace/mavenJavaProjArti1/src/main/java/files/File2.txt";
		String message = "Writing data to file added data";
		
		//2. Create the file in Java
		
		File file = new File (filename);
		
		try {
			//3. Open the file 
			FileWriter fw = new FileWriter(file);
			//4. Write to the file
			fw.write(message);
			//5. Close the resources
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: could not read file "+file);
			e.printStackTrace();
		}finally {
			System.out.println("Closing the resources");
		}
		
		
		
		

	}

}
