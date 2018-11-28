package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define the collection -- HashSet class implements Set interface
		//No ordered insertion
		//Set<String> animals = new HashSet<String>();
		
		//If we want inserted ordered set then we define linked hash set
		//Set<String> animals = new LinkedHashSet<String>();
		
		//If we want alphabetical ordered set then we define linked hash set
		Set<String> animals = new TreeSet<String>();
		
		//Adding the elements
		animals.add("dog");
		animals.add("pig");
		animals.add("snake");
		animals.add("hog");
		animals.add("cat");
		
		//Watch for random order of elements
		System.out.println("*******Watch for random order of elements*******");
		System.out.println(animals);
		
		//Watch for non-duplicate elements
		System.out.println("*******Watch for non-duplicate elements*******");
		
		animals.add("snake");
		animals.add("goose");
		animals.add("cat");
		System.out.println(animals);
		
		System.out.println("Size of set " +animals.size());
		
		
		//Create a new set that we use for comparision
		
		Set<String> farmAnimals = new HashSet<String>();
		
		farmAnimals.add("chicken");
		farmAnimals.add("pig");
		farmAnimals.add("cow");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		//Inetersection between animals and farm animals
		
		//1. Copy existing set into new set
		System.out.println("****Intersection Set*********");
		Set <String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		System.out.println("***Farm Animals Set*****");
		System.out.println(farmAnimals);
		System.out.println("****intersectionSet.retainAll(farmAnimals);*********");
		//2. Retain only the farm animals from animals set
		intersectionSet.retainAll(farmAnimals);
		System.out.println(intersectionSet);
		
		//3. UNION ALL 
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union set is : "+unionSet);
		
		//4. What is the difference set animals minus farmAnimals
		
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		
		System.out.println("The difference set is : "+differenceSet);
			
	}

}
