package org.array_collections;

import java.util.ArrayList;
import java.util.List;

public class Prgm9_Add {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		
		//Add a value 50 in the 2nd index and display the list after adding.
		l1.add(2, 50);
		System.out.println(l1);
		
		//Add a value 70 at the end of the list
		l1.add(8, 70);
		System.out.println("Adding 70 in end of list: "+l1);
		
		//Add a value 80 at the 8th index of list
		l1.add(8, 80);
		System.out.println("Adding 80 at 8th index: "+l1);
		
		//Add a value 100 at the last index of 10 in the list
		l1.add(10, 100);
		System.out.println("adding 100 at last index: "+l1);

	}

}
