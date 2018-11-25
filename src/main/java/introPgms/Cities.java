package introPgms;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and define an array
		String cities[] = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//Declare and Define the array
		String states[] = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		System.out.println("******STATES********");
	/*	
		System.out.println(states[0]);
		System.out.println(states[1]);
		System.out.println(states[2]);
		System.out.println(states[3]);
		*/
		
	//Loops	-- do while loop and then other loops while and for
	int i=0;
	
	do {
		System.out.println("STATE: "+states[i]);
		i=i+1;	
	}while (i<5);
		
	}

}
