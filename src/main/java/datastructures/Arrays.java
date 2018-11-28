package datastructures;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alpha[] = {"a","b","c","d","e"};
		System.out.println("****Old fashion*************");
		for (int i =0;i<5;i++) {
			System.out.println(alpha[i]);
		}
		
		System.out.println("****Using length method*************");
		for(int n=0;n<alpha.length;n++) {
			System.out.println(alpha[n]);
		}
		
		System.out.println("****Using for - each statement*************");
		
		for (String letter:alpha) {
			System.out.println(letter);
		}
		
		System.out.println("Double Arrays 2D Arrays");
		
		String users[][] = {{"mk", "mk@tmail.com", "14524361"},
							{"nk", "nk@tmail.com", "652646235"},
							{"lk", "lk@tmail.com", "16532461"}};
		
		//Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		
		
		System.out.println("Number of users: "+numOfUsers);
		System.out.println("Number of fields: "+numOfFields);
		
		//Traversing the array
		System.out.println("*****Traversing the array*****");
		
		for (int i =0;i<numOfUsers;i++) {
			String name = users[i][0];
			String email = users[i][1];
			String phone = users[i][2];
			
			System.out.println(name+" "+email+" "+phone);
			
		}
			
		System.out.println("***Using For Each Statement******");
		for (String user[]:users) {
			
			for (String field : user) {
				
				System.out.print(field+" ");
				
			}
			System.out.println("");
		}
		
       }
}

