package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Create a collection
		
		ArrayList <String> cities = new ArrayList<String>();
		
		//2.Add some elements
		cities.add("Cleveland");
		cities.add("Toranto");
		cities.add("Chicago");
		cities.add("Miami");
		
		//3.Iterate through cities
		for(String city:cities) {
			System.out.println(city);
		}
		
		//4. Get the size of list
		int size = cities.size();
		System.out.println("Number of cities in list: "+size);
		
		//5. Retrieve the specific element
		System.out.println("City at zero index");
		System.out.println(cities.get(0));
		
		System.out.println("*****Removing city at zero index*******");
		//6. Remove a specific element
		cities.remove(0);
		size = cities.size();
		
		for(String city:cities) {
			System.out.println(city);
		}

	}

}
