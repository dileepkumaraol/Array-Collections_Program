package org.array_collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prgm13_Map {

	public static void main(String[] args) {

		Map<Integer, String> m=new LinkedHashMap<Integer, String>();
		m.put(100, "Java");
		m.put(500, "API");
		m.put(200, "Python");
		m.put(400, "Scrum");
		m.put(300, "Selenium");
		m.put(100, "React");
		
		System.out.println(m);

		//to get the size of the map
		int size = m.size();
		System.out.println(size);
		
		//to get a value using key
		String string = m.get(100);
		System.out.println(string);
		
		//to check whether the particular key is present or not
		boolean containsKey = m.containsKey(100);
		System.out.println(containsKey);
		
		//to check whether the particular value is present or not
		boolean containsValue = m.containsValue("Scrum");
		System.out.println(containsValue);
		
		//to display the key in the map
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		//to display the values in the map
		Collection<String> values = m.values();
		System.out.println(values);
		
		/*
		//to remove the values from the map
		m.remove(100);
		System.out.println(m);
		
		//to clean the entire map
		m.clear();
		System.out.println(m); */
		
		//to iterate the map convert it into a Set using entrySet() method
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			//System.out.println(entry);
			//System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}

}
