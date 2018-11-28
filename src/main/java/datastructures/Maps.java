package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap random order of elements
		Map <Integer,String> hMap = new HashMap<Integer,String>();
		
		//LinkedHashMap - inserted order of elements
		//Map <Integer,String> hMap = new LinkedHashMap<Integer,String>();
		
		//TreeHashMap - Natural order of keys
		//Map <Integer,String> hMap = new TreeMap<Integer,String>();
		mapUtil(hMap);

	}
	
	
	public static void mapUtil(Map <Integer, String> map) {
		
		//Add Key-Value pairs
		map.put(101, "Steve");
		map.put(502, "Roger");
		map.put(35, "Steve");
		map.put(103, "Tom");
		
		//Expose or Access Elements
		System.out.println("See all keys "+map.keySet());
		System.out.println("See all key-value pairs: "+map);
		System.out.println(map.get(502));
		
	//Iterate through map of key-value pair
		for (int key:map.keySet()) {
			System.out.println("[KEY: "+key+" VALUE: "+map.get(key)+ "]");
		}
	}

}
